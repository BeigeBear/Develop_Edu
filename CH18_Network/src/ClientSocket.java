import java.io.DataOutputStream;
import java.net.Socket;

public class ClientSocket {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("172.30.1.28", 9999);
			
			DataOutputStream dot = new DataOutputStream(s.getOutputStream());
			dot.writeUTF("안녕하세요! 메세지 받지마세요!");
			dot.flush();
			dot.close();
			s.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
