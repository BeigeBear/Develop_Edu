import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Booklist {
	Connection con;
	
	public Booklist() {
		String Driver="";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "scott";
		String pwd = "tiger";
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("데이터베이스 연결 준비...");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
		
	
	private void sqlRun() {
		String query="SELECT * FROM book";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("BOOK NO \tBOOK NAME \t\tPUBLISHER \tPRICE");
			while(rs.next()) {
				System.out.print("\t"+rs.getInt(1));
				System.out.print("\t"+rs.getString(2));
				System.out.print("\t"+rs.getString(3));
				System.out.println("\t"+rs.getInt(4));
			}
			con.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Booklist so = new Booklist();
		so.sqlRun();
	}
}
