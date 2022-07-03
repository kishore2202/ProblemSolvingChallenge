class Solution {
    public int wiggleMaxLength(int[] nums) {
         if (nums.length < 2)
            return nums.length;
        int[] u = new int[nums.length];
        int[] d = new int[nums.length];
        u[0] = d[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                u[i] = d[i - 1] + 1;
                d[i] = d[i - 1];
            } else if (nums[i] < nums[i - 1]) {
                d[i] = u[i - 1] + 1;
                u[i] = u[i - 1];
            } else {
                d[i] = d[i - 1];
                u[i] = u[i - 1];
            }
        }
        return Math.max(d[nums.length - 1], u[nums.length - 1]);
    }
}
