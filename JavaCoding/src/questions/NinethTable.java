package questions;

public class NinethTable {
	    public static void main(String[] args) {
	        int number = 9;
	        int limit = 10;

	        System.out.println("Multiplication Table of " + number + ":");
	        for (int i = 1; i <= limit; i++) {
	            int result = number * i;
	            System.out.println(number + " x " + i + " = " + result);
	        }
	    }
	}


