package com.abc.airlinesapp.flight;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import com.abc.airlinesapp.flight.service.FlightService;

/**
 * Camel router class implementing API routing to call FlightService methods. 
 * @author bgsre
 *
 */
@Component
public class FlightRoute extends RouteBuilder{

    @Override
    public void configure() {
        restConfiguration().component("servlet").bindingMode(RestBindingMode.json);

        rest("/flight").produces("application/json")
        .get("/hello/{name}").route().transform()
        .simple("Hello ${header.name}, Welcome to ABCAirlines.com").endRest()
        .get("/records/{name}")
        .to("direct:records")
        .get("/api/{name}")
        .to("direct:records");

        from("direct:records").process(new Processor() {

            @Override
            public void process(Exchange exchange) throws Exception {
                final String name = exchange.getIn().getHeader("name", String.class);
                exchange.getIn().setBody(new FlightService().findById(45));
            }
        });
    }	
}
