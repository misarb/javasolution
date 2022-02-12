import java.util.Scanner;
class Activite_02 {
public static void main(String[] args) {		
Scanner scanner = new Scanner(System.in); 
System.out.print("Entree une nomber : ");
int n = scanner.nextInt();  
System.out.println("La premier methode pour calcule les sommes du n nomber paire ");
SommeN_Entier(n);
System.out.println("La deuxieme methode qui calcule et affiche les dix nombres suivants du N nomber ");
DixNomberSuivant(n);
	}
// methode 1 
static void SommeN_Entier(int n){
int result=0 ,i=0;
System.out.println("Les nomber paire calcule sont les suivants: ");
while(i<=n*2) {
	if(i%2==0) {
		result = result + i;
		System.out.println(i);
	}	
	i++;
}
System.out.println("Result des sommes du nomber pair est = "+result);
}
//methode 2
static void DixNomberSuivant(int n){
int some=0;
System.out.println("les dix nomber suivant on va calcules ");
for(int i=n+1;i<=n+10;++i){
	System.out.println(i);
		some=some+i;
		}
		System.out.print("La somme de dixs nomber suivant est: "+some);
		}
}
