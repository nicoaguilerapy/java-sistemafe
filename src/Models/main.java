/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Forms.Jprincipal;

/**
 *
 * @author USUARIO
 */
public class main {

    private static Jprincipal jPrincipal;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        jPrincipal = new Jprincipal();
        jPrincipal.setLocationRelativeTo(null);
        jPrincipal.setVisible(true);
    }

}
