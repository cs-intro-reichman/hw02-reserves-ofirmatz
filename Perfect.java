/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
	int n = Integer.parseInt(args[0]);
	int x = 0;
	String y = "";
		for(int i = 1; (i < n); i++){
			if((n%i)==0){
				x = x + i;
				y = y + " + " + i;
			}
			if(i==1){
				y = "1";
			}
		}
				if(n==x){	
				System.out.print(n + " is a prfect number since " + n + " = " + y);
				}else{
					System.out.print(n + " is not a perfect number.");
				}
	}
}
