/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iut.eHealth.dao;

import com.iut.eHealth.entity.Doctorinfo_1;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Raisa
 */
@Stateless
public class Doctorinfo_1Facade extends AbstractFacade<Doctorinfo_1> {
    @PersistenceContext(unitName = "IUT_E-HealthPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Doctorinfo_1Facade() {
        super(Doctorinfo_1.class);
    }
    
}
