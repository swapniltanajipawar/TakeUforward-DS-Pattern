package Pattern_tuf;

public class class5 {

	public static void main(String[] args)
	{
		int lines=5;
		int starcount=5;
		
		for(int i=0; i<lines; i++)
		{
			for(int j=0; j<starcount; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			starcount--;
		}
	}
}
