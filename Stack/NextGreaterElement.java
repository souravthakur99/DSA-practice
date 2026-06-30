class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer>list=new ArrayList<>();
    Stack<Integer>sc=new Stack<>();
    for(int i=arr.length-1;i>=0;i--){
       
        while(!sc.isEmpty()&&sc.peek()<=arr[i]){
            sc.pop();
        }
        if(sc.isEmpty()){
            list.add(-1);
        }
        else{
            list.add(sc.peek());
            
        }
        sc.push(arr[i]);
    }
    Collections.reverse(list);
    return list;
    }
}
