/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int t = Integer.parseInt(args[0]);
		int numkids = 0;
		int twochildren = 0;
		int threechildren = 0;
		int fourOrMore = 0;
		double totaChildren = 0;
		double averege = 0;
		 	for(int i = 0; i < t; i++){
		 		boolean boyBorn = false;
		 		boolean girlborn = false;
		 		numkids = 0;
			while(!( boyBorn && girlborn )){
				if(Math.random()<0.5){
					boyBorn = true;
					numkids++;
				}else{
					girlborn = true;
					numkids++;
				}				
			}
				totaChildren = numkids + totaChildren;
			if(numkids == 2){
				twochildren++;
			}else if(numkids == 3){
				threechildren++;
			}else{
				fourOrMore++;
			}
			}
					averege = (double)(totaChildren/t);
					System.out.println("Average: " + averege + " children to get at least one of each gender.");		
					System.out.println("Number of families with 2 children: " + twochildren );
					System.out.println("Number of families with 3 children: " + threechildren );
					System.out.println("Number of families with 4 or more children: " + fourOrMore );

									if(( twochildren >= threechildren ) && ( twochildren >= fourOrMore )){
											System.out.print("The most common number of children is 2." );
									}else if(( threechildren >= twochildren)&&( threechildren >= fourOrMore )){
											System.out.print("The most common number of children is 3." );
									}else{
											System.out.print("The most common number of children is 4 or more." );
									}
	}
}
