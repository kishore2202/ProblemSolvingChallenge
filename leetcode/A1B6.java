package practice;

public class A1B6 {

	public static String solve(String str)
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isLetter(ch))
			{
				int j=i+1;
				StringBuffer intBuffer=new StringBuffer();
				while(j<str.length() && Character.isDigit(str.charAt(j)))
				{
					intBuffer.append(str.charAt(j));
					j++;
				}
				int k=Integer.parseInt(intBuffer.toString());
				for(int l=0;l<k;l++)
				{
					sb.append(ch);
				}
//				i=j-1;
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="a1b6c11";
		System.out.println(solve(str));
	}

}
