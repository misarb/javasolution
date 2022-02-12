package tp_classAbstract;
import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List_Ent L1;
		List_Ent L2;
		@SuppressWarnings("resource")
		Scanner scanner= new Scanner(System.in);
		int num ;
		L1 = new List_Ent (5) ;
		L2 = new List_Ent_trie(5,0) ;
		for (int i=0; i<5; i++)
		{ 
		System.out.print ("Donnez l’entier à ajouter : ");
		num = scanner.nextInt();
		L1.ajout (num) ;
		L2.ajout (num);
		}
		System.out.println ( L1.toString()) ;
		System.out.println (L2.toString ()) ;
		System.out.println (L2.recherche(0)) ;
		
		}
		
		
		
		
		

	}


