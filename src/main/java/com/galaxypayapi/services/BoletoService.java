/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.galaxypayapi.services;

import com.galaxypayapi.app.Constantes;

import com.galaxypayapi.model.DataSend;
import com.galaxypayapi.model.returns.BoletoReturn;
import com.galaxypayapi.model.returns.ConsultaBoletoReturn;
import com.google.gson.Gson;
import kong.unirest.Unirest;

/**
 *
 * @author Renato
 */
public class BoletoService {

    public BoletoReturn createPaymentBillBoletoAndCustomer(DataSend boleto) {
        System.out.println(Constantes.apiURL + "createPaymentBillBoletoAndCustomer");
        System.out.println(new Gson().toJson(boleto));
        BoletoReturn bolRet = Unirest.post(Constantes.apiURL + "createPaymentBillBoletoAndCustomer")
                .body(boleto)
                .asObject(BoletoReturn.class).getBody();
        System.out.println(new Gson().toJson(bolRet));
        return bolRet;
    }

    public ConsultaBoletoReturn getPaymentBillInfo(DataSend boleto) {
        System.out.println(new Gson().toJson(boleto));
        ConsultaBoletoReturn retorno = Unirest.post(Constantes.apiURL + "getPaymentBillInfo")
                .body(boleto)
                .asObject(ConsultaBoletoReturn.class).getBody();

        System.out.println(new Gson().toJson(retorno));
        return retorno;
    }

    public ConsultaBoletoReturn getPaymentBillsByCustomer(DataSend boleto) {
        System.out.println(new Gson().toJson(boleto));
        String jsonRetorno = Unirest.post(Constantes.apiURL + "getPaymentBillsByCustomer")
                .body(boleto)
                .asString().getBody();
        System.out.println("RETORNO: " + jsonRetorno);
        ConsultaBoletoReturn retorno = new Gson().fromJson(jsonRetorno, ConsultaBoletoReturn.class);
        return retorno;
    }

}
