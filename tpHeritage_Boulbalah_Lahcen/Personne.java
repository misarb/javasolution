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
class Personne {
	
	String nom;
	String prenom;
	int age;
	Personne(String nom,String prenom,int age){
		this.nom=nom;
		this.prenom=prenom;
		this.age = age;
		
	}
	void afficherInfos() {
		System.out.println("nom = "+nom+" prenom = "+prenom+" age = "+age);
		
	}
	int getAge()
	{
		return this.age;
	}
	void setAge(int newAge) {
		age=newAge;
	}
}
