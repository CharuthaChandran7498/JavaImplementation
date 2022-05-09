package Javapkg;

public class Exception_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try
      {
    	  System.out.println("Execution started");
    	  int k=100/0;
    	  System.out.println("Execution completed");
      }
      catch(Exception e)
      {
    	  System.out.println("Division By Zero Exception");
    	  System.out.println("Message is:"+e.getMessage());
    	  	  
      }
	}

}
