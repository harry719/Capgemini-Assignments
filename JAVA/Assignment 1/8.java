
public class main {
	public static void main(String[] args) {
		
      
		int a[]= {12,45,32,56,76,19,122,90,877,23,67,49,78,78,234,654};
		int i;
		System.out.println("Array Before Sorting :->");
		for (i=0;i<(a.length);i++)
		{

			System.out.println(a[i]);
			}
		
		bubblesort(a);
		
		System.out.println("Array After Sorting :->");
		for (i=0;i<(a.length);i++)
		{

			System.out.println(a[i]);
			}		
		
		
	
	}
	private static void bubblesort(int[] a) {
	
		int temp=0;
		int i=0;
		for(i=0;i<a.length;i++) {
			
			for(int j=1;j<(a.length-i);j++) {
				if(a[j-1]>a[j]) {
					
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				
				}
				
			}
		}
		
	}
	
		
	
}