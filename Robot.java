package codemyclassobjectmethodconstructorvoid;

public class Robot {
	//static variable belongs to class can be used by objects with or without
	//making constructor variable but after assigning constructor variable  
	//static variable will not go into effect but static variable doesn't change with object
	static int batteryLevel ;
	String name = "x";
	int color = 5;
	
	

	public Robot(int colorCode, String name) {
		this.name = name;
		
          batteryLevel=100;
		color = colorCode;

	}
       // this will return a value for object specific variable
	    // and then can be printed using system.out.println in main method
	    public int getColorCode() {
		System.out.println(color);
	    	return color;
	}
        
	public void getName() {
		System.out.println("Name of this Robot is " + name);
		
	}
     // Static method belongs to the class and it doesn't 
	//need reference variable to get invoked however objects can call them
	static void activate() {
		System.out.println("Activated, how can i help");
		batteryLevel = batteryLevel - 5;
		System.out.println("Battery level is: " + batteryLevel + " percent.");
	}
        // method with parameter will need input from object side when calling it
	void chargeBattery(int hour) {
		System.out.println("Robot is charging");
		batteryLevel = batteryLevel + hour;
		if (batteryLevel > 100) {

			batteryLevel = 100;
			System.out.println("Battery Level is " + batteryLevel);
		} else {
		}
		System.out.println(batteryLevel + "%");
	}

	public int checkBatteryLevel() {
		System.out.println(batteryLevel + "%");
		return batteryLevel;
	}

	public void fly(int feet) {
		if (feet > 2) {
			System.out.println("error!i can not fly over 2 feet");
		} else {
			System.out.println("Flying");
			batteryLevel = batteryLevel - 15;
			System.out.println(batteryLevel + "%");
		}
	}

	public static void main(String[] args) {
		
		Robot myRobot = new Robot(1, "x1");
		myRobot.activate();
		myRobot.chargeBattery(5);
		myRobot.checkBatteryLevel();
		myRobot.fly(2);
		myRobot.getName();
		Robot myRobot2 = new Robot(2, "X2");
		
		myRobot2.getName();
		int myRobot2ColorCode = myRobot2.getColorCode();
		myRobot.getColorCode();
		System.out.println(myRobot2ColorCode);
		myRobot2.checkBatteryLevel();
		switch (myRobot2ColorCode) {

		case 1:
			System.out.println("Its look like a Grey color Robot");
			break;
		case 2:
			System.out.println("Its look like a Red color Robot");
		}
            activate();
	}
}
