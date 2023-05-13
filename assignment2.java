import java.util.*;
public class assignment2 {

	public static void main(String[] args) {
  
      int[] ar = { 2, 3, 5, 4, 3, 1, 3, 2, 1, };
 
      Arrays.sort(ar);
  int i,j,frequency;
   System.out.println("These elements are repeated  with its frequency-");
      for(i=0; i<ar.length; i++){
         frequency = 1;
         for(j=i+1; j<ar.length; j++){
            if(ar[j] == ar[i]){
               frequency++;
            } else {
               break;
            }
         }
         i=j-1;
         if(frequency > 1){
            System.out.println(ar[i] + " --> " + frequency);
         }
      }
   }
   
}


