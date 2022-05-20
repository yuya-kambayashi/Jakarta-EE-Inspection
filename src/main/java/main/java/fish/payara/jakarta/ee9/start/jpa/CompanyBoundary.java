/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.fish.payara.jakarta.ee9.start.jpa;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

/**
 *
 * @author yuya-kambayashi
 */
@Stateless
public class CompanyBoundary {
    
    @PersistenceContext()
    private EntityManager em;
    
    
    public Company findCompany(Long id){
        return em.find(Company.class, id);
    }
    
}