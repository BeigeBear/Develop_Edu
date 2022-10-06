import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
//
//

public class MultiChatServer1 {
	private ServerSocket ss = null;
	private Socket s = null;

	public void start() {
		try {
			ss = new ServerSocket(7777);
			System.out.println("server start");
			while(true) {
			
			//채우기
				
				
				
				
				
				
				
				
				
				
				
			}
		} catch (Exception e) {
			System.out.println("[MultiChatServer] start() Exception 발샐!!");
		}
	}

	public static void main(String[] args) {
		MultiChatServer1 server = new MultiChatServer1();
		server.start();
	}
	
	class ChatThread extends Thread{
		String msg;
		String[] rmsg;
		private BufferedReader inMsg = null;
		private PrintWriter outMsg = null;
		
		public void run() {
			boolean status = true;
			System.out.println("##ChatThread start...");
			try {
				
				
				
				
				
				
				
				
				
				while(status) {
					msg = inMsg.readLine();
					rmsg = msg.split("/");
					if(rmsg[1].equals("logout")) {
//						chatlist.remove(this);
						msgSendAll("server/"+ rmsg[0] + "님이 방을 나갔습니다.");
						status = false;
					} else if(rmsg[1].equals("login")) {
						msgSendAll("server/"+ rmsg[0] + "님이 입장했습니다.");
					} else {
						msgSendAll(msg);
					}
				}
				this.interrupt();
				System.out.println("##"+ this.getName() + "stop!!");
			} catch (IOException e) {
//				chatlist.remove(this);
//				e.printStackTrace();
				System.out.println("[ChatThread]run() IOException 발샐!!");
			}
		}
		
		public void msgSendAll(String msg) {
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}
}
