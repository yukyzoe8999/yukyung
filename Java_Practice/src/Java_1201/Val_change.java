package Java_1201;

public class Val_change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b = 10;
		short s = 20;
		int i = b;
		long l = 100l;
		int k = (int)l;   //long 형을 int 형으로 강제변환

		
		byte e = (byte) s;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(k);
		System.out.println(e);
		

	}

}
