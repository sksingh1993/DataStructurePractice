package poc.multithread;

public class WithOutSynchronisationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	First fnew = new First();
		    Second ss = new Second(fnew, "welcome");
		    Second ss1= new Second(fnew,"new");
		    Second ss2 = new Second(fnew, "programmer");
		    

	}

}

class First{
	public void display(String msg)
	  {
	    System.out.print ("["+msg);
	    try
	    {
	      Thread.sleep(1000);
	    }
	    catch(InterruptedException e)
	    {
	      e.printStackTrace();
	    }
	    System.out.println ("]");
	  }
}
class Second extends Thread
{
  String msg;
  First fobj;
  Second (First fp,String str)
  {
    fobj = fp;
    msg = str;
    start();
  }
  public void run()
  {
	  
	  //withour synchronized
    //fobj.display(msg);
	  synchronized(fobj)      //Synchronized block
	  {
	   fobj.display(msg);
	  }
	 
  }
  
  
  
}
