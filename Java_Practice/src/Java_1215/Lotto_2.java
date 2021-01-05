package Java_1215;

import java.util.Random;

public class Lotto_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Random rdm = new Random();	
		Random rdm = new Random();
		int arry []= new int[6];
		for(int i =0; i<6; i++) {
			int num = rdm.nextInt(44)+1;
		}

	}

	public static int[] pick() {
		// TODO Auto-generated method stub
		Random rdm = new Random();		
		int num = rdm.nextInt(44)+1;	
		int num_2 = rdm.nextInt(44)+1;
		int num_3 = rdm.nextInt(44)+1;
		int num_4= rdm.nextInt(44)+1;
		int num_5 = rdm.nextInt(44)+1;
		int num_6 = rdm.nextInt(44)+1;
		
		int arry []= {num,num_2,num_3,num_4,num_5,num_6};
		return arry;
	}

}
