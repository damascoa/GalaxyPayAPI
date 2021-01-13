/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.galaxypayapi.app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Renato
 */
public class Utils {

    public static String formataData(Date data, String pattern) {
        DateFormat df = new SimpleDateFormat(pattern, new Locale("pt", "BR"));
        if (data != null) {
            return df.format(data);
        } else {
            return "";
        }
    }
}
