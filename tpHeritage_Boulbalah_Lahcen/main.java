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
public class main {

	public static void main(String[] args) {
		
		System.out.println(" ************* TEST DE LA CLASSE ENSEIGNANT ******************");
		Enseignant enseignant = new Enseignant("elon", "mask", 32, "informatique", "grade", 15000);
		
		enseignant.afficherInfo();
		enseignant.salaire = 20000;
		enseignant.setAge(35);
		enseignant.afficherInfo();
		
		System.out.println(" ************* TEST DE LA CLASSE ETUDIENT ******************");
		
		Etudient etud = new Etudient("lahcen", "boulbalh", 21 , 1234, "SER", 4, 2022);
		etud.afficherInfos();
		etud.ajouterCours(4);
		etud.afficherCours();
		double moyenne = etud.moyenneE();
		if(moyenne>=10.0) {
			System.out.println(" la moyenne est = "+moyenne+" l Etudient reussi ");
		}else{
			System.out.println(" la moyenne est = "+moyenne +" l Etudient il pas reussi");
		}
		
	}

}
