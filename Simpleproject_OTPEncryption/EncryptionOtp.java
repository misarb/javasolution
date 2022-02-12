import java.util.*;

public class EncryptionOtp {
	
	private Scanner scanner ;
	private ArrayList<Character> list;
	private ArrayList<Character> shafeldList ;
	private char character ;
	private char[] letters ;
	
	
	EncryptionOtp(){
		scanner = new Scanner(System.in);
		list = new ArrayList<Character>();
		shafeldList = new ArrayList<Character>();
		character = ' ';
		
		Question();
		
		
		
	}
	
	
	private void Question() {
		
		while(true) {
			System.out.println();
			System.out.println("**********************************_Welcom to OTP Encryption Programme_*********************************");
			System.out.println("1-Generate Key");
			System.out.println("2-Get Key");
			System.out.println("3-Encrypte Message ");
			System.out.println("4-Decrypte a Message");
			System.out.println("5-Exit");
			System.out.print("Enter a choice you want : ");
			char reponse = scanner.nextLine().charAt(0);
			
			switch(reponse) {
			
			case '1':
				GeneratKey();
				break;
			case '2':
				GetKey();
				
				break;
			case '3':
				EncryptMessage();
				break;
			case '4':
				DecryptMessage();
				break;
			case '5':
				Exit();
				break;
			default:
				System.out.println(" not a valid choice :( ");
				break;
			
			
			}
		}
		
		}
	private void GeneratKey() {
		character = ' ';
		list.clear();
		shafeldList.clear();
		
		for(int i=32;i<127;i++) {
			list.add(Character.valueOf(character));
			character++;	
		}
		
		shafeldList = new ArrayList<Character>(list);
		Collections.shuffle(shafeldList);
		System.out.println(" Your Key has benn generated succes");
		
		
		}
	private void GetKey() {
		
		System.out.println("Characters :");
		for(char x :list) {
			
			System.out.print(x);
		}
		System.out.println();
		System.out.println("Key :");
		
		for(char result:shafeldList) {
			System.out.print(result);
		}
		
		}
	private void EncryptMessage() {
		System.out.println("Enter a messgae you want to encrypte : ");
		String message = scanner.nextLine();
		letters = message.toCharArray();
		
		for(int i=0;i<letters.length;i++) {
			for(int j=0;j<list.size();j++) {
				if(letters[i]==list.get(j)) {
					letters[i]=shafeldList.get(j);
					break;
					
				}
				
			}
		}
		
		System.out.println("message Encrypted : ");
		for(char result:letters) {
			System.out.print(result);
			
		}
		System.out.println();
	
	}
	private void DecryptMessage() {
		System.out.println("Enter a messsage to decrypte : ");
		String Encryptmsg = scanner.nextLine();
		letters = Encryptmsg.toCharArray();
		
		for(int i=0;i<letters.length;i++) {
			for(int j=0;j<shafeldList.size();j++) {
				if(letters[i]==shafeldList.get(j)) {
					letters[i]=list.get(j);
					break;
					
				}
				
			}
		}
		
		System.out.println("Enter a messsage to decrypte : ");
		for(char result:letters) {
			
			System.out.print(result);
		}
		System.out.println();
	}
	private void Exit() {
		System.out.println(" Thank you for using our programme see u soon :) ");
		System.exit(0);
		
	}
	
	
	

}
