package bubbleSortAssignment;
public class launch {
	public static void main(String []args) {
		
	
	int [] ar= {10,40,50,20,70,5};			
  for(int i=0;i<ar.length;i++)
  {
	  for(int j=1;j<ar.length-i;j++)
	  {
		  if(ar[j]<ar[j-1])
		  {
			  int temp=ar[j];
			  ar[j]=ar[j-1];
			  ar[j-1]=temp;	
		  } 
	  } 
  }
  for(int ele:ar)
  {
	  System.out.print(ele+" ");
  }
  
}
}
	
