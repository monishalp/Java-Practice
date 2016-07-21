import java.util.Arrays;
	public class Duplicate {
	

		public static void main(String[] args) {
			int numbers[]={67,76,874,64,98,35,45,86,87,67};
			Arrays.sort(numbers);
			for(int i=1;i<numbers.length;i++){
				if(numbers[i]==numbers[i-1]){
					System.out.println("Duplicate number is: " +numbers[i]);
				}
				
			}
			
	

		}
	

	}
