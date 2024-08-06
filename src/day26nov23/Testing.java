package day26nov23;

 interface Testingex
{
  void manual();	
}

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Testingex e=new Testingex() {
			
			  public void manual(){
				  
				  System.out.println("Hello");
			  }
		};
		e.manual();

	}

}
