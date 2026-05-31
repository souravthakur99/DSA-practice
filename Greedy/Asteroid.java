class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
       Arrays.sort(asteroids);
       long  currentmass=mass;
       for(int asteroid: asteroids){
        if(currentmass<asteroid) return false;
        else{ currentmass+=asteroid;}
       } 
       return true;
    }
}
