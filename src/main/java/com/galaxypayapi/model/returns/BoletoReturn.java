/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.galaxypayapi.model.returns;

/**
 *
 * @author Renato
 */
public class BoletoReturn {

    private String type;
    private String paymentBillInternalId;
    private String message;

    public BoletoReturn() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPaymentBillInternalId() {
        return paymentBillInternalId;
    }

    public void setPaymentBillInternalId(String paymentBillInternalId) {
        this.paymentBillInternalId = paymentBillInternalId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
