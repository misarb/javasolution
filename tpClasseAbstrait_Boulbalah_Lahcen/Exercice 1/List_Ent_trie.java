package tp_classAbstract;

//import java.util.Collections;


public class List_Ent_trie extends List_Ent {
	int order ;

	List_Ent_trie(int taille ,int order) {
		super(taille);
		this.order = order;
		
	}
	
	// methode
	void ajout(int elemAjoute) {
		super.tab.add(elemAjoute);
		/*
		 * utiliser methode deja defini 
		 * 
		 * if(order == 0) {
			Collections.sort(super.tab);
		}else {
			//decroissent
			Collections.sort(super.tab,Collections.reverseOrder());
		}*/
		
		// on recrire les methode de trie
		
			
			for(int i=0;i<super.tab.size();i++) {
				for(int j=i+1;j<super.tab.size();j++) {
					int tempI = super.tab.get(i);
					int tempJ = super.tab.get(j);
					if(order == 0 ) {
						// order croissent
						if(tempI>tempJ) {
							super.tab.set(i, tempJ);
							super.tab.set(j, tempI);
						}
					}else {
							// order decroissent
							if(tempI<tempJ) {
								super.tab.set(j, tempI);
								super.tab.set(i, tempJ);
						}
					}
			}
			
			}
		
		
		}
	
	int recherche(int elemSearch) {
		// Dichotomique Algorithme
		// on peut utiliser la fonction Arrays.binarySearch(List,elemenRecherche);
		//NB: avant utiliser cette methode il faut appeler trie methode "ajout()"
		int t = super.tab.size() ;
		int startList = 0 , endList = t , milieu;
		int index = -1;
		do {
			milieu = (endList + startList)/2;
			if(elemSearch ==super.tab.get(milieu) ) {
				index = milieu +1;
			}else if(super.tab.get(milieu)<elemSearch) {
				startList = milieu +1;
			}else {
				endList = milieu -1;
			}
			
		}while(elemSearch !=super.tab.get(milieu) && startList<=endList);
			
		return index ;
		
	}
		
	}
	


