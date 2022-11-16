package step1_6_basic_hashing;

public class check_frequency_max_occure 
{

	public static void main(String[] args)
	{
		int[] a = { 1, 1, 2, 9, 3, 3, 3, 4 };
	
		System.out.println(a.length);

		int[] visitedArray = new int[a.length];
		System.out.println(visitedArray.length);
		int visited = -1;

		for (int i = 0; i < a.length; i++) 
		{
			int count = 1;

			for (int j = i + 1; j < a.length; j++)
			{
				if (a[i] == a[j]) {
					count++;
					visitedArray[j] = visited;
				}
			}

			if (visitedArray[i] != visited)
			{
				visitedArray[i] = count;
				System.out.println(visitedArray[i]);
			}
		}

		int max=visitedArray[0];
		int min=visitedArray[0];
		for (int i = 0; i < visitedArray.length; i++) 
		{
			if (visitedArray[i] != visited)
			{
				
             if(max<visitedArray[i])
             {
            	 max=visitedArray[i];
             }
             
             if(min>visitedArray[i])
             {
            	 min=visitedArray[i];
             }
				System.out.println("Element repeated " + a[i] + " for " + visitedArray[i] + " times");
			}

		}
		System.out.println("Maximum number of time occured number:"+max);
		System.out.println("Minimum number of time occured number:"+min);

	}
}
