/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laclassecongruenzadiamodulon;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class GestioneIO {

    public int inputOpzinoe() {
        Scanner s = new Scanner(System.in);
        System.out.println("<---List Options--->");
        System.out.println("1.Calc");
        System.out.println("2.Addizione");
        System.out.println("3.Moltiplicazione");
        System.out.println("4.Stampa la tavola");
        System.out.println("0.Exit");
        System.out.print("Input opzione: ");
        return s.nextInt();
    }

    public int inputValore(String simbolo) {
        Scanner s = new Scanner(System.in);
        System.out.print("Inserisci il valore [" + simbolo + "]: ");
        return s.nextInt();
    }

    public void stampaTavola(int input, String simbolo) {
        for (int i = 0; i <= input; i++) {

        }
    }
}
