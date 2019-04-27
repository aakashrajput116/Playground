 import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int i;
      int count=0;
      for(i=1; i>0; i=i+1)
      {
        if(i%2 != 0){
          System.out.println(i);
          count=count+1;
        }
        if(count==n)
          break;
      }
      
	}
}