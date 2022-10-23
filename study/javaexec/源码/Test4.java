package test1;

public class Test4 {

	public static void main(String[] args) {
		Car Car1 = new Car();
		Car Car2 = new Car();
		Car Car3 = new Car();
		Car1.setSpeed(50);
		Car1.setSeated(true);
		Car1.setStatus(1);
		Car1.setColor("yellow");
		Car2.setSpeed(-30);
		Car2.setSeated(true);
		Car2.setStatus(2);
		Car2.setColor("blue");
		Car3.setSpeed(20);
		System.out.println("Car1:" + Car1.speedOn());
		System.out.println(Car1.toString());
		System.out.println("Car2:" +Car2.speedOn());
		System.out.println(Car2.toString());
		System.out.println("Car3:" + Car3.speedOn());
		System.out.println(Car3.toString());
	}
}

class Car{
	static final int LOCK = 0;         //電源オフ
	static final int ON = 1;           //電源オン
	static final int START  = 2;       //エンジンをかける
	private int speed = 0;             //速度
	private boolean isSeated = false;  //人がいるか
	private int status = LOCK;         //車の状態
	private String color = "black";    //車の色
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isSeated() {
		return isSeated;
	}

	public void setSeated(boolean isSeated) {
		this.isSeated = isSeated;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
    //車の状態を戻る
	@Override
	public String toString() { 
		if(!isSeated) {
			return "car is stopping."+ " isSeated:"+isSeated+"   status:"+status+"  color:"+color;
		}
		return "isSeated:"+isSeated+"   status:"+status+"  color:"+color;
	}
	
	//車が起動かどうか
	public String speedOn() {
		if(status != START) {
			return "Not started";
		}
		if(status == START && speed >= 0 && isSeated ) {
			return "Increased speed.";
		}else {
			return "Reduced speed.";
		}
		
	}
}
