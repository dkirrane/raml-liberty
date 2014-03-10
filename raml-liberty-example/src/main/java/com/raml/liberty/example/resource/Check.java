package com.raml.liberty.example.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("check")
public class Check {

    /**
     * Check it
     *
     * @return
     */
    @GET
    public Response getCheck() {
//        return Response.ok("check 1 2 3!").build();

        return Response.ok()
                .entity("check 1 2 3!")
                /* http://www.w3.org/TR/cors */
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Credentials", "true")
                .header("Access-Control-Expose-Headers", "content-length")
                .header("Access-Control-Max-Age", "1209600")
                .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, PATCH, OPTIONS, HEAD")
                .header("Access-Control-Allow-Headers", "Authorization,Content-Type,Accept,Origin,User-Agent,DNT,Cache-Control,X-Mx-ReqToken,Keep-Alive,X-Requested-With,If-Modified-Since")
                .build();
    }

}
