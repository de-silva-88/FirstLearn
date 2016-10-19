package com.demoapp.springstuff.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Path("/shapes")
public class DemoResource {

    @GET
    public void shapeService() {
        log.info("hello dear ....");
    }
}
