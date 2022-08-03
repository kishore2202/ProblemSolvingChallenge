class Solution {
    public String reverseWords(String str) {
        String str2="";
        String[] str1=str.split(" ");
        for(int i=0;i<str1.length;i++)
        {
            StringBuffer sb=new StringBuffer(str1[i]);
            sb.reverse();
            str2+=sb+" ";
        }
        return str2.trim();
    }
}
