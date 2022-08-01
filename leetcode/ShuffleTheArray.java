class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[2*n];
        int c1=0,c2=n;
        for(int i=0;i<2*n;i++){
            if(i%2==0){
                arr[i]=nums[c1];
                c1+=1;
            }
            else{
                arr[i]=nums[c2];
                c2+=1;
            }
        }
        return arr;
    }
}
