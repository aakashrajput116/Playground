 import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String str1=in.nextLine();
      String str2=in.nextLine();
   String str=(str1+str1);
boolean status=str.contains(str2);
    if(status==true)
    {
       System.out.print("Yes");
    }
    else
      System.out.print("No");
      }
    }
 