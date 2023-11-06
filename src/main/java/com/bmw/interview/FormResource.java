package com.bmw.interview;


import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

import java.util.UUID;

@Produces(MediaType.APPLICATION_JSON)
@Path("/interview-form")
public class FormResource {

    @Inject
    FormService service;

    private final Logger logger = Logger.getLogger(FormResource.class);

    @POST
    @Path("/form")
    public Form setData(Form form) {
        // Code required here.
    }

}
