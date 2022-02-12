class Activite_03 {
public static void main(String[] args) {
//declaration du tableau		
int[] nambers = {5,8,10,9,10,16,2,3,7,6,9,8,0,33,30,11,65,19,13,21};
int result = 0; // variable pour stocke la somme
for(int i=0;i<nambers.length;i++) {
	if(nambers[i]%2!=0) {
		result = result + nambers[i];
	}
}
System.out.print("le result des elementes impair est: "+result);
 
	}

}
