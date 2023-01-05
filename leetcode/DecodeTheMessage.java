class Solution {
    public String decodeMessage(String k, String m) {
        String newStr="";
	for(int i=0;i<k.length();i++)
	{
		char curr=k.charAt(i);
		if(newStr.indexOf(curr)<0 &&Character.isLetter(curr))
		{
			newStr+=curr;
		}
	}
	char ch=97;
	HashMap<Character,Character> map=new HashMap<>();
	for(int i=0;i<newStr.length();i++)
	{
		map.put(newStr.charAt(i), ch);
		ch++;
	}
	String res="";
	for(int i=0;i<m.length();i++)
	{
		if(Character.isLetter(m.charAt(i)))
		{
			res+=map.get(m.charAt(i));
		}
		if(m.charAt(i)==' ')
		{
			res+=" ";
		}
	}
    if(m.charAt(0)==' ' || m.charAt(m.length()-1)==' ')
	{
		return res;
	}
	return res.trim();
    }
}
