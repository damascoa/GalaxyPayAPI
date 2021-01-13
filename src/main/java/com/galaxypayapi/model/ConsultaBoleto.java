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
    private String paymentBillIntegrationId;
    private String customerDocument;
    private String paymentBillInternalId;
    private String integrationId;

    public ConsultaBoleto(String value, String type) {
        if (type.equalsIgnoreCase("internalID")) {
            this.internalId = value;
        } else if (type.equalsIgnoreCase("paymentBillIntegrationId")) {
            this.paymentBillIntegrationId = value;
        } else if (type.equalsIgnoreCase("paymentBillInternalId")) {
            this.paymentBillInternalId = value;
        } else if (type.equalsIgnoreCase("integrationId")) {
            this.integrationId = value;
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

    public String getPaymentBillIntegrationId() {
        return paymentBillIntegrationId;
    }

    public void setPaymentBillIntegrationId(String paymentBillIntegrationId) {
        this.paymentBillIntegrationId = paymentBillIntegrationId;
    }

    public String getPaymentBillInternalId() {
        return paymentBillInternalId;
    }

    public void setPaymentBillInternalId(String paymentBillInternalId) {
        this.paymentBillInternalId = paymentBillInternalId;
    }

    public String getIntegrationId() {
        return integrationId;
    }

    public void setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
    }

}
