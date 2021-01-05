package Java_1231;

public class C extends B {
	//새로운 변수 A이므로 또다른 get을 만든다.(기존B에 있던 get은 사용못함.)<override>
	@Override
	public void setA(String a) {
		//A = a;     위에 다른 private A를 생성하고<override>
		super.setA(a);  //부모B에 있는 set 값에 직접 넣는다.
	}
	//@Override
//	public String getA() {
//		return A;
//	}
	
}
