/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.fish.payara.jakarta.ee9.start.jpa;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

/**
 *
 * @author yuya-kambayashi
 */
@ApplicationScoped
@Transactional
public class CompanyService {
    
    @PersistenceContext()
    private EntityManager entityManager;
    
    
    public Company findCompany(Long id){
        return entityManager.find(Company.class, id);
    }
    
}
