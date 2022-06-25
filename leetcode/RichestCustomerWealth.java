class Solution {
    public int maximumWealth(int[][] a) {
        int s=0;
        int max=-1;
        for(int i=0;i<a.length;i++)
        {
            s=0;
        for(int j=0;j<a[i].length;j++)
        {
            s+=a[i][j];
        }
            max=Math.max(max,s);
    }
        return max;
    }
}
