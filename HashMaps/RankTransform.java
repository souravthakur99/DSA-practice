class Solution {
    public int[] arrayRankTransform(int[] arr) {
      int[]arr1=arr.clone();
      Arrays.sort(arr1);
      HashMap<Integer,Integer>hash=new HashMap<>();
      int rank=1;
      for(int i:arr1){
        if(!hash.containsKey(i)){
            hash.put(i,rank);
            rank++;
        }
      }
      for(int i=0;i<arr.length;i++){
        if(hash.containsKey(arr[i])){
            arr[i]=hash.get(arr[i]);
        }
      }
      return arr;
    }
}
