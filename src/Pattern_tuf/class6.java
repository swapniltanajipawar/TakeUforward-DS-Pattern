package Pattern_tuf;

public class class6 {

	public static void main(String[] args) {
		
		int lines=5;
		int numbercount=5;
		int value=1;
		
		for(int i=0; i<lines; i++)
		{
			for(int j=0; j<numbercount; j++)
			{
				System.out.print(value);
				value++;
			}
			System.out.println();
			value=1;
			numbercount--;
		}
	}

}
