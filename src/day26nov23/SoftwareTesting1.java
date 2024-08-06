package day26nov23;

interface Car{
	
	abstract void start();
}

public class SoftwareTesting1 {

	public static void main(String[] args) {
		
		 Car car=()->
			 System.out.println("This is start method");
		 
		 car.start();
		 }
		// TODO Auto-generated method stub

	}


