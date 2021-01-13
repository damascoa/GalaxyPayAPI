/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.galaxypayapi.model;

/**
 *
 * @author Renato
 */
public class Customer {

    //CPF // CNPJ
    private String document;
    private String name;
    private String email;
    private String phone;
    private String cellphone;
    private String password;
    private Boolean holdIss;
    private String municipalInscription;
    private Address Address;

    public Customer() {
    }

    public Customer(String document, String name, String email, String phone, Address address) {
        this.document = document;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.Address = address;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getHoldIss() {
        return holdIss;
    }

    public void setHoldIss(Boolean holdIss) {
        this.holdIss = holdIss;
    }

    public String getMunicipalInscription() {
        return municipalInscription;
    }

    public void setMunicipalInscription(String municipalInscription) {
        this.municipalInscription = municipalInscription;
    }

    public Address getAddress() {
        return Address;
    }

    public void setAddress(Address Address) {
        this.Address = Address;
    }

}
