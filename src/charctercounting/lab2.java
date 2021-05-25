package charctercounting;

public class lab2 {
	public static void main(String[] args) {
		 	String s1="HelloWorld";
		 	boolean t=s1.chars()
		 	.allMatch(Character::isLetter);
		 	System.out.println(t);
	}

}
