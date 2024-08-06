package day26nov23;

//public class FunctionalInterfaceex {
	
	interface SoftwareTesting
	{
		void Manual();
		
	}
	
	 public class FunctionalInterfaceex  implements SoftwareTesting
	{
		
		public void Manual()
		{
			
			System.out.println("This is Manual Testing");
		}
	
	
	

	public static void main(String[] args)
	{
		
		
		FunctionalInterfaceex  t=new FunctionalInterfaceex ();
		t.Manual();

	}
	

}

