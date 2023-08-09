package questions;

public class Capitalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "sai kiran";    //Capitalizing the first letter of a string
		String capitalized = Character.toUpperCase(str.charAt(0)) + str.substring(1);
		System.out.println(capitalized);

	}

}
