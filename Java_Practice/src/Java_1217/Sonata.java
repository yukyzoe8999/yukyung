package Java_1217;

public class Sonata {
	String model = "Sonata";
	String brand = "Hyundai";
	String owner = "";
	int max_Speed = 250;
	int km = 0;
	
	public Sonata(int max_Speed, int km, String name) {
		this.max_Speed =max_Speed;
		this.km = km;
		this.owner = name;
		run(model, brand,max_Speed,km,owner);
	}

	private void run(String model2, String brand2, int max_Speed2, int km, String owner2) {
		// TODO Auto-generated method stub
		System.out.println(model);
		System.out.println(owner);
		System.out.println(brand);
		System.out.println(max_Speed);
		System.out.println(km);



	}

}
