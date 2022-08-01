class Solution {
    public String interpret(String str) {
        String str1="";
        String str2="";
        String str3="";
        str1=str.replace("()","o");
        str2=str1.replace("(","");
        str3=str2.replace(")","");
        return str3;
    }
}
