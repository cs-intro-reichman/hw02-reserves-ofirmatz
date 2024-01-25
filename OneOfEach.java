
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean boyBorn = false;
		boolean girlborn = false;
		int numkids = 0;
			while(!(boyBorn && girlborn )){
				if(Math.random()<0.5){
					System.out.print("b ");
					boyBorn = true;
					numkids++;
				}else{
					System.out.print("g ");
					girlborn = true;
					numkids++;
				}
			}
					System.out.print ("\nYou made it... and you now have "+ numkids + " children.");
	}
}
