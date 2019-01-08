import java.io.*;
import java.util.*;
  public class GrtDiv{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter A Number N:");
      int N=sc.nextInt();
      System.out.print("Enter a Number K:");
      int K=sc.nextInt();
	  int i;
      for(i=K;i>0;)
      { 
        if((K%i==0) && (N%i==0))
        {
          System.out.println("Answer:"+i);
          break;
        }
		    else
		    {
			    i--;
		    }
		
     }
   }
 }  
