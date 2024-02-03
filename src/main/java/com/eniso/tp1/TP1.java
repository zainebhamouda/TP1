/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp1;
import java.util.Scanner;

/**
 *exercice 1:
   Questions additionnelles:
    1)la difference entre la JVM et JDK:
   la JVM est responsable de l'exécution des programmes Java, tandis que le JDK est un ensemble complet d'outils de développement qui inclut la JVM
    2)Role de JVM dans l'éxecution du code java:
   JVM offre une couche d'abstraction entre le code Java et le système d'exploitation sous-jacent, facilitant la portabilité des applications Java tout en fournissant des mécanismes de gestion de la mémoire, de vérification de sécurité, d'exécution, et d'autres fonctionnalités cruciales pour l'exécution des programmes Java.
   
 
 */
public class TP1 {
    
    
    /*Exercice 2:*/
    public static void main(String[] args) {
        System.out.println("Bonjour ,mon premier TP en POO");
        
        System.out.println("Quelle est votre nom?");
        Scanner read = new Scanner (System.in);
        String name = read.next();
        System.out.println();
        System.out.println("bonjour  "+name);
        System.out.println("Quel est votre age "+name+"?");
        read = new Scanner(System.in);
        int a;
        a= read.nextInt();
        System.out.println(name+" votre age est "+a);
        
        /*exercic3*/
        int[][] Exemple={
            {1,2,3},
            {4,2,6},
            {3,8,1}
        
        };
        double[] Pro=calculateProbability(Exemple);
        for(int i=0;i<256;i++){
        
            System.out.println("La probabilité de "+i+" égale: "+Pro[i]);
            
        }
        
        
        /*pourquoi avons-nous utilisée des méthodes statiques?
        les méthodes ont été déclarées comme static pour permettre l'exécution sans avoir besoin d'instancier une instance de la classe
        */
    }
    
    
    
    
    public static double[] calculateProbability(int[][] image){
        
        
        int l=image.length;
        int c=image[0].length;
        int nb=0;
        double[] Pro=new double[256];
         
        
        
        for(int i=0;i<256;i++){
           for(int j=0;j<l;i++){
              for(int k=0;k<c;k++){
                  if(image[j][k]==i){
                     nb++;
                  }
              
              }           
           
            }
        Pro[i]=nb/(l*c);
        
      
        }
        
       
    return Pro;
     
    }
    public static double calculateEntropy(int [][] image ){
        
        double[] P = calculateProbability(image);
        double H=0;
        
        for (int i=0;i<256;i++){
            
           H+=(-P[i]*Math.log(P[i]));
        }
    
    
    
    
    return H;
    }
}