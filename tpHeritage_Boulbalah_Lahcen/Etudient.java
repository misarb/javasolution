/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package tpHeritage;

/**
 *
 * @author BOULBALAH lahcen
 */
import java.util.ArrayList;
import java.util.Scanner;
class Etudient extends Personne{
	
	int numEtud;
	String specialite;
	int nbrMatier;
	static int annee ;
	private Scanner scanner;
	ArrayList<Double> note = new ArrayList<Double>();
	ArrayList<Integer> coefficient = new ArrayList<Integer>();
	
	
	Etudient(String nom,String prenom,int age,int numEtud,String specialite,int nbrMatier,int annee){
		super(nom,prenom,age);
		this.numEtud =numEtud;
		this.specialite = specialite;
		this.nbrMatier = nbrMatier;
		Etudient.annee = annee;
		scanner = new Scanner(System.in);
	}
	void ajouterCours(int nbrCour) {
		System.out.println(" ************** Entree les note du module ************************");
		for(int i=0;i<nbrCour;i++) {
			System.out.format("Entree le note du module %d = ",(i+1));
			double noteAjoute = scanner.nextDouble();
			note.add(noteAjoute);

		}
		System.out.println("********** Entree les coefficients correspendent a chaque  module *******************");
		for(int i=0;i<nbrMatier;i++) {
			
			System.out.format("Entree le coefficient correspend du module %d =  ",(i+1));
			int coeifAjouter = scanner.nextInt();
			
			coefficient.add(coeifAjouter);

		}
		
	}
	void afficherCours() {
		for(double elem:note) {
			System.out.println("la not du module = "+elem);
			
		}
		for(double elem:coefficient) {
			System.out.println("coffiecient du module = "+elem);
			
		}
		
		
	}
	double moyenneE() {
		double some = 0.0;
		double moyenne ;
		for(int i=0;i<note.size();i++) {
			some += note.get(i)*coefficient.get(i); 
		}
		moyenne = some/note.size();
		return moyenne;
	}
	
	

}
