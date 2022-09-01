class Solution {
    public boolean judgeCircle(String moves) {
        int pos=0,pos1=0;
        for(char ch:moves.toCharArray())
        {
            if(ch=='R')
                pos++;
            if(ch=='L')
                pos--;
            if(ch=='U')
                pos1++;
            if(ch=='D')
                pos1--;
        }
        return pos==0 && pos1==0;
    }
}
