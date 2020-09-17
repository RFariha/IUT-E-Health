/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iut.eHealth.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Raisa
 */
@Entity
@Table(name = "doctorinfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Doctorinfo_1.findAll", query = "SELECT d FROM Doctorinfo_1 d"),
    @NamedQuery(name = "Doctorinfo_1.findByName", query = "SELECT d FROM Doctorinfo_1 d WHERE d.name = :name"),
    @NamedQuery(name = "Doctorinfo_1.findById", query = "SELECT d FROM Doctorinfo_1 d WHERE d.id = :id")})
public class Doctorinfo_1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 30)
    @Column(name = "Name")
    private String name;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;

    public Doctorinfo_1() {
    }

    public Doctorinfo_1(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Doctorinfo_1)) {
            return false;
        }
        Doctorinfo_1 other = (Doctorinfo_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.iut.eHealth.entity.Doctorinfo_1[ id=" + id + " ]";
    }
    
}
