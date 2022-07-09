class Solution {
    public String defangIPaddr(String str) {
    if(str.contains("."))
    {
      str=str.replace(".", "[.]");
	  }
    return str;
    }
}
