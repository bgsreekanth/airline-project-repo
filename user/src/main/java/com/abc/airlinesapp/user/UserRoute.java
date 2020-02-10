package com.abc.airlinesapp.user;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import com.abc.airlinesapp.user.service.UserService;

/**
 * Camel router class implementing API routing to call UserService methods.
 * @author bgsre
 *
 */
@Component
public class UserRoute extends RouteBuilder {	

    @Override
    public void configure() {
        restConfiguration().component("servlet").bindingMode(RestBindingMode.json);

        rest("/user").produces("application/json")
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
                exchange.getIn().setBody(new UserService().findById(45));
            }
        });
    }	
}
