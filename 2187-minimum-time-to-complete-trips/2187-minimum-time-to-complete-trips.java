class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long low=1,high=Integer.MAX_VALUE;
        for(int t:time) high=Math.min(t,high);
        high=high*totalTrips;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(trips(time,mid)>=totalTrips) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
    long trips(int []time,long t){
        long total=0;
        for(int i=0;i<time.length;i++){
            total+=(t/time[i]);
        }
        return total;
    }
}