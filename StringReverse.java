package practice;

public class StringReverse {
public static String strrev(String str)
{
	//initialize an empty string
	String str1="";
	
	/*from here we have to traverse from right to left
	then store each char in that empty string*/
	
	for(int i=str.length()-1;i>=0;i--)
	{
		str1+=str.charAt(i);
	}
	return str1;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcde";
		System.out.println(strrev(str));
	}
}