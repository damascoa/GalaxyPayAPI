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
public class Transactions {

    private String internalId;
    private String integrationId;
    private String payday;
    private String installmentNumber;
    private String tid;
    private String additionalInfo;
    private String customerInternalId;
    private String customerIntegrationId;
    private String customerEmail;
    private String link;
    private String paymentBillInternalId;
    private String paymentBillIntegrationId;
    private String paymentBillAdditionalInfo;
    private String value;
    private String lastUpdateDate;
    private String status;
    private String statusDescription;
    private String isBoleto;
    private String boleto;
    private String boletoBankLine;
    private String boletoBankNumber;
    private String boletoEmissionDate;

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

    public String getPayday() {
        return payday;
    }

    public void setPayday(String payday) {
        this.payday = payday;
    }

    public String getInstallmentNumber() {
        return installmentNumber;
    }

    public void setInstallmentNumber(String installmentNumber) {
        this.installmentNumber = installmentNumber;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
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

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPaymentBillInternalId() {
        return paymentBillInternalId;
    }

    public void setPaymentBillInternalId(String paymentBillInternalId) {
        this.paymentBillInternalId = paymentBillInternalId;
    }

    public String getPaymentBillIntegrationId() {
        return paymentBillIntegrationId;
    }

    public void setPaymentBillIntegrationId(String paymentBillIntegrationId) {
        this.paymentBillIntegrationId = paymentBillIntegrationId;
    }

    public String getPaymentBillAdditionalInfo() {
        return paymentBillAdditionalInfo;
    }

    public void setPaymentBillAdditionalInfo(String paymentBillAdditionalInfo) {
        this.paymentBillAdditionalInfo = paymentBillAdditionalInfo;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
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

    public String getIsBoleto() {
        return isBoleto;
    }

    public void setIsBoleto(String isBoleto) {
        this.isBoleto = isBoleto;
    }

    public String getBoleto() {
        return boleto;
    }

    public void setBoleto(String boleto) {
        this.boleto = boleto;
    }

    public String getBoletoBankLine() {
        return boletoBankLine;
    }

    public void setBoletoBankLine(String boletoBankLine) {
        this.boletoBankLine = boletoBankLine;
    }

    public String getBoletoBankNumber() {
        return boletoBankNumber;
    }

    public void setBoletoBankNumber(String boletoBankNumber) {
        this.boletoBankNumber = boletoBankNumber;
    }

    public String getBoletoEmissionDate() {
        return boletoEmissionDate;
    }

    public void setBoletoEmissionDate(String boletoEmissionDate) {
        this.boletoEmissionDate = boletoEmissionDate;
    }

}
