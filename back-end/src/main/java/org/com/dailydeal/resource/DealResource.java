package org.com.dailydeal.resource;

import org.com.dailydeal.domain.TipoOferta;
import org.com.dailydeal.model.BuyOption;
import org.com.dailydeal.model.Deal;
import org.com.dailydeal.service.DealService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

@Path("/deal")
@Produces("application/json")
@Consumes("application/json")
public class DealResource {

    @Inject
    private DealService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/listAll")
    public Response listAll() {
        return Response.ok(service.listAll()).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/save")
    public Response save(Deal deal) {
        return Response.ok(service.save(deal)).build();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/save")
    public Response update(Deal deal) {
        return Response.ok(service.update(deal)).build();
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/delete")
    public Response delete(Deal deal) {
        return Response.ok(service.delete(deal)).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/addOption")
    public Response addOption(Map<String, Object> params) {
        Deal deal = (Deal) params.get("deal");
        BuyOption option = (BuyOption) params.get("option");
        return Response.ok(service.addOption(deal, option)).build();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/updateTotalSold")
    public Response updateTotalSold(Deal deal) {
        return Response.ok(service.updateTotalSold(deal)).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/model")
    public Response model() {
        Deal deal = new Deal();
        deal.setBuyOptions(new ArrayList<>());
        deal.setCreateDate(new Date());
        deal.setEndDate(new Date());
        deal.setPublishDate(new Date());
        deal.setText("MODEL");
        deal.setTitle("NEW MODEL");
        deal.setTotalSold(10L);
        deal.setType(TipoOferta.NOVA);
        deal.setUrl("get.com");
        return Response.ok(deal).build();
    }

}