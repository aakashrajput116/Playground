 import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp,l;
      int arm=0;
      temp=n;
     while(n>0)
      {
         l=n%10;
        arm=arm+(l*l*l);
          n=n/10;
     }
      if(arm==temp)
          System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
        
	}
}