package Pattern_tuf;

public class class21 {

	public static void main(String[] args) {
		int lines=5;
		int starcount=4;
		
		for(int i=0; i<lines; i++)
		{
			for(int j=0; j<starcount; j++)
			{
				if(i==0|| i==starcount|| j==0 || j==lines-2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
