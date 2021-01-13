/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.galaxypayapi.model;

import com.galaxypayapi.app.Utils;
import java.util.Date;

/**
 *
 * @author Renato
 */
public class Boleto {

    private String integrationId;
    private String typeBill = "sale";
    private String paymentType;

    private String payday;
    private String periodicity = "manual";

    private String value;
    private String quantity = "1";
    private String integrationIds;

    private String fineBoleto;
    //Porcentagem de juros ao mês.
    private String interestBoleto;
    private String infoBoleto;
    //percent //fixed
    private String typeConditionalDiscount;

    private Integer daysBeforePayDayDiscount = 1;

    private Customer Customer;

    public Boleto() {
    }

    public Boleto(String integrationId, String typeBill, String value, String fineBoleto, String interestBoleto, Customer Customer, String infoBoleto, Date dtVencimento, String idIntegracaoSistema) {
        this.integrationId = integrationId;
        this.typeBill = typeBill;
        this.value = value;
        this.fineBoleto = fineBoleto;
        this.interestBoleto = interestBoleto;
        this.Customer = Customer;
        this.infoBoleto = infoBoleto;
        this.payday = Utils.formataData(dtVencimento, "yyyy-MM-dd");
        this.integrationIds = idIntegracaoSistema;
    }

    public String getIntegrationId() {
        return integrationId;
    }

    public void setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
    }

    public String getTypeBill() {
        return typeBill;
    }

    public void setTypeBill(String typeBill) {
        this.typeBill = typeBill;
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    public String getPayday() {
        return payday;
    }

    public void setPayday(String payday) {
        this.payday = payday;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getFineBoleto() {
        return fineBoleto;
    }

    public void setFineBoleto(String fineBoleto) {
        this.fineBoleto = fineBoleto;
    }

    public String getInterestBoleto() {
        return interestBoleto;
    }

    public void setInterestBoleto(String interestBoleto) {
        this.interestBoleto = interestBoleto;
    }

    public Customer getCustomer() {
        return Customer;
    }

    public void setCustomer(Customer Customer) {
        this.Customer = Customer;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getIntegrationIds() {
        return integrationIds;
    }

    public void setIntegrationIds(String integrationIds) {
        this.integrationIds = integrationIds;
    }

    public String getInfoBoleto() {
        return infoBoleto;
    }

    public void setInfoBoleto(String infoBoleto) {
        this.infoBoleto = infoBoleto;
    }

    public Integer getDaysBeforePayDayDiscount() {
        return daysBeforePayDayDiscount;
    }

    public void setDaysBeforePayDayDiscount(Integer daysBeforePayDayDiscount) {
        this.daysBeforePayDayDiscount = daysBeforePayDayDiscount;
    }

    public String getTypeConditionalDiscount() {
        return typeConditionalDiscount;
    }

    public void setTypeConditionalDiscount(String typeConditionalDiscount) {
        this.typeConditionalDiscount = typeConditionalDiscount;
    }

}
