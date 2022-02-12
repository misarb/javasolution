package tpabstract_ex2;

public class Compteurcycl extends CompteurAbstrait {

		int max;
	Compteurcycl(int min, int courant,int max) {
		super(min, courant);
		this.max= max;
	}

	
	void increment() {
		for(int i =max;i>super.min;i--) {
			System.out.println(i);
		}
		
	}

}
