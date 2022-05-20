/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.fish.payara.jakarta.ee9.start.jpa;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


/**
 *
 * @author yuya-kambayashi
 */
public class CompanyResource {
    
    @Inject
    private CompanyService companyService;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Company getCompany(@PathParam("id") Long id){
        
        return companyService.findCompany(id);
    }
    
}
