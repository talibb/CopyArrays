/*
 * Done By: Talib Bacchus
 * This program copies the elements in an array into another array
 */
public class copyArrays {
	
	int[] original;
	int[] duplicate;
	public void CopyArrays(int[] source, int[] copy)
	{
		original=source;
		duplicate=copy;
		
		int size = original.length;
		duplicate = new int [size*2];
		for(int i =0; i<original.length; i++)
		{
			duplicate[i] = original[i];
		}
		
		
	}
		public void display()
		{
			System.out.println("Original Array");
			for(int i = 0; i<original.length; i++)
			{
				System.out.print(original[i] + " " );
			}
			System.out.println();
			
			System.out.println("Copied Array");
			for(int i=0; i<duplicate.length; i++ )
			{
				System.out.print(duplicate[i] + " ");
			}
		}
	
	
	
	
	
	public static void main(String[] args) {
		
		int source[]= {1,2,3,4};
		int copy[]= new int[8];
		for (int i =0; i<source.length;i++)
		{
			System.out.println(source[i]);
		}
		
		int [] copied = new int [source.length*2];
		copyArrays a = new copyArrays();
		a.CopyArrays (source,copy);
		a.display();
		
		
		
			
	}

}
