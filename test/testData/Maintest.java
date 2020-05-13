/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testData;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author tiago
 */
public class Maintest {
    public static void main(String[] args) {
        Calendar anoAtual = Calendar.getInstance();
        System.out.println(anoAtual.get(Calendar.YEAR));
    }
}
