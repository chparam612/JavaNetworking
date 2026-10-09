import java.net.*;

public class urlexample
{
  public static void main(String [] args){
    try
    {
     URL ul = new URL("http://www.it.com:3301/index.html");
     System.out.println("Protocol: " + ul.getProtocol());
     System.out.println("Domain: " + ul.getHost());
     System.out.println("Port is: " + ul.getPort());
     System.out.println("File is: " + ul.getFile());
    }
    catch(Exception e){
      System.out.println("Error occured");
    }
  }
}