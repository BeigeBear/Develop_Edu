import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MessageClient {

	public static void main(String[] args) throws Exception {
		
		Socket s = new Socket("172.30.1.7", 8888);
		
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		Scanner sc = new Scanner(System.in);
		
		String str ="", str2 = "";
		
		while(!str.equals("exit")) {
			str = sc.nextLine();
			dout.writeUTF(str);
			dout.flush();
			str2 = din.readUTF();
			System.out.println("아구몬 : "+ str2);
		}
		dout.close();
		s.close();
	}

}
