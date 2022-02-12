
public class Compte {
	public String numero_cmpt;
	 public float sold_cmpt;
	Personne client;
	
	public Compte() {
		numero_cmpt = "15353";
		sold_cmpt = 12;
		
		
	}
	public Compte(String numero_cmpt,float sold_cmpt,Personne client) {
		this.numero_cmpt = numero_cmpt;
		this.sold_cmpt = sold_cmpt;
		this.client = client;
		
	}
	void afficher() {
		System.out.println("le compte de : "+client.nom+"  avec le numero :"+numero_cmpt+"  est le solde : "+sold_cmpt);
	}
	void afficher(int nomber) {
		switch(nomber) {
		case 1 :
			System.out.println("le numero est = "+numero_cmpt);
			break ;
		case 2:
			System.out.println("sold est = "+sold_cmpt);
			break;
		case 3:
			System.out.println("client : "+client.nom);
			break;
		default :
			System.out.println("Erreur 404");
		
		}
	}
	public float solde(String nume) {
		if(nume==numero_cmpt) {
			return sold_cmpt;
		}
		return 0;
		
	}
	
	void autoriser(float soldeRetire) {
		if(soldeRetire <=sold_cmpt) {
			System.out.println("the Client allowed to retrive solde");
		}else {
			System.out.println("You are Broke :)");
		}
		
	}
	void deposer(float montdepo) {
		this.sold_cmpt += montdepo;
		
	}
	void retirer(float montRetrived) {
		this.sold_cmpt -= montRetrived;
	}
	
	

}
