class Solution {
    public int countPairs(int[] arr, int n) {
        int c=0;
        int in=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    in=i*j;
                    if(in%n==0)
                    {
                        c++;
                    }
                }
            }
        }
        return c;
    }
}
