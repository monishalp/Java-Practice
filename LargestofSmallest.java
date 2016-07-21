
public class LargestSmallest {
	

		public static void main(String[] args) {
			int numbers[]=new int[]{89,78,56,54,345,43,23,21,123,45,654,987};
			int biggest=numbers[0];
			int smallest=numbers[0];
			for(int i=1;i<numbers.length;i++)
			{
				if(numbers[i]>biggest)
					numbers[i]=biggest;
				else if(numbers[i]<smallest)
					numbers[i]=smallest;
			}
			System.out.println("Biggest number: " +biggest);
			System.out.println("Smallest number: "+smallest);
		
		}
	

	}
