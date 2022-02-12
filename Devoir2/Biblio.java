import java.util.ArrayList;

class Auteur {

  private String nom;
  private boolean PremiumIndic;
 	Auteur(String nom,boolean PremiumIndic){
 		
 		this.nom = nom;
 		this.PremiumIndic = PremiumIndic;
	 
 }

	//methodes
 	  String getNom() {
 		return this.nom;
 	}
 	 boolean getPrix() {
 		
		return PremiumIndic;
 	}
}

class Oeuvre 
{
	
	
	 Auteur nomAuteur;
	private String titre;
	private String langue="francais" ;
	public Oeuvre(String titre,Auteur nomAuteur,String langue){
		
		
		this.nomAuteur = nomAuteur;
		this.titre = titre;
		this.langue = langue;
		
		
	}
	
	
	
	//methodes start from Here
	String getTitre() {
		return titre;
	}
	Auteur getAuteur() {
		return nomAuteur;
	}
	String getLangue() {
		return langue;
	}
	
	void afficher() {
		System.out.println(" "+titre+" "+nomAuteur+"en "+langue+"");
	}
 	
}

// completer les autres classes ici
class Exemplaire {
	
	
	Oeuvre oeuvre;
	//constructer de copy
	Exemplaire(Exemplaire e){
		this.oeuvre = e.oeuvre;
		
		System.out.println("Cope d'un exemplaire -> "+oeuvre.getTitre()+","+oeuvre.getAuteur().getNom()+", en"+oeuvre.getLangue());
		
	}
	//constructer par Reference sur Oeuvre
	Exemplaire(Oeuvre e){
		this.oeuvre = e;
		
		System.out.println("Nouvel exemplaire de -> "+e.getTitre()+","+e.getAuteur().getNom()+", en "+e.getLangue());
	}
	
	
	Oeuvre getOeuvre() {
		
		return oeuvre;
	}
	
	void afficher() {
		System.out.println("Un exemplaire de  "+oeuvre.getTitre()+","+oeuvre.getAuteur().getNom()+", en "+oeuvre.getLangue());
	}
}

class Bibliotheque 
{
	ArrayList<Exemplaire> exemplaires = new ArrayList<Exemplaire>();
	private String biblio_Nom;
	
 Bibliotheque(String biblio_Nom){
	 
	 this.biblio_Nom=biblio_Nom;
	 
	 System.out.println("la bibliothéque "+biblio_Nom+"est ouverte !");
	 
	 
 }
 
 String getNom() {
	 return biblio_Nom;
 }
int getNbExemplaires() {
	return exemplaires.size();
}
	void stocker(Oeuvre newOeuvre , int n) {
	
		for(int i=0;i<n;i++) {
			Exemplaire list = new Exemplaire(newOeuvre);
			exemplaires.add(list);
		
		
	}
}
	void stocker(Oeuvre newOeuvre ) {
	
		stocker(newOeuvre,1);
	
		
	
}
     ArrayList<Exemplaire> listerExemplaires(String langue) {
    	ArrayList<Exemplaire> list= new ArrayList<Exemplaire>();
    	//list.clear();
    	for(Exemplaire exemplaire :exemplaires) {
    		if(exemplaire.getOeuvre().getLangue()==langue) {
    			list.add(exemplaire);
    		}
    	}
    	return list;
    	
}
     ArrayList<Exemplaire> listerExemplaires() {
    	return exemplaires;
    	}
    	
    	
	

    int compterExemplaires(Oeuvre bibo) {
    	int count=0;
    	for(Exemplaire exemplaire:exemplaires) {
    		if(exemplaire.getOeuvre()==bibo) {
    			count ++;
    		}
    		
    	}
    	return count;
    	
    }
    
    void afficherAuteur(boolean primum) {
    	
    	for(Exemplaire exemplaire:exemplaires) {
    		if(exemplaire.getOeuvre().getAuteur().getPrix()) {
    			System.out.println(exemplaire.getOeuvre().getAuteur().getNom());
    		}
    	}
    	
    }
    void afficherAuteur() {
    	afficherAuteur(true);
    }
}


/*******************************************
 * Ne rien modifier apres cette ligne.
 *******************************************/
/*******************************************
 * Ce qui suit est propose' pour vous aider
 * dans vos tests, mais votre programme sera
 * teste' avec d'autres donnees.
 *******************************************/

public class Biblio {

    public static void afficherExemplaires(ArrayList<Exemplaire> exemplaires) {
        for (Exemplaire exemplaire : exemplaires) {
            System.out.print("\t");
            exemplaire.afficher();
        }
    }

    public static void main(String[] args) {
        // create and store all the exemplaries
        Auteur a1 = new Auteur("Victor Hugo", false);
        Auteur a2 = new Auteur("Alexandre Dumas", false);
        Auteur a3 = new Auteur("Raymond Queneau", true);

        Oeuvre o1 = new Oeuvre("Les Miserables", a1, "francais");
        Oeuvre o2 = new Oeuvre("L\'Homme qui rit", a1, "francais");
        Oeuvre o3 = new Oeuvre("Le Comte de Monte-Cristo", a2, "francais");
        Oeuvre o4 = new Oeuvre("Zazie dans le metro", a3, "francais");
        Oeuvre o5 = new Oeuvre("The count of Monte-Cristo", a2, "anglais");

        Bibliotheque biblio = new Bibliotheque("municipale");
        biblio.stocker(o1, 2);
        biblio.stocker(o2);
        biblio.stocker(o3, 3);
        biblio.stocker(o4);
        biblio.stocker(o5);

        // ...
        System.out.println("La bibliotheque " + biblio.getNom() + " offre ");
        afficherExemplaires(biblio.listerExemplaires());
        String langue = "anglais";
        System.out.println("Les exemplaires en " + langue + " sont  ");
        afficherExemplaires(biblio.listerExemplaires(langue));
        System.out.println("Les auteurs a succes sont  ");
        biblio.afficherAuteur();
        System.out.print("Il y a " + biblio.compterExemplaires(o3) + " exemplaires");
        System.out.println(" de  " + o3.getTitre());
    }
}

