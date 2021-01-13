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
public class ConsultaBoleto {

    private String internalId;

    private String customerDocument;

    public ConsultaBoleto(String value, String type) {
        if (type.equalsIgnoreCase("internalID")) {
            this.internalId = internalId;
        } else {
            this.customerDocument = value;
        }
    }

    public String getInternalId() {
        return internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    public String getCustomerDocument() {
        return customerDocument;
    }

    public void setCustomerDocument(String customerDocument) {
        this.customerDocument = customerDocument;
    }

}
