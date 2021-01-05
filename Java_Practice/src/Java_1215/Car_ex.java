package Java_1215;

public class Car_ex {

	public static void main(String[] args) {
		Car car = new Car();

		String car_nm = car.model;
		System.out.println(car_nm);
		System.out.println(car.color);
		
		car.speed = 400;
		System.out.println(car.speed);
		
		Car_extend ce = new Car_extend();
		String model_1 = ce.model;
		System.out.println(model_1);

	}
}
