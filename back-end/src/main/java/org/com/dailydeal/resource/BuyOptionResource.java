package org.com.dailydeal.resource;

import org.com.dailydeal.domain.TipoOferta;
import org.com.dailydeal.model.BuyOption;
import org.com.dailydeal.model.Deal;
import org.com.dailydeal.service.BuyOptionService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Date;

@Path("/buyoption")
@Produces("application/json")
@Consumes("application/json")
public class BuyOptionResource {

    @Inject
    private BuyOptionService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/listAll")
    public Response listAll() {
        return Response.ok(service.listAll()).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/save")
    public Response save(BuyOption option) {
        return Response.ok(service.save(option)).build();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/save")
    public Response update(BuyOption option) {
        return Response.ok(service.update(option)).build();
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/delete")
    public Response delete(BuyOption option) {
        return Response.ok(service.delete(option)).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/sellUnit")
    public Response sellUnit(BuyOption option) {
        return Response.ok(service.sellUnit(option)).build();
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/model")
    public Response model() {
        BuyOption option = new BuyOption();
        option.setEndDate(new Date());
        option.setNormalPrice(111.0);
        option.setPercentDiscount(5.0);
        option.setQuantityCupom(150L);
        option.setSalePrice(110.0);
        option.setStartDate(new Date());
        option.setTitle("NOVO BUY OPTION");
        return Response.ok(option).build();
    }

}