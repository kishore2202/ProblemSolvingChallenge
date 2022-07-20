class Solution {
    public int heightChecker(int[] arr){
        int c=0;
        int[] b=new int[arr.length];
        for(int i=0;i<b.length;i++)
        {
          b[i]=arr[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]!=b[i])
          {
            c++;
          }
        }
        return c;
    }
}
