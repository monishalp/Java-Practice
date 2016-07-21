public class FindLargest {
	  public static int large()
	  {
		  int[] numbers={67,98,56,45,80,43,34,54,23,15};
			int largest=Integer.MIN_VALUE;
			for(int i=0;i<numbers.length;i++){
			if(numbers[i]>largest)
			{
				largest=numbers[i];
			}
		}
	System.out.println("Largest number is : "+largest);
	return largest;
	  }
	  
	

		public static void main(String[] args) {
			System.out.println(FindLargest.large());
	}
	

	}
