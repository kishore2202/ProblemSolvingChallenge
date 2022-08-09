class Solution {
    public int numberOfSteps(int n) {
        int d=0;
        int c=0;
        while(n!=0)
        {
            if(n%2==0)
            {
                d=n/2;
                n=d;
                c++;
            }
            else if(n%2!=0)
            {
                d=n-1;
                n=d;
                c++;
            }
        }
        return c;
    }
}
