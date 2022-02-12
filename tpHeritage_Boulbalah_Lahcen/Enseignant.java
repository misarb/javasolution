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

class Enseignant extends Personne {
	String specialite;
	String grade;
	double salaire;
	Enseignant(String nom,String prenom,int age,String specialite,String grade,double salaire){
		super(nom,prenom,age);
		this.specialite=specialite;
		this.grade = grade;
		this.salaire = salaire;
	}
	
	void afficherInfo() {
		System.out.println("nom = "+super.nom+" prenom = "+super.prenom+" age = "+super.age+" specialite = "+specialite+" grade = "+grade+" salaire ="+salaire);
	}

}
