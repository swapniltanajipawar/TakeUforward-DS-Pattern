package Pattern_tuf;

public class class11 {

	public static void main(String[] args) {
		int lines = 5;
		int number = 1;
		int value = 1;

		for (int i=1; i<=lines; i++) {
			if (i%2 == 0) 
			{
			    value=0;
				for (int j=0; j<number; j++)
				{
					System.out.print(value);
					value= (value==0) ? 1: 0;  //ternary operator syntax:  (condition)? true_value : false_value;
				}
			} 
			
			else 
			{
				value=1;
				for (int j=0; j<number; j++) 
				{
					System.out.print(value);
					value= (value==0) ? 1: 0;
				}
			}
			System.out.println();
			number++;
		}
	}
}
