package tpabstract_ex2;

public class TestCompteur {

	public static void main(String[] args) {
		
		CompteurAbstrait compteurord = new CompteurOrd(0,10);
		CompteurAbstrait compteurcycl = new Compteurcycl(0,0,5);
		
		for(int i=0;i<3;i++) {
			compteurord.increment();
			compteurcycl.increment();
			
		}
	}

}
