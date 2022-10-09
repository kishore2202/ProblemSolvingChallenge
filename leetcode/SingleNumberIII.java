class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int size=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    nums[i]=-999;
                    nums[j]=-999;
                }
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=-999)
            {
                size++;
            }
        }
        int[] arr=new int[size];
        int j=0;
        for(int i:nums)
        {
            if(i!=-999)
            {
                arr[j]=i;
                j++;
            }
        }
        return arr;
    }
}
