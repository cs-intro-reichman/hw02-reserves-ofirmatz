/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
	String str = args[0];
	int c = str.length();
	int i = 1;
	char middle = str.charAt((c-1)/2);
		while(i<=c){
			System.out.print(str.charAt(c-i));
			i++;
		}
		System.out.print("\nThe middle character is " + middle);
	}
}
