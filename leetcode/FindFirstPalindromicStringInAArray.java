class Solution {
    public static boolean isPal(String str)
    {
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String ss=new String(sb);
        return str.equals(ss);
    }
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            if(isPal(words[i]))
            {
                return words[i];
            }
        }
        return "";
    }
}
