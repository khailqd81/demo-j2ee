package com.example.demo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hello-world")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }

    @GET
    @Path("/json")
    @Produces("application/json")
    public Student helloJSON() {
        Student st = new Student(20,"Khai","Dong Nai");
        return st;
    }

    @POST
    @Path("/post-demo")
    @Produces("application/json")
    @Consumes(MediaType.APPLICATION_JSON)
    public Student postJSON(Student st) {
        st.setId(21);
        System.out.println(st);
        return st;
    }

    @POST
    @Path("/post-demo")
    @Produces("application/json")
    @Consumes(MediaType.APPLICATION_JSON)
    public Student addStudent(Student st) {
        st.setId(21);
        System.out.println(st);
        return st;
    }
}