// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the size of the array"); 
      int n=sc.nextInt();
      int []arr=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      for(int i=0;i<n;i++){
          int max=i;
          for(int j=i+1;j<n;j++){
              if(arr[max]<arr[j]){
                  max=j;
              }
          }
          int temp=arr[max];
          arr[max]=arr[i];
          arr[i]=temp;
      }
      for(int i=0;i<n;i++){
          System.out.println(arr[i]);
      }
      //sort in desc from right to left
      for(int i=n-1;i>=0;i--){
          int max=i;
          for(int j=i-1;j>=0;j--){
              if(arr[j]>arr[max]){
                  max=j;
              }
          }
          int temp=arr[max];
          arr[max]=arr[i];
          arr[i]=temp;
      }
      //printing
      for(int i=0;i<n;i++){
          System.out.println(arr[i]);
      }
      
    }
}
