/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.galaxypayapi.app;

import com.galaxypayapi.model.Address;
import com.galaxypayapi.model.Auth;
import com.galaxypayapi.model.Boleto;
import com.galaxypayapi.model.Customer;
import com.galaxypayapi.model.returns.BoletoReturn;
import com.galaxypayapi.model.returns.ConsultaBoletoReturn;
import com.google.gson.Gson;
import java.util.Date;

/**
 *
 * @author Renato
 */
public class App {

    public static void main(String[] args) {
        GalaxyPay galaxyPay = new GalaxyPay(new Auth(Constantes.galaxId, Constantes.galaxHash));
//
        Address address = new Address("38706321", "Rua maria da conceicao borges filha", "260", "Planalto", "Patos de Minas", "MG", "");
        Customer customer = new Customer("06558633035", "Renato", "email@meial.com", "34999753068", address);
        Boleto bol = new Boleto("1119788", "sale", "22.00", "2.50", "1.25", customer, "", new Date(), "158");
        BoletoReturn retorno = galaxyPay.createPaymentBillBoletoAndCustomer(bol);
        System.out.println(new Gson().toJson(retorno));

//////////////////////////////////////////////////////////////////////////
//                                  CONSULTA BOLETO                     //
/////////////////////////////////////////////////////////////////////////
//{"type":"true","paymentBillInternalId":"2784","message":"Contrato/Venda cadastrado com sucesso."}
//        ConsultaBoletoReturn retorno = galaxyPay.getPaymentBillInfo("2784");
//        System.out.println(retorno);
// CONSULTA POR CPF E CNPJ
//        ConsultaBoletoReturn retorno = galaxyPay.getPaymentBillsByCustomer("065.586.330-35");
//        System.out.println(new Gson().toJson(retorno));
//////////////////////////////////////////////////////////////////////////
//                                  CANCELAR BOLETO                     //
/////////////////////////////////////////////////////////////////////////
//        ConsultaBoletoReturn retorno = galaxyPay.cancelPaymentBill("1119786");
//        System.out.println(new Gson().toJson(retorno));
//        ConsultaBoletoReturn retorno = galaxyPay.getPaymentBillInfo("1119787");
//        System.out.println(new Gson().toJson(retorno));
    }
}
