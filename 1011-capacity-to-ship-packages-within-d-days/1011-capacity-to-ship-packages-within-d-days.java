class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int high=0,low=0;
        for(int weight:weights){
            high+=weight;
            low=Math.max(low,weight);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int dN=daysNeeded(weights,mid);
            if(dN<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    int daysNeeded(int weights[],int capacity){
        int days=1,sum=weights[0];
        for(int i=1;i<weights.length;i++){
            if(sum+weights[i]<=capacity){
                sum+=weights[i];
            }
            else{
                days++;
                sum=weights[i];
            }
        }
        return days;
    }
}