class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int c=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    set.add(nums1[i]);
                }
            }
        }
        int[] nums3=new int[set.size()];
        for(int i:set)
        {
            nums3[c]=i;
            c++;
        }
        return nums3;
    }
}
