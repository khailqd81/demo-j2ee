package com.example.demo;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/student")
public class StudentResource {
    private StudentService studentService = StudentService.getInstance();


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getList() {
        return studentService.getList();
    }

    @GET
    @Path("{id}")
    @Produces("application/json")
    public Student getById(@PathParam("id") int id) {
        Student st = studentService.getById(id);
        return st;
    }


    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Student addStudent(Student st) {
        return studentService.add(st);
    }
}
