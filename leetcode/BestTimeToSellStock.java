class Solution {
    public int maxProfit(int[] arr) {
        int buy=arr[0];
        int ans=0;
        for(int i=1;i<arr.length;i++)
        {
            if(buy>arr[i])
            {
                buy=arr[i];
            }
            ans=Math.max(ans,arr[i]-buy);
        }
        return ans;
    }
}
