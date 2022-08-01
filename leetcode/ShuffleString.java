class Solution {
    public String restoreString(String str, int[] n) {
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<n.length;i++)
        {
            sb.setCharAt(n[i],str.charAt(i));
        }
        return sb.toString();
    }
}
