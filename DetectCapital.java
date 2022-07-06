class Solution {
    public boolean detectCapitalUse(String w) {
         if(upper(w))
         {
             return true;
         }
        if(lower(w))
        {
            return true;
        }
        if(check(w))
        {
            return true;
        }
        return false;
    }
    public static boolean check(String w)
    {
        for(int i=0;i<w.length();i++)
        {
            if(i==0)
            {
                if(Character.isLowerCase(w.charAt(i)))
                {
                    return false;
                }
            }
            else
            {
                if(!Character.isLowerCase(w.charAt(i)))
                {
                    return false;
                }
            }
            
        }
        return true;
    }
        public static boolean upper(String w) {
	for(char ch:w.toCharArray())
	{
		if(!Character.isUpperCase(ch))
		{
			return false;
		}
	}
	return true;
    }
public static boolean lower(String w) {
	for(char ch:w.toCharArray())
	{
		if(Character.isUpperCase(ch))
		{
			return false;
		}
	}
	return true;
    }
}
