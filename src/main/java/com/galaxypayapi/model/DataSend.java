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
public class DataSend {

    private Auth Auth;
    private Object Request;

    public DataSend(Auth auth, Object request) {
        this.Auth = auth;
        this.Request = request;
    }

    public Auth getAuth() {
        return Auth;
    }

    public void setAuth(Auth auth) {
        this.Auth = auth;
    }

    public Object getRequest() {
        return Request;
    }

    public void setRequest(Object Request) {
        this.Request = Request;
    }

}
