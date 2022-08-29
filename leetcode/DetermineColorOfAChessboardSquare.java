class Solution {
    public boolean squareIsWhite(String str) {//97  122
        char ch=str.charAt(1);
        int a=Character.getNumericValue(ch);
        if(str.charAt(0)%2!=0 && a%2!=0)
        {
            return false;
        }
        else if(str.charAt(0)%2==0 && a%2==0 )
        {
            return false;
        }
        return true;
    }
}
