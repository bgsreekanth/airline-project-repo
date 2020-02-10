package com.abc.airlinesapp.gateway;

import java.util.ArrayList;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.apache.camel.util.toolbox.AggregationStrategies;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * This class routes request to the REST API end points of microservices
 * @author bgsre
 *
 */
@Component
@ConfigurationProperties(prefix="gateway")
public class ApplicationServicesRouter extends RouteBuilder {
    private String userserviceurl, flightsericedurl, reservationurl, paymenturl;

    private static final String REST_ENDPOINT=
            "http4:%s/api/greeting?httpClient.connectTimeout=1000&bridgeEndpoint=true&copyHeaders=true&connectionClose=true";

    @Override
    public void configure() {
        from("direct:user").streamCaching()
        .toF(REST_ENDPOINT, userserviceurl)
        .log("Response from Userservice microservice:${body}")
        .convertBodyTo(String.class)
        .end();

        from("direct:flight").streamCaching()
        .toF(REST_ENDPOINT, flightsericedurl)
        .log("Response from Flightservice microservice: + ${body}")
        .convertBodyTo(String.class)
        .end();

        from("direct:reservation").streamCaching()
        .toF(REST_ENDPOINT, reservationurl)
        .log("Response from Reservationservice microservice: + ${body}")
        .convertBodyTo(String.class)
        .end();

        from("direct:payment").streamCaching()
        .toF(REST_ENDPOINT, paymenturl)
        .log("Response from Paymentservice microservice: + ${body}")
        .convertBodyTo(String.class)
        .end();

        rest()
        .get("/gateway").enableCORS(true)
        .route()
        .multicast(AggregationStrategies.flexible()
                .accumulateInCollection(ArrayList.class))
        .parallelProcessing()
        .to("direct:user")
        .to("direct:flight")
        .to("direct:reservation")
        .to("direct:payment")
        .end()
        .marshal().json(JsonLibrary.Jackson)
        .convertBodyTo(String.class)
        .endRest();
    }

    public void setUserserviceurl(String userserviceurl) {
        this.userserviceurl = userserviceurl;
    }

    public void setFlightsericedurl(String flightsericedurl) {
        this.flightsericedurl = flightsericedurl;
    }

    public void setReservationurl(String reservationurl) {
        this.reservationurl = reservationurl;
    }

    public void setPaymenturl(String paymenturl) {
        this.paymenturl = paymenturl;
    }
}
