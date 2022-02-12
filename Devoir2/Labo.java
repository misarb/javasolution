class Souris {

    public static final int ESPERANCE_VIE_DEFAUT = 36;

    private int poids ;
    private int age;
    private String coleur;
    private boolean clonee = false;
    private int esperanceVie ;
   
    // la premier constructeur
    Souris(int poids,String coleur,int age){
    	this.poids = poids;
    	this.coleur = coleur;
    	this.age = age;
    	esperanceVie = ESPERANCE_VIE_DEFAUT;
    	System.out.println("Une nouvelle souris !");
    	toString();
    }
    // la deuxiem constructeur
    Souris(int poids,String coleur){
    	this.poids = poids;
    	this.coleur = coleur;
    	age = 0;
    	esperanceVie = ESPERANCE_VIE_DEFAUT;
    	System.out.println("Une nouvelle souris !");
    	toString();
    }
    // Constructeur par copie
    Souris(Souris obj){
    	clonee =true;
    	poids = obj.poids;
    	coleur = obj.coleur;
    	age = obj.age;
    	esperanceVie =obj.esperanceVie-8 ; 
    	System.out.println("Clonage d'une souris !");
    	toString();
    }
    
   // la premier methode to String
   public String toString() {
	   
	   String var = clonee ?",clonee, " : "";
    	
    	return "Une souris "+coleur+" "+var+"de "+age+" mois et pesant "+poids+" grammes";
    }
// methode qugmentation du age 
   public void vieillir() {
	  
	   age ++;
	   if(clonee && age>esperanceVie/2) {
		   
		   coleur = "vert";
		   
	   }
	   
   }
   
   // evolution de la souris
   void evolue() {
	   
	   for(int i=age;i<esperanceVie;i++) {
		   vieillir();
		   
	   }
   }
   
   

}

/*******************************************
 * Ne rien modifier apres cette ligne.
 *******************************************/

public class Labo {

    public static void main(String[] args) {
       Souris s1 = new Souris(50, "blanche", 2);
       Souris s2 = new Souris(45, "grise");
       Souris s3 = new Souris(s2);

       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
        s1.evolue();
        s2.evolue();
        s3.evolue();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
