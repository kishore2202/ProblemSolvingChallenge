class Solution {
    public int lengthOfLastWord(String s) {
        String st="";
        String[] str=s.split(" ");
        for(int i=0;i<str.length;i++)
        {
        	st=str[str.length-1];	
        }
        return st.length();
    }
}
