/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_dupuy_eladouli;

import java.util.Scanner;

/**
 *
 * @author ROXANA
 */
public class TP1_convertisseur_DUPUY_ELADOULI {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
           double TC = 0 ; 
       Scanner sc = new Scanner(System.in);
       System.out.println ("Température en Celsius : " + TC);
       
       TC = sc.nextDouble();
       System.out.println ("Température en Kelvin " +(TC+273.15) );
              
    }
     
    public static double CelciusVersKelvin (double tCelcius) {
      double Kelvin = 0 ;
      Kelvin = (tCelcius + 273.15) ;
      return Kelvin ;
 }
   
}


