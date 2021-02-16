package Java_0108;

import java.util.ArrayList;

public class A_list2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num = new ArrayList<Integer>();
		int sum = 0;
		for(int i=0;i<=100;i++) {
			num.add(i);
			//sum += num.get(i);
//			if(num.get(i)%2==0) {
//				
//				num.remove(num.get(i));  //안됨
//			}
		}
		for(int i = 0; i<num.size();i++) {
			if(num.get(i)%2==0) {
				num.remove(i);
			}
		
		}	System.out.println(num);
		//System.out.println(num);
		//System.out.println(sum);
	}

}
