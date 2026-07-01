class Solution {
    public int maxArea(int[] height) {
        int area=Integer.MIN_VALUE;
        int l=0;
        int r=height.length-1;
        while(l<r){
            int h=Math.min(height[l],height[r]);
            int width=r-l;
            area=Math.max(area,h*width);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return area;
    }
}
