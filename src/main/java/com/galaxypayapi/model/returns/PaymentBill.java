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
public class PaymentBill {

    private String internalId;
    private String integrationId;
    private String periodicity;
    private String quantity;
    private String dateFirst;
    private String status;
    private String statusDescription;
    private String additionalInfo;
    private String urlCarne;
    private String infoBoleto;
    private String value;
    private String customerInternalId;
    private String customerIntegrationId;
    private String customerName;
    private String operator;
    private String operatorName;
    private List<Transaction> transactions = null;

    public PaymentBill() {
    }

    public String getInternalId() {
        return internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    public String getIntegrationId() {
        return integrationId;
    }

    public void setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDateFirst() {
        return dateFirst;
    }

    public void setDateFirst(String dateFirst) {
        this.dateFirst = dateFirst;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getUrlCarne() {
        return urlCarne;
    }

    public void setUrlCarne(String urlCarne) {
        this.urlCarne = urlCarne;
    }

    public String getInfoBoleto() {
        return infoBoleto;
    }

    public void setInfoBoleto(String infoBoleto) {
        this.infoBoleto = infoBoleto;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCustomerInternalId() {
        return customerInternalId;
    }

    public void setCustomerInternalId(String customerInternalId) {
        this.customerInternalId = customerInternalId;
    }

    public String getCustomerIntegrationId() {
        return customerIntegrationId;
    }

    public void setCustomerIntegrationId(String customerIntegrationId) {
        this.customerIntegrationId = customerIntegrationId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

}
