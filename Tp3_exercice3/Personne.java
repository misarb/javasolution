import java.util.ArrayList;


public class Personne  {
	 public String nom;
	private String mtp;
	public String prenom ;
	//Compte[] cmpt = new Compte[3] ;
	ArrayList<Compte> cmpt = new ArrayList<>();
	Personne(String nom,String prenom,String mtp){
		
		this.nom = nom;
		this.prenom = prenom;
		this.mtp = mtp;
		
	}
	void getNom() {
		System.out.println("nome = "+nom);
		}
	void getPrenom() {
		System.out.println("nome = "+prenom);
		}
	void veriferMtp(String pwd) {
		if(pwd == mtp) {
			System.out.println("mote de passe correct");
		}
		else
			System.out.println("mote de passe incorrect");
		}
	
	void ajouteCmpt(Compte c) {
	
		cmpt.add(new Compte (c.numero_cmpt,c.sold_cmpt,c.client));
	}
	void afficher() {
		//System.out.println(cmpt.get(0));
		for(Compte compte:cmpt) {
			System.out.println("Nome : "+compte.client.nom +"  Prenom: "+ prenom +
					" Numero : "+compte.numero_cmpt+" Solde :"+compte.solde(compte.numero_cmpt)+ "  nomber des Compte : "+cmpt.size());
			
		}
		
	//	System.out.println("Nome : "+nom +"  Prenom: "+ prenom + "  nomber des Compte : "+cmpt.size());
	}
	
	

}

