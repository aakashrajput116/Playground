import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
     int n2 = in.nextInt();
    int n3 = in.nextInt();
      System.out.println(GCD(n1,n2,n3));
       
    
  }
  public static int GCD(int n1,int n2,int n3)
  {
     int temp=1;
    while(n1>0)
    {
      temp=n1;
      n1=n2 % n1;
      n2=temp;  
    
    }
     while(n2>0)
    {
      temp=n2;
      n2=n3 % n2;
      n3=temp;  
    
    }
    return n3;
  }
    
}