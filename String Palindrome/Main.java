  import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner scan=new Scanner(System.in);
      String str=scan.nextLine();
      int str_len=str.length();
     
      StringBuilder sb=new StringBuilder(str);
      int end = str_len - 1;
    int front = 0;
    while(front < end)
    {
      char tmp_ch = sb.charAt(front);
      sb.setCharAt(front, sb.charAt(end));
      sb.setCharAt(end, tmp_ch);
      front++;
      end--;
    }
       
      if(sb.toString().equals(str.toString()))
      {
      System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    } 
}