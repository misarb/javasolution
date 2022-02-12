package tpabstract_ex2;

abstract class CompteurAbstrait {
	int min ;
	int courant ;
	CompteurAbstrait(int min , int courant){
		
		this.min = min;
		this.courant = courant;
	}
	
	//methode 
	void raz() {};
	abstract void increment();
	
}
