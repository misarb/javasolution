
public class main {

	public static void main(String[] args) {
		Personne p = new Personne("boulbalah","lahcen","12345678");
		Compte c1 = new Compte("15625",100,p);
		Compte c2 = new Compte("123987",200,p);
		p.afficher();
		p.ajouteCmpt(c1);
	    p.ajouteCmpt(c2);
	    System.out.println();
		System.out.println("********************** Apres on ajouter 2 compte ******************");
		System.out.println();
		p.afficher();
		c1.deposer(100);
		c2.deposer(100);
		c1.retirer(50);
		System.out.println();
		System.out.println("********************* compte 1 afficher *****************************");
		System.out.println();
		c1.afficher();
		System.out.println();
		System.out.println("*********************** compte 2 afficher ****************************");
		System.out.println();
		c2.afficher();
		System.out.println();
		System.out.println("************** fine ******************");
		System.out.println();
		p.afficher();

	}

}
