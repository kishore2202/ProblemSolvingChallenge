class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
       int j=(m+n)-1;
        for(int i=0;i<n;i++)
        {
            if(arr1[j]==0)
            {
                arr1[j]=arr2[i];
                j--;
            }
        }
        Arrays.sort(arr1);
    }
}
