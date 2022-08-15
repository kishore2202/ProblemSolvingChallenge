public class ToggleBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		String d=Integer.toBinaryString(a);
		d=d.replace("1", "2");
		d=d.replace("0", "1");
		d=d.replace("2", "0");
		int g=Integer.parseInt(d,2);
		System.out.println(g);
	}

}
