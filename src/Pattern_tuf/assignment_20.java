package Pattern_tuf;

public class assignment_20 
{

	public static void main(String[] args) 
	{
		int lines=5;
		int mid=(lines+1)/2;		
		int count=1;
		char value='A';
		int spaces=4;
		
		for(int i=1; i<=lines; i++)
		{
			for(int j=1; j<=count; j++)
			{
				System.out.print(value);
				value++;
			}
			for(int k=1; k<=spaces; k++)
			{
				System.out.print(" ");
	
			}
			value='A';
			for(int l=1; l<=count; l++)
			{
				System.out.print(value);
				value++;
			}
			value='A';
			System.out.println();
			if(i<mid) {
				count++;
				spaces=spaces-2;
			}else {
				count--;
				spaces=spaces+2;
			}
		}

	}

}
