class Solution {
    public int mostWordsFound(String[] s) {
        int c=0;
        for(int i=0;i<s.length;i++)
        {
          String[] str=s[i].split(" ");
          int temp=str.length;
          if(temp>c)
          {
            c=temp;
          }
        }
	      return c;
    }
}
