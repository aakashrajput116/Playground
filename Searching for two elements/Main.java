import java.util.Scanner;
class Main{
   public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int idx = 0; idx <= arr_size - 1; idx++)
      {
         arr[idx] = in.nextInt();
      }
     int search_elem_1= in.nextInt();
     int search_elem_2= in.nextInt();
     int count=0;
      for(int idx = 0; idx <= arr_size - 1; idx++)
      {
        if(search_elem_1==arr[idx]) 
        {
         System.out.println(idx);
       count++;
        }
        
      }
     if(count==0)
       System.out.println("-1"); 
     
      int coun=0;
      for(int idx = 0; idx <= arr_size - 1; idx++)
      {
        if(search_elem_2==arr[idx]) 
        {
         System.out.println(idx);
       coun++;
        }
        
      }
     if(coun==0)
       System.out.println("-1"); 
   }
}