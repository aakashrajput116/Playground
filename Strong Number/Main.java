  import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int strong=0,i,l,fact=1,temp;
      temp=n;
      while(n>0)
      {
         l=n%10;
        fact=1;
        for(i=l;i>=1;i--)
        {
     
        fact=fact*i;
          
      }
        strong=strong+fact;
          n=n/10;
     }
      
      if(strong==temp)
          System.out.println("Yes");
      else
        System.out.println("No");
        
	}
}