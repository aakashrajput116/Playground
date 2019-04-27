 import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int fact=1,i,l;
       
        for(i=n;i>=1;i--)
      {
        fact=fact*i;
      }
          n=n/10;
      
      
      System.out.println(fact);
        
	}
}