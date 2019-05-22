package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("test")
public class TestController {

    @GET
    public Response get() {
        return Response.ok().type(MediaType.TEXT_PLAIN).entity("Hello, World!").build();
    }
}