package LoonyLoops;

public class SumAverageRunningInt {

	public static void main(String[] args) {
//		int sum = 0;
		int lowerBand = -2;
		int upperBand = 80;
//		int counter=0;
		
		System.out.println("---------------- sumOfOdd&Even-----------------");
		int sumOdd=0;
		int sumEven=0;
		int absDiff;
		for (int number=lowerBand; number<=upperBand; ++number ) {
			if(number%2==0) {
				sumOdd+=number;
			}else {
				sumEven+=number;
			}//endIfElseforSum
		}//endFor
		if(sumOdd>sumEven) {
			absDiff=sumOdd;
			System.out.println(sumOdd);
		}else {
			absDiff=sumEven;
			System.out.println(sumEven);
		}System.out.println("absolute difference is: "+absDiff);
		
	
/*			
 		
 		System.out.println("---------------- sumOfTheSquares-----------------");
		
		  for (int i = lowerBand; i <= upperBand; ++i) {
					sum += i*i; // sum=sum*i;
					counter++;
					System.out.println("the sum is: " + sum);
					double average = (1.0d * sum) / counter;
					System.out.println("the average is: " + average);

				} // endFor 	
		

		System.out.println("---------------- for Loop-----------------");
		  for (int i = lowerBand; i <= upperBand; ++i) {
					sum += i; // sum=sum+i;
					counter++;
					System.out.println("the sum is: " + sum);
					double average = (1.0d * sum) / counter;
					System.out.println("the average is: " + average+ " and the counter value is: " +counter);

				} // endFor 

	System.out.println("---------------- for Loop-----------------");
  for (int i = lowerBand; i <= upperBand; ++i) {
			sum += i; // sum=sum+i;
			counter++;
			System.out.println("the sum is: " + sum);
			double average = (1.0d * sum) / counter;
			System.out.println("the average is: " + average);

		} // endFor 
 */
		
//difference between do-while(1) and while-do loop(2): (1)does everything as long as while==true; 
//(2)may not do anything unless 
//the condition stated in while is met
		
/*		System.out.println("----------------  do- while Loop-----------------");
		do {
			sum += lowerBand;
			++lowerBand;
			System.out.println(sum);
		} while (lowerBand <= upperBand);
		// endWhile-doLoop
 
		System.out.println("-------------  while-do Loop-------------");
		while (lowerBand <= upperBand){
				sum += lowerBand;
				++lowerBand;
				System.out.println(sum);}
*/		
	}// endMain

}// endClass
