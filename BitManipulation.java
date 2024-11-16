public class BitManupulation {

	public static String solve(String str1, String str2)
	{
		int aPointer=str1.length()-1;
		int bPointer=str2.length()-1;
		int carry=0;
		StringBuffer sb=new StringBuffer();
		while(aPointer>=0 || bPointer>=0)
		{
			int aValue=0;
			int bValue=0;
			if(aPointer>=0)
			{
				aValue=str1.charAt(aPointer)-'0';
			}
			if(bPointer>=0)
			{
				bValue=str2.charAt(bPointer)-'0';
			}
			int ans=0;
			int value=aValue+bValue+carry;
			if(value==3)
			{
				ans=1;
				carry=1;
			}
			if(value==2)
			{
				carry=1;
			}
			if(value==1)
			{
				ans=1;
				carry=0;
			}
			sb.append(ans+"");
			aPointer--;
			bPointer--;
		}
		if(carry==1)
		{
			sb.append(1+"");
		}
		return sb.reverse().toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "110";
		String str2= "11";
		System.out.println(solve(str1,str2));
	}

}
