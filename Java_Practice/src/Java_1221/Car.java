package Java_1221;

abstract class Car {
	String color;
	int speed=0;

	void upspeed(int speed) {
		this.speed += speed;
	}
	abstract void work();	
}

class Sedan extends Car {
	void work() {
		System.out.println("승용차가 사람을 태우고 있습니다.");
	}

}

class Truck extends Car {
	void work() {
		System.out.println("트럭이 짐을 싣고 있습니다.");
	}

}
