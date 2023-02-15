import java.util.Scanner;

public class averageNumbers {
    public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in);
		
		int positive = 0, negative = 0, total = 0, count = 0;       // create the variables
		int number;
		
		System.out.println("Enter a number: ");                  // asking the user to enter number
	     
		while((number = input.nextInt()) != 0) {                    // looping the question when 0 is not entered
			
		     
		    total += number;
		    count++;                                                 // adding to the count variable
		    if(number > 0){
		        positive++;                                          // adding to the positive variable
		    } else if(number < 0) {
		        negative++;                                          // adding to the negative variable
		    }
		} 
		float average = total / (float) count;                       // printing outcomes
		System.out.println("The number of positives is " + positive);
		System.out.println("The number of negatives is " + negative);
		System.out.println("The total is " + total);
		System.out.println("The average is " + average);
	}
}
       
            
    
    
