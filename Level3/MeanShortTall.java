import java.util.*;

class MeanShortTall{
	
	
	int findSum(int[] arr){
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		
		return sum;
	}
	
	
	int calculateMean(int total){
		return total / 11;
	}
	
	
	int shortestHeight(int[] arr){
		int shortest = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++){
			if(shortest > arr[i]){
				shortest = arr[i];
			}
		}
		
		return shortest;
	}
	
	
	int tallestHeight(int[] arr){
		int tallest = 0;
		for(int i=0; i<arr.length; i++){
			if(tallest < arr[i]){
				tallest = arr[i];
			}
		}
		
		return tallest;
	}

	public static void main(String[]args){

        
        Scanner input = new Scanner(System.in);
		
		int[] heights = new int[11];
		
		for(int i=0; i<11; i++){
			heights[i] = 150 + (int)(Math.random() * 101);
		}
		
		MeanShortTall obj = new MeanShortTall();
		int sum = obj.findSum(heights);
		int mean = obj.calculateMean(sum);
		int shortest = obj.shortestHeight(heights);
		int tallest = obj.tallestHeight(heights);
		
		System.out.println("Heights taken: ");
		for(int i=0; i<11; i++){
			System.out.print(heights[i] + " ");
		}
		System.out.println();
		
		System.out.println("Mean of the heights is " + mean);
		System.out.println("Shortest height is " + shortest + " and tallest height is " + tallest);
        		
        
		input.close();
	}
}