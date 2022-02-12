package tp_classAbstract;
import java.util.ArrayList;

public class List_Ent {
	//Attribute
	ArrayList<Integer> tab = new ArrayList<Integer>();
	int taille ;
	
	//constructor
	List_Ent(int taille){
		this.taille = taille;
	}
	List_Ent(ArrayList<Integer> tab){
		this.tab = tab;
	}
	
	//Methodes
	void ajout(int elem) {
		tab.add(elem);
		
	}
	
	int recherche(int elemSearched) {
		for(int i :tab) {
			if(i==elemSearched) {
				return tab.indexOf(i);
				
			}
		}
		return -1;
		
	}
	
	public String toString() {
		
		return tab.toString() ;
		
	}
	void liste_Pleine()
	{
		if(tab.size() != 0) {
			System.out.print("List est Plein");
		}else {
			System.out.print("List est vide");
		}
		
	}
}
