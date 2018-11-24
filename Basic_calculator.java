package codemyclassobjectmethodconstructorvoid;

import java.util.Scanner;

public class BasicCalculator  {
	
	public BasicCalculator() {}
	int b;
	String name;
	
	public int add(int a, int b) {
		return a+b;
				}
	public int subtract(int a, int b) {
		return a-b;
				}
	public int multiply(int a, int b) {
		return a*b;
				}
	public int devide(int a, int b) {
		if(b==0) {
			System.out.println("Error");
			return 0;
		}else 
		{return a/b;}
				}
	 public void myName() {System.out.println(name);}
	public static void start() {System.out.println("q");}
	public static int move(int a) {return a; }
	public static void hold(int tin) {System.out.println(tin);}
	public void rim (int rom) {System.out.println("my name is " + rom);};
	
	

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Plz enter a positive single digit");
		int dig = input.nextInt();
		System.out.println(dig);
	
		BasicCalculator myCal=new BasicCalculator();
		myCal.b=78;
		myCal.name= "mycalulator";
	           
		 System.out.println(myCal.add(3,4));
		 myCal.myName();
		 myCal.devide(2,0);
		 myCal.start();
		 System.out.println(myCal.move(9));
		 
          myCal.hold(myCal.b);
          System.out.println(dig*5);
          myCal.rim(myCal.b);
	}

}