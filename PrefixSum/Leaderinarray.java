class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int max=arr[arr.length-1];
    ArrayList<Integer>list=new ArrayList<>();
    list.add(max);
    for(int i=arr.length-2;i>=0;i--){
        if(arr[i]>=max){
            list.add(arr[i]);
            max=arr[i];
        }
    }
    int n=list.size()-1;
    int a=0;
    while(a<n){
        int temp=list.get(a);
        list.set(a,list.get(n));
        list.set(n,temp);
        n--;
        a++;
    }
    return list;
    }
}
//run the loop from behind and the last element will be the leader always so start from n-2 and compare it with max value and start adding in list
