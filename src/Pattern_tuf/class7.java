package Pattern_tuf;

public class class7 {

	public static void main(String[] args) 
	{
		int lines=5;
		int starcount=1;
		int spacecount=4;
	
		for(int i=0; i<lines; i++)
		{
			for(int j=0; j<spacecount; j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k<starcount; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			spacecount--;
			starcount+=2;
			
		}
	}

}
