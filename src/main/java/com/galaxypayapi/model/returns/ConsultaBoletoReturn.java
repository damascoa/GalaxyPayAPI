/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.galaxypayapi.model.returns;

import java.util.List;

/**
 *
 * @author Renato
 */
public class ConsultaBoletoReturn {

    private Boolean type;
    private PaymentBill paymentBill;
    private List<PaymentBill> paymentBills;

    public ConsultaBoletoReturn() {
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public PaymentBill getPaymentBill() {
        return paymentBill;
    }

    public void setPaymentBill(PaymentBill paymentBill) {
        this.paymentBill = paymentBill;
    }

    public List<PaymentBill> getPaymentBills() {
        return paymentBills;
    }

    public void setPaymentBills(List<PaymentBill> paymentBills) {
        this.paymentBills = paymentBills;
    }

}
