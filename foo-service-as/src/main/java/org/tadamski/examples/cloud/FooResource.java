package org.tadamski.examples.cloud;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/")
public class FooResource {

    private Map<String, Foo> foos = new HashMap<>();

    public FooResource(){
        foos.put("gyrd", new Foo("gyrd", 5));
    }

    @GET
    @Path("foo/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Foo findByName(@PathParam("name") String name) {
        return foos.get(name);
    }

}
