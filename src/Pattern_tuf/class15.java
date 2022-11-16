package Pattern_tuf;

public class class15 {

	public static void main(String[] args) 
	{
		int lines=5;
		int count=5;
		char value='A';
		
		for(int i=0; i<lines; i++)
		{
			for(int j=0; j<count; j++)
			{
				System.out.print(value);
				value++;
			}
			System.out.println();
			value='A';
			count--;
		}

	}

}
