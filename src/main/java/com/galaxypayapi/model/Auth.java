/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.galaxypayapi.model;

import com.galaxypayapi.app.Constantes;

/**
 *
 * @author Renato
 */
public class Auth {

    private String galaxId;
    private String galaxHash;

    public Auth(String galaxId, String galaxHash) {
        this.galaxId = galaxId;
        this.galaxHash = galaxHash;
    }

    public String getGalaxId() {
        return galaxId;
    }

    public String getGalaxHash() {
        return galaxHash;
    }

}
