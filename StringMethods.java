package practice;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abcde";
		String str2="ABCDE";
		String str3="HelloWorld";
		String str4="";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.concat(" "+str3));
		System.out.println(str4.isEmpty());
		System.out.println(str3.length());
		System.out.println(str1.charAt(0));
		System.out.println(str1.replace('a', 'f'));
		System.out.println(str3.substring(2,6));
		System.out.println(str3.indexOf('d'));
		System.out.println(str3.toUpperCase());
		System.out.println(str2.toLowerCase());
	}

}
