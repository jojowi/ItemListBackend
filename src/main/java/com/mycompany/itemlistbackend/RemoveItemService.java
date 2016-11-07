/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.itemlistbackend;

import static com.sun.jersey.api.model.Parameter.Source.PATH;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author jojow
 */
@Path("/removeitem")
public class RemoveItemService {
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.TEXT_PLAIN})
    public Response postPerson(Item pers) throws Exception {
        ItemRestService.persons.removeIf((Item i) -> pers.getId()==i.getId()&&pers.getName().equals(i.getName())&&i.getPrice()==pers.getPrice() );
        return Response.ok("ok").header("access-control-allow-methods","GET,POST,PUT,DELETE").header("access-control-allow-origin","*").header("access-control-allow-headers","access-control-allow-origin,content-type").build();
    }
    
    @OPTIONS
    public Response options(){
        return Response.ok().header("access-control-allow-methods","GET,POST,PUT,DELETE").header("access-control-allow-origin","*").header("access-control-allow-headers","access-control-allow-origin,content-type").build();
    }
}
