/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iut.eHealth.controller;

import com.iut.eHealth.dao.Doctorinfo_1Facade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import com.iut.eHealth.entity.Doctorinfo_1;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Raisa
 */
@Named(value = "doctorController")
@SessionScoped
public class DoctorController implements Serializable {

    /**
     * Creates a new instance of DoctorController
     */
    Doctorinfo_1 doctor_1;
    
    @EJB
    private Doctorinfo_1Facade doctorinfo_1Facade;
    
    public DoctorController() {
    }

    public Doctorinfo_1 getDoctor_1() {
        return doctor_1;
    }

    public void setDoctor_1(Doctorinfo_1 doctor_1) {
        this.doctor_1 = doctor_1;
    }
    
    public List<Doctorinfo_1> findAll(){
        return doctorinfo_1Facade.findAll();
    }
    
    
    
}
