import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n1= in.nextInt();
    int n2= in.nextInt();
    int power= Power_of_num(n1,n2);
    System.out.println(power);
  }
  public static int Power_of_num(int a,int b)
  { 
    int pow=1;
    for(int i=0;i<b;i++)
    {
       pow=a*pow;
    }
    return pow;
  }
}