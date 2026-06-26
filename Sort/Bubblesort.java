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
      //sorting the array
      //right to left
      for(int i=0;i<n-1;i++){
          for(int j=0;j<n-i-1;j++){
              if(arr[j]>arr[j+1]){
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
              }
          }
      }
      for(int i=0;i<n;i++){
          System.out.println(arr[i]);
      }
      
      //left to right sort
      for(int i=0;i<n-1;i++){
          for(int j=n-1;j>i;j--){
              if(arr[j]<arr[j-1]){
                  int temp=arr[j];
                  arr[j]=arr[j-1];
                  arr[j-1]=temp;
              }
          }
      }
      System.out.println("left to right sort");
      for(int i =0;i<n;i++){
          System.out.println(arr[i]);
      }
      //left to right sort in descending
            for(int i=0;i<n-1;i++){
          for(int j=0;j<n-i-1;j++){
              if(arr[j]<arr[j+1]){
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
              }
          }
      }
      //print 
      System.out.println("left to right sort in des");
      for(int i =0;i<n;i++){
          System.out.println(arr[i]);
      }
    //right to left sort in desc
    for(int i=0;i<n-1;i++){
          for(int j=n-1;j>i;j--){
              if(arr[j]>arr[j-1]){
                  int temp=arr[j];
                  arr[j]=arr[j-1];
                  arr[j-1]=temp;
              }
          }
      }
      //print right to left
      System.out.println("right to left sort in des");
      for(int i =0;i<n;i++){
          System.out.println(arr[i]);
      }
    }
}
