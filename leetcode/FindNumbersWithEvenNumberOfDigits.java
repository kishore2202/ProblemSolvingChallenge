class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            StringBuilder str=new StringBuilder();
            str.append(nums[i]);
            if(str.length()%2==0)
            {
                c++;
            }
        }
        return c;
    }
}
