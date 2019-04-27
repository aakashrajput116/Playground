import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		 
              int x = 1;
for( int i = 0 ; i < num ; i++ )
{
if(i % 2 == 0)
{
for( int j = 1 ; j <  num ; j++)
  System.out.print(x);
 System.out.print(x + 1);
}
else
{
System.out.print(x + 1);
for( int j = 1 ; j < num ; j++)
 System.out.print(x);
}
System.out.print("\n");			
x++;
            }
	}
}