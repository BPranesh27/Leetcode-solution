class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxi=piles[0];
        for(int pile:piles) maxi=Math.max(maxi,pile);
        int low=1,high=maxi;
        while(low<=high){
            int mid=low+(high-low)/2;
            long total=totalHours(mid,piles);
            if(total<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    long totalHours(int n,int[] piles){
        long sum=0;
        for(int pile:piles){
            sum+=(long)Math.ceil((double)pile/n);
        }
        return sum;
    }
}