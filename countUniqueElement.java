public static void algo(String input1)
{
	Set<Character> set=new HashSet();
	int l=input1.length();
	for(int i=0;i<input1.length();i++)
	{
		
	  if(set.contains(input1.charAt(i))) {
		l-=2;
	  }
	  set.add(input1.charAt(i));
	}
	System.out.println(l);
	
}
