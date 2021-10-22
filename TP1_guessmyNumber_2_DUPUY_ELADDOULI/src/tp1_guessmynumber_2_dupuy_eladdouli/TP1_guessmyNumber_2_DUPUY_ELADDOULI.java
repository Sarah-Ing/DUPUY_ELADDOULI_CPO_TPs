/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_2_dupuy_eladdouli;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sarah
 */
public class TP1_guessmyNumber_2_DUPUY_ELADDOULI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             
      Random generateurAleat = new Random();
      Scanner sc = new Scanner(System.in);
      
     
//générateur de nombres aléatoires nommé generateurAleat
      int n = generateurAleat.nextInt(100); 
      int s = 0; //valeur que rentre lutilisateur
      
        System.out.println (n);
        System.out.println ("saisir un nombre entre 0 et 100 : ");
        s = sc.nextInt();
        System.out.println (s);
        
        if (s<n)
        {
        System.out.println ("Trop petit");
        }
        
        if (s==n)
        {
        System.out.println ("Gagné !");
        }
    
        if (s>n)
        {
        System.out.println ("Trop grand");
        }
        
        
        int D = 0;
        System.out.println ("Niveau de difficulté, \n1 (niveau facile), \n2 (niveau normal), \n3 (niveau difficile) : ");
        D = sc.nextInt();
        
        
        if (D==1)
        {
        
        int e = 0; // new valeur 
        System.out.println ("Saisir un NOUVEAU nombre entre 0 et 100 : ");
        e = sc.nextInt();
        
        int compteur = 0;
        
        while (e!= n)
        {
        if (e<n)
        {
        System.out.println ("Trop petit");
        System.out.println ("Nouvel essai : ");
        e = sc.nextInt();
        compteur = compteur +1;
        }
    
        if (e>n)
        {
        System.out.println ("Trop grand");
        System.out.println ("Nouvel essai : ");
        e = sc.nextInt();
        }

         if (e==n)
        {
        System.out.println ("Gagné !");
        }
        }
        
         System.out.println ("Nombre de tentatives exécutées : " + compteur);
        
        }
        
        if (D==2)
        {
        
        int e = 0; // new valeur 
        System.out.println ("Saisir un NOUVEAU nombre entre 0 et 100 : ");
        e = sc.nextInt();
        
        int compteur = 0;
        
        while (e!= n)
        {
        if (e<n)
        {
        System.out.println ("Trop petit");
        System.out.println ("Nouvel essai : ");
        e = sc.nextInt();
        compteur = compteur +1;
        }
    
        if (e>n)
        {
        System.out.println ("Trop grand");
        System.out.println ("Nouvel essai : ");
        e = sc.nextInt();
        }

         if (e==n)
        {
        System.out.println ("Gagné !");
        }
        }
        
         System.out.println ("Nombre de tentatives exécutées : " + compteur);
        
        }
        if (D==3)
        {
        
        int e = 0; // new valeur 
        System.out.println ("Saisir un NOUVEAU nombre entre 0 et 100 : ");
        e = sc.nextInt();
        
        int compteur = 0;
        
        while (e!= n)
        {
        if (e<n)
        {
        System.out.println ("Trop petit");
        System.out.println ("Nouvel essai : ");
        e = sc.nextInt();
        compteur = compteur +1;
        }
    
        if (e>n)
        {
        System.out.println ("Trop grand");
        System.out.println ("Nouvel essai : ");
        e = sc.nextInt();
        }

         if (e==n)
        {
        System.out.println ("Gagné !");
        }
        }
        
         System.out.println ("Nombre de tentatives exécutées : " + compteur);
        
        }
        
        
        
        
    }
    
     
 
}
