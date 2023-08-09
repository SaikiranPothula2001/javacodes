package questions;

public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//"\\s+" will split the string by single or multiple whitespace characters
		//Removing all whitespace from a string
		
		String str = "  Hello World  ";
		String withoutWhitespace = str.replaceAll("\\s+", "");
		System.out.println(withoutWhitespace);

	}

}