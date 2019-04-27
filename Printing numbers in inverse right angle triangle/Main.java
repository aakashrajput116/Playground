import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
  
		for(int row_no = 1 ; row_no <= n ; row_no++){
              int num=n+1;
			    num=num-row_no;
			for(int col_no = row_no ; col_no <= n ; col_no++){
				System.out.print(num);
              num=num-1;
			}
			System.out.print("\n");		
       
		}
	}
}