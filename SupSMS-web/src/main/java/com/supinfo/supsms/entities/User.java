/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.supinfo.supsms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ThierryAxel
 */

@Entity
@Table

public class User {
    
    @Id
    @Column
    private int u_number;
    
    @Column
    private String u_firstName;
    
    @Column
    private String u_lastName;
    
    @Column
    private String u_address;
    
    @Column
    private int u_postal;
    
    @Column
    private String mail;
    
    @Column
    private String password;

    public User(int u_number, String u_firstName, String u_lastName, String u_address, int u_postal, String mail, String password) {
        this.u_number = u_number;
        this.u_firstName = u_firstName;
        this.u_lastName = u_lastName;
        this.u_address = u_address;
        this.u_postal = u_postal;
        this.mail = mail;
        this.password = password;
    }
    
    public User () {
    
    }
    
    public int getU_number() {
        return u_number;
    }

    public void setU_number(int u_number) {
        this.u_number = u_number;
    }

    public String getU_firstName() {
        return u_firstName;
    }

    public void setU_firstName(String u_firstName) {
        this.u_firstName = u_firstName;
    }

    public String getU_lastName() {
        return u_lastName;
    }

    public void setU_lastName(String u_lastName) {
        this.u_lastName = u_lastName;
    }

    public String getU_address() {
        return u_address;
    }

    public void setU_address(String u_address) {
        this.u_address = u_address;
    }

    public int getU_postal() {
        return u_postal;
    }

    public void setU_postal(int u_postal) {
        this.u_postal = u_postal;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
