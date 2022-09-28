class Solution {
    public int countSegments(String s) {
        String trimm=s.trim();
        if(trimm.equals(""))
        {
            return 0;
        }
        return trimm.split("\\s+").length;
    }
}
