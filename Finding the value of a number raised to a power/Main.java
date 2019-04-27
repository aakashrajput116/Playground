 import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
      int base=in.nextInt();
        int power=in.nextInt();
      int result=1;
      while(power>0)
      {
         result*=base;
        power--;
      }
      System.out.print(result);
    }
}