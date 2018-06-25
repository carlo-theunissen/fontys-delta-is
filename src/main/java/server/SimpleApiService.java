package server;

import com.google.gson.Gson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/server")
public class SimpleApiService {
    @GET
    @Path("/new")
    public Response getStatus() {
        return Response.status(200).build();
    }



}
