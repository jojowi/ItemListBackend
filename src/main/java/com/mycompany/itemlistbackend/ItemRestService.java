/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.itemlistbackend;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author jojow
 */
@Path("/items")
public class ItemRestService {

    public static List<Item> persons = new ArrayList<Item>();

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getItems() {
        return Response.ok(persons).header("Access-Control-Allow-Origin", "*").build();
    }

    

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServerFactory.create("http://localhost:8080/rest");
        server.start();
    }
}
