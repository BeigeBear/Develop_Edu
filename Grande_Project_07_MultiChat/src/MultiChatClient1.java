
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//
//
//


public class MultiChatClient1 implements ActionListener, Runnable {
	private String ip; // 클라이언트 접속시 자동으로 ip를 받아서 입력
	private String id;
	private Socket socket;
	private BufferedReader inMsg = null;
	private PrintWriter outMsg = null;
	
	private JPanel loginPanel;
	private JButton loginButton;
	private JLabel label1;
	private JTextField idInput;
	private JPanel logoutPanel;
	private JLabel label2;
	private JButton logoutButton;
	private JPanel msgPanel;
	private JTextField msgInput;
	private JButton exitButton;
	private JFrame jframe;
	private JTextArea msgOut;
	private Container tab;
	private CardLayout clyout;
	private Thread thread;
	boolean status;

	public MultiChatClient1(String ip) {
		this.ip = ip;
		
		// 로그인 패널
		loginPanel = new JPanel();
		loginPanel.setLayout(new BorderLayout());
		
		label1 = new JLabel("대화명");
		loginPanel.add(label1, BorderLayout.WEST);
		idInput = new JTextField(10);
		loginPanel.add(idInput, BorderLayout.CENTER);
		loginButton = new JButton("입장하기");
		loginButton.addActionListener(this);
		loginPanel.add(loginButton, BorderLayout.EAST);
		
		// 로그아웃 패널
		logoutPanel = new JPanel();
		logoutPanel.setLayout(new BorderLayout());
		
		label2 = new JLabel();
		logoutPanel.add(label2, BorderLayout.CENTER);
		
		logoutButton = new JButton("나가기");
		logoutButton.addActionListener(this);
		logoutPanel.add(logoutButton, BorderLayout.EAST);
		
		// 메세지 패널
		msgPanel = new JPanel();
		msgPanel.setLayout(new BorderLayout());
		
		msgInput = new JTextField(30);
		msgInput.addActionListener(this);
		msgPanel.add(msgInput, BorderLayout.CENTER);
		
		// 종료 패널
		exitButton = new JButton("채팅 종료");
		exitButton.addActionListener(this);
		msgPanel.add(exitButton, BorderLayout.CENTER);
	
		// 탭(메인) 패널
		tab = new JPanel();
		clyout = new CardLayout();
		tab.setLayout(clyout); // 탭의 레이아웃을 카드 전환 레이아웃으로 설정
		tab.add(loginPanel, "login");
		tab.add(logoutPanel, "logout");
		
		jframe = new JFrame("::온라인 채팅방::");
		msgOut = new JTextArea("",10,30); // 메세지 출력 창
		msgOut.setEditable(false);
		JScrollPane jsp = new JScrollPane(msgOut, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); // 출력 창-스크롤 설정 
		jframe.add(tab, BorderLayout.NORTH);
		jframe.add(jsp, BorderLayout.CENTER);
		jframe.add(msgPanel, BorderLayout.SOUTH);
		clyout.show(tab, "login"); // 처음의 탭이 로그인을 보여달라
		
		jframe.pack();
		jframe.setResizable(true);
		jframe.setVisible(true);
	}
	
	// 액션 메소드
	public void actionPerformed(ActionEvent arg0) {
		Object obj = arg0.getSource();
		if(obj == exitButton){
			System.exit(0);
			
		} else if (obj == loginButton) {
			id = idInput.getText(); 
			label2.setText("대화명 : "+id);
			clyout.show(tab, "logout");
			connectServer(); // 서버 연결 실행 
			// 안에 run 포함되어야함.
		
		} else if (obj == logoutButton) {
			outMsg.println(id + "/"+"logout");
			msgOut.setText(" ");
			clyout.show(tab, "login");
			outMsg.close();
			try {
				inMsg.close();
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			status = false;
		} else if (obj == msgInput) {
			outMsg.println(id + "/" + msgInput.getText());
			// 내보내는 메세지에 id와 메세지 입력을 얻어서 한다.
			msgInput.setText(" ");
			// 처음 공백 처리
		}
	}
	
	/////// 기능적 메소드 ///////
	
	
	
	
	// 메세지 읽기 run
	public void run() {
		inMsg = new BufferedReader(System.in);
		// inMsg가 종료되면 msg에서 읽을 수 없으니 자동으로 종료된다
		String msg;
		String[] rmsg;
		status = true;
		while (status) {
			try {
				msg = inMsg.readLine(); // 줄 단위로 읽는 것
				rmsg = msg.split("/"); // "/"를 기준으로 문자열 msg를 배열로 구분하여 저장
				msgOut.append(rmsg[0] + ">" + rmsg[1] + "\n");
				// rmsg[0]은 대화명id가 들어가야하고 그 다음 /로 rmsg[1]에 메세지가 들어와야한다.
				// 그렇다면 msg를 run에서 입력을 해줄 때 대화명과 대화를 묶어서 /을 삽입하여 보내주어야한다.
				msgOut.setCaretPosition(msgOut.getDocument().getLength()); // 자동 스크롤
			} catch (Exception e) {
				status = false;
			}
		}
		System.out.println("[MutiChatClient]" + thread.getName() + "종료됨"); // while 반복 종료 후 종료 메세지
	}
	
	public void connectServer() {
		socket = new Socket("172.30.1.7", 7777); // 선언
		
	
		
		
		
		
		
		inMsg = new BufferedReader(new InputStreamReader(arg0));
		outMsg = new PrintWriter(out)
		
		try {
			
			
			
			
			
			
			
			
			
			
			
			
			System.out.println("[Client]Server 연결 성공!!");
			
		} catch (Exception e) {
			System.out.println("접속 예외 발생!");
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		MultiChatClient1 client1 = new MultiChatClient1("InetAddress.getLocalHost()");
		
		client1
	}
}

