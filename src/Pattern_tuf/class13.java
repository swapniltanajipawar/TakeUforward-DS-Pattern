package Pattern_tuf;

public class class13 {

	public static void main(String[] args) {
		
		int lines=5;
		int numbercount=1;
		int value=1;
		
		for(int i=0; i<lines; i++)
		{
			for(int j=0; j<numbercount; j++)
			{
				System.out.print(value);
				System.out.print(" ");
				value++;
			}
			System.out.println();
			numbercount++;
		}
	}

}
