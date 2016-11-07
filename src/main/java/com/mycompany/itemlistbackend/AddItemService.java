/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.itemlistbackend;

import javax.ws.rs.Consumes;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author jojow
 */

@Path("/additem")
public class AddItemService {
    @PUT
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.TEXT_PLAIN})
    public Response postPerson(Item pers) throws Exception {
        System.out.println(pers.getName());
        ItemRestService.persons.add(pers);
        return Response.ok("ok").header("access-control-allow-methods","GET,POST,PUT,DELETE").header("access-control-allow-origin","*").header("access-control-allow-headers","access-control-allow-origin,content-type").build();
    }
    
    @OPTIONS
    public Response options(){
        return Response.ok().header("access-control-allow-methods","GET,POST,PUT,DELETE").header("access-control-allow-origin","*").header("access-control-allow-headers","access-control-allow-origin,content-type").build();
    }
}
