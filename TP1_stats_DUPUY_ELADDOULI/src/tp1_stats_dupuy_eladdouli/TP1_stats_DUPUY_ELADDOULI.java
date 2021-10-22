/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_dupuy_eladdouli;

import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author sarah
 */
public class TP1_stats_DUPUY_ELADDOULI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // L’objectif de cet exercice est vérifier si la distribution de nombres du générateur de nombre aléatoire est bien aléatoire, en simulant un lancer de dés à répétition.
        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);
        
        int m = 0;
        int s =0;
        
        int [] Tab = new int[5]; 
        System.out.println ("Saisir un nombre entier : ");
        m = sc.nextInt();
    
        for (int i=1; i <= m; i++) 
        {  
            s = generateurAleat.nextInt(5); 
            Tab[s]++;
            
           //System.out.println (Tab[s]);
        }
        double d = 0;
        
        for (int j = 0; j <= 5; j++) 
        {
        d = (Tab[j]*100)/m;
        System.out.println (d);
        }
         
    }
    
}
