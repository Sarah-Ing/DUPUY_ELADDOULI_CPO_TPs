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
        // Création du menu 
       Scanner sc = new Scanner(System.in);
       int V = 0;
       
       System.out.println("Bonjour entrez une valeur : ");
       V = sc.nextInt();
       System.out.println ("Saisissez la conversion que vous souhaitez effectuer :\n 1) De Kelvin vers Celcius \n 2) De Celcius vers Kelvin \n 3) De Farenheit vers Celcius \n 4) De Celcius vers Farenheit \n 5) De Kelvin vers Farenheit \n 6) De Farenheit vers Kelvin");  
       int choix; 
       choix = sc.nextInt();
       
       if (choix == 1){
         double TC = V ; 
           double V1 = CelciusVersKelvin (TC);
       System.out.println ("Température des Celcius vers Kelvin : " + V1);   
       }
       else if (choix == 2) {
         double TK=V;

       double V2 = KelvinVersCelcius (TK);
       System.out.println("Température des Kelvin vers Celcius : " + V2);
    }
       else if (choix == 3){
         double TF=V;
       TF = sc.nextDouble ();
       double V3 = FarenheitVersCelcius (TF);
       System.out.println("Température des Farenheit vers Celcius : " + V3);
    }
       else if (choix == 4){
         double TC = V;
        double V4 = CelciusVersFarenheit (TC);
       System.out.println ("Température des Celcius vers Farenheit : " +V4);
    }
       else if (choix == 5){
        double TK=V;
        double V5 = KelvinVersFarenheit (TK);
       System.out.println ("Température des Kelvin vers Farenheit : " +V5);
    }
       else if (choix == 6){
        double TF=V;
        double V6 = FarenheitVersKelvin (TF);
       System.out.println ("Température des Farenheit vers Kelvin : " + V6);
    }
    
       // Code
      // double TC = 0 ; 
       //Scanner sc = new Scanner(System.in);
      // System.out.println ("Température en Celsius : " + TC);
       
       //TC = sc.nextDouble();
       // Calcul de la température Kelvin question 2
       //System.out.println ("Température en Kelvin : " +(TC+273.15) );
       
       //Calcul de la température Kelvin question 3 avec la fonction
       //double V1 = CelciusVersKelvin (TC);
       //System.out.println ("Température des Celcius vers Kelvin : " + V1);
       
       //Question 4 passage d'une température d'une unité à l'autre
       //Calcul de la température Kelvin en Celcius
       //double TK;
       //TK = sc.nextDouble ();
       //double V2 = KelvinVersCelcius (TK);
       //System.out.println("Température des Kelvin vers Celcius : " + V2);
       
       //Calcul de la température Farenheit vers Celcius
       //double TF;
       //TF = sc.nextDouble ();
       //double V3 = FarenheitVersCelcius (TF);
       //System.out.println("Température des Farenheit vers Celcius : " + V3);
       
       //Calcul de la température Celcius vers Farenheit 
      // double V4 = CelciusVersFarenheit (TC);
      // System.out.println ("Température des Celcius vers Farenheit : " +V4);
       
       //Calcul de la température Kelvin vers Farenheit
       //double V5 = KelvinVersFarenheit (TK);
       //System.out.println ("Température des Kelvin vers Farenheit : " +V5);
       
       //Calcul de la température Farenheit vers Kelvin
      // double V6 = FarenheitVersKelvin (TF);
      // System.out.println ("Température des Farenheit vers Kelvin : " + V6);
    }
     
    public static double CelciusVersKelvin (double tCelcius) {
      double Kelvin = 0 ;
      Kelvin = (tCelcius + 273.15) ;
      return Kelvin ;
 }
   public static double KelvinVersCelcius (double tKelvin) {
      double Celcius = 0 ;
      Celcius = (tKelvin + 273.15) ;
      return Celcius ;
    
   }
  public static double FarenheitVersCelcius (double tFarenheit) {
     double Celcius = 0 ; 
     Celcius = ((tFarenheit-32)*5/9);
     return Celcius ; 
  }
 public static double CelciusVersFarenheit (double tCelcius) {
     double Farenheit = 0;
     Farenheit = (9/5*tCelcius+32);
     return Farenheit ; 
 }
 public static double KelvinVersFarenheit (double tKelvin){
     double Farenheit = 0;
     double Celcius = 0;
     Celcius = KelvinVersCelcius (tKelvin);
     Farenheit = CelciusVersFarenheit (Celcius);
     
     return Farenheit;
 }
 public static double FarenheitVersKelvin (double tFarenheit){
     double Kelvin = 0;
     double Celcius = 0;
     Celcius = FarenheitVersCelcius (tFarenheit);
     Kelvin = CelciusVersKelvin (Celcius);
     
     return Kelvin;
 }
}


