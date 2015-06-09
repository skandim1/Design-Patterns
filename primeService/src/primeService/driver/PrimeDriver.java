package primeService.driver;

import primeService.util.Debug;
import primeService.client.ClientDriver;
import primeService.client.clientInterface;
import primeService.server.ServerDriver;
import primeService.server.serverInterface;

public class PrimeDriver {
	public static void main(String args[]) {
		
		if(args[0].equalsIgnoreCase("server")&&(args.length == 2)) {
			if(Integer.parseInt(args[1])>0){
				serverInterface s = new ServerDriver();
				s.connectServer(Integer.parseInt(args[1]));	
			}
			else
				System.err.println("Invalid port number");
			
		}
		else if(args[0].equalsIgnoreCase("client")&&(args.length == 4)) {
			if((Integer.parseInt(args[3]) >= 1) && (Integer.parseInt(args[3]) <= 3)) {
			   Debug.getUniqueInstance().setvalue(Integer.parseInt(args[3]));
			   if(Integer.parseInt(args[2])>0){
			      clientInterface c = new ClientDriver();
			      c.connectClient(args[1], Integer.parseInt(args[2]));
			   }
			   else
				  System.err.println("Invalid port number");
		}
		else
			System.err.println("Invalid debug value");
		}
		else {
			System.out.println("enter valid arguments");
			System.exit(-1);
		}
	}
}
