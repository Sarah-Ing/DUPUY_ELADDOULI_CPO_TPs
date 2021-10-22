/*
 * TP1 : Syntaxe de Base
 * EL ADDOULI  Sarah
 * DUPUY Roxanna
 * 08/10/2021
 */
package tp1_manipnombresint_dupuy_eladdouli;

import java.util.Scanner; // ne pas oublier de l'ecrire   

/**
 *
 * @author sarah
 */
public class TP1_manipNombresInt_DUPUY_ELADDOULI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int V1;
        double V2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println ("Entiers 1 : ");
       
        V1 = sc.nextInt();
        
     System.out.println( "Résultat : " + V1);
     
     
     
      System.out.println ("Entiers 2 : ");
      V2 = sc.nextDouble();
      System.out.println ("Entiers 2 : " + V2);
      //System.out.println ("Somme des deux entiers = " + (V1+V2));
      // System.out.println ("Différence des deux entiers = " + (V1-V2));
      //System.out.println ("Produit des deux entiers = " + (V1*V2));
      System.out.println ("Quotient des deux entiers = " + (V1/V1) +"et reste de la division euclidienne = " + (V1%V2));
      
    }
    
      
}
