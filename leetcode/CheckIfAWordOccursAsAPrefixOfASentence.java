class Solution {
    public int isPrefixOfWord(String str, String t) {
       int c=0;
	String[] str1=str.split(" ");
	for(int i=0;i<str1.length;i++)
	{
		char ch1=t.charAt(0);
		String ss1=Character.toString(ch1);
		if(str1[i].startsWith(t))
		{
			if(str1[i].length()>=t.length())
			{
				if(str1[i].contains(t))
				{
					c=i+1;
					break;
				}
			}
		}
		else
		{
			c=-1;
		}
	}
	return c;
    }
}
