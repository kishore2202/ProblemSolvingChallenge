class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str="";
        String str1="";
        boolean b=true;
        for(int i=0;i<word1.length;i++)
        {
        	str+=word1[i];
        	
        }
        for(int i=0;i<word2.length;i++)
        {
        	str1+=word2[i];
        }
        
        if(str.equals(str1))
        {
        	return b;
        }
        else
        {
        	return false;
        }
    }
}
