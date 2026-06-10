import java.util.Scanner;

public class selection {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=0;
        for(int i=0;i<n;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){ min=j;}
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }
        System.out.println("after sorting");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        

    }
    
}
