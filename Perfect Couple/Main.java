import java.util.Scanner;
class Main
{
    public static void main(String[] args) 
    {
        int arr_size, min;
        Scanner Sc = new Scanner(System.in);
        arr_size = Sc.nextInt();
        int arr[] = new int[arr_size];
        for (int index = 0; index < arr_size; index++) 
        {
            arr[index] = Sc.nextInt();
        }
      int  search=Sc.nextInt();
        for (int i = 0; i < arr_size; i++) 
        {
          int sum=0;
            for (int j = i; j < arr_size; j++) 
            {
              sum=arr[i]+arr[j];
                if (search==sum) 
                {
                  System.out.print(arr[i]+", "+arr[j]); 
                  System.out.println();
                }
            }
           
        }
        
    }
}