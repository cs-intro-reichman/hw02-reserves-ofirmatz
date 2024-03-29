import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		int t = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);	
		Random generator = new Random(seed); 
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
				double rnd = generator.nextDouble();
				if((rnd) < 0.5){
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
		// Gets the two command-line arguments
                //int T = Integer.parseInt(args[0]);

		// Initailizes a random numbers generator with the given seed value
     //.          Random generator = new Random(seed);  
	 //	int seed = Integer.parseInt(args[1]);	
	//	Random generator = new Random(seed); 
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
