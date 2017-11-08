import java.io.*;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you? :)");
		String firstName = "";
		
		InputStreamReader istream = new InputStreamReader(System.in) ;
		BufferedReader bufRead = new BufferedReader(istream) ;
		               
		          try {
		               System.out.println("Please enter your name: ");
		               firstName = bufRead.readLine();
		          }
		          catch (IOException err) {
		               System.out.println("Error reading line");
		          }
		      
	HelloUser obj = new HelloUser();
	obj.greetUser(firstName);
	}

}
