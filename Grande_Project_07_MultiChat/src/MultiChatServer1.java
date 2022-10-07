import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
//

// 서버 클래스
public class MultiChatServer1 {
	private ServerSocket ss = null;
	private Socket s = null;
	private ArrayList<ChatThread> chatlist; // 채팅스레드 배열리스트
	private ChatThread thread;
	
	public void start() {
		try {
			ss = new ServerSocket(5959); // 서버소켓 작동
			System.out.println("[서버 작동 성공]");
			while(true) {
				s = ss.accept(); // 연결 수락
				thread = new ChatThread(); // 새 스레드 생성
				chatlist.add(thread); // 스레드 배열 추가
				System.out.println("[클라이언트 연결 : "+s.getRemoteSocketAddress()+" ]");
				System.out.println(" → "+((ChatThread.currentThread().getName())+1)+"번 사용자 연결");
				System.out.println(" → 현재 연결된 사용자"+((chatlist.size())+1)+"명");
			}
		} catch (Exception e) {
			System.out.println("[MultiChatServer] start() Exception 발생!!");
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
			s = new Socket(); // 스레드를 런하면 일단 소켓을 하나 만든다.
			chatlist.add(this);
			boolean status = true;
			System.out.println("##ChatThread start...");
			try {
				
				
				
				
				
				
				
				
				
				// 메세지 입출력
				while(status) {
					msg = inMsg.readLine();
					rmsg = msg.split("/");
					if(rmsg[1].equals("logout")) {
						chatlist.remove(this);
						msgSendAll("server/"+ rmsg[0] + "님이 방을 나갔습니다.");
						status = false;
					} else if(rmsg[1].equals("login")) {
						msgSendAll("server/"+ rmsg[0] + "님이 입장했습니다.");
					} else {
						msgSendAll(msg);
					}
				}
				this.interrupt0();
				System.out.println("##"+ this.getName() + "stop!!");
			} catch (IOException e) {
				chatlist.remove(this);
//				e.printStackTrace();
				System.out.println("[ChatThread]run() IOException 발생!!");
			}
		}
		
		public void msgSendAll(String msg) {
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}
}
