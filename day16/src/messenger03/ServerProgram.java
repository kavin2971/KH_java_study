package messenger03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {
	public static void main(String[] args) {
		int port = 3005;
		Scanner sc = new Scanner(System.in);
		try {
			try(ServerSocket server = new ServerSocket(port)){
			System.out.println("\"π=3 ν΄λΌμ΄μΈνΈμ μμ²­μ κΈ°λ€λ¦¬κ³  μμ΅λλ€... π=3\"");
			Socket socket = server.accept();        
			System.out.println(socket.getInetAddress().getHostAddress()+ "κ° μ°κ²°μ μμ²­ν¨!!");

			try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));PrintWriter pw = new PrintWriter(socket.getOutputStream());){
			
			pw.println("\"π νμν©λλ€ π\""); 
			pw.flush(); 
			
				while(true) {
			
					System.out.println("μ¬μ π© client: "+ br.readLine());
					System.out.print("λ¨μ π§ server: " );
					pw.println(sc.nextLine());
					pw.flush();
				}
			}	
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}



