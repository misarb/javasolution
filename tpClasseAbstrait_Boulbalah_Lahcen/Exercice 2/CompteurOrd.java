package tpabstract_ex2;

public class CompteurOrd extends CompteurAbstrait{

	CompteurOrd(int min, int courant) {
		super(min, courant);
		
	}

	
	void increment() {
		System.out.println(super.courant);		
	}

}
