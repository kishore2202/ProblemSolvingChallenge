class Solution {
    public int countAsterisks(String s) {
        int res = 0, bars = 0;
        for (char ch:s.toCharArray()) {
            if (ch == '*' && bars % 2 == 0)
                res++;
            if (ch == '|')
                bars++;
        }
        return res;
    }
}
