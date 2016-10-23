package com.demoapp.springstuff.resource;

import com.demoapp.springstuff.domain.Triangle;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
@Path("/shapes")
public class DemoResource {

    @GET
    public void shapeService() {
        log.info("shape service invoked ..");
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        Triangle tr = (Triangle) ac.getBean("triangle");
        tr.draw();
    }
}
