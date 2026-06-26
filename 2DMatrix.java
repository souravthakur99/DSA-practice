import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the size of the array"); 
      int n=sc.nextInt();
      int [][]arr=new int[n][n];
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              arr[i][j]=sc.nextInt();
          }
      }
      
      //diagonal printing
1 2 3
4 5 6
7 8 9
  //diagonal printing
1
4 2
7 5 3
8 6
9
      int r=arr.length;
      int col=arr[0].length;
      //row priting
      for(int i=0;i<r;i++){
          int row=i;
          int c=0;
          while(row>=0&&c<col){
              System.out.println(arr[row][c]);
              row--;
              c++;
          }
      }
      //bottom
      for(int j=1;j<col;j++){
          int row=r-1;
          int c=j;
          while(c<col&&row>=0){
              System.out.println(arr[row][c]);
              row--;
              c++;
          }
      }
    }
}
