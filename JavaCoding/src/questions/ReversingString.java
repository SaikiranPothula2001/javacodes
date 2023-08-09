package questions;

public class ReversingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = " Capgemini ";
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Enter String- "); 
		String a= sc.toString();*/
		
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println(reversed);

	}

}
