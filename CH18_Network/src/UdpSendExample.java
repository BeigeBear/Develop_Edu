import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UdpSendExample {

	public static void main(String[] args) throws Exception {
		DatagramSocket datagrmaSocket = new DatagramSocket();
		
		System.out.println("[발신 시작]");
		
		for(int i=1; i<11; i++) {
			String data = "통신상태 나이스~~~ 통신이 아주 나이스합니다" + i;
			byte[] byteArr = data.getBytes("UTF-8");
			DatagramPacket packet = new DatagramPacket(byteArr, byteArr.length,
					new InetSocketAddress("127.30.1.46", 5001));
			
			datagrmaSocket.send(packet);
			System.out.println("[보낸 바이트 수] : "+ byteArr.length + "bytes");
		}
		System.out.println("[발신 종료]");
		datagrmaSocket.close();
	}
}
