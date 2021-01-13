/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.galaxypayapi.app;

import com.galaxypayapi.model.Auth;
import com.galaxypayapi.model.Boleto;
import com.galaxypayapi.model.ConsultaBoleto;
import com.galaxypayapi.model.DataSend;
import com.galaxypayapi.model.returns.BoletoReturn;
import com.galaxypayapi.model.returns.ConsultaBoletoReturn;
import com.galaxypayapi.services.BoletoService;
import kong.unirest.Unirest;

/**
 *
 * @author Renato
 */
public class GalaxyPay {

    private BoletoService boletoService = new BoletoService();
    private Auth auth;

    public GalaxyPay(Auth auth) {
        auth = auth;
    }

    //CRIAR BOLETO
    public BoletoReturn createPaymentBillBoletoAndCustomer(Boleto boleto) {
        BoletoReturn bol = boletoService.createPaymentBillBoletoAndCustomer(new DataSend(auth, boleto));
        return bol;
    }

    //PEGAR DADOS DO BOLETO
    public ConsultaBoletoReturn getPaymentBillInfo(String internalID) {
        ConsultaBoletoReturn ret = boletoService.getPaymentBillInfo(new DataSend(auth, new ConsultaBoleto(internalID, "integrationId")));
        return ret;
    }

    public ConsultaBoletoReturn getPaymentBillsByCustomer(String cnpjcpf) {
        ConsultaBoletoReturn ret = boletoService.getPaymentBillsByCustomer(new DataSend(auth, new ConsultaBoleto(cnpjcpf, "document")));
        return ret;
    }

    public ConsultaBoletoReturn cancelPaymentBill(String paymentBillIntegrationId) {
        ConsultaBoletoReturn ret = boletoService.cancelPaymentBill(new DataSend(auth, new ConsultaBoleto(paymentBillIntegrationId, "paymentBillIntegrationId")));
        return ret;
    }
}
