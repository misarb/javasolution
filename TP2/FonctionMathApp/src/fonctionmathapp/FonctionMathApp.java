
package fonctionmathapp;

import java.util.Scanner;


public class FonctionMathApp {

   
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("entrer un entier");
    int n=sc.nextInt();
        System.out.println("factoriel est : "+Fonction_Math.factoriel(n));
        System.out.println("la somme de n premiers entiers est : "+Fonction_Math.somme(n));
        System.out.println("entrer un reel");
     double x=sc.nextDouble();
        System.out.println("la racine carrée de x est : "+Fonction_Math.racine(x));
        
    }//end main
    
}//end FonctionMathApp 
