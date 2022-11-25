package addrbook.model;
//	DAO (Data Access Object)
//	DB의 data에 접근하기 위한 객체
// 	DB에 접근하기 위한 로직을 분리하기 위해 사용

// 	과거 addrBean의 기능

import java.sql.*;
import java.util.ArrayList;
import addrbook.model.*;

public class AddrDao {
	
	// 객체 선언
	private static AddrDao addrDao = new AddrDao();
	
	// 생성자
	private AddrDao() {}
	
	// 싱글톤 패턴 객체 선언
	public static AddrDao getInstance() {
		return addrDao;
	}
	
	//////////////////////////////////////////////////////////////////
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	// 오라클 연결 정보
	String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	String jdbc_url = "jdbc:oracle:thin:@localhost:1521";
	String jdbc_id = "scott";
	String jdbc_pw = "tiger";
	
	
	// 데이터베이스 연결
	void connect() {
		try {
			Class.forName(jdbc_driver);
			
			conn = DriverManager.getConnection(jdbc_url, jdbc_id, jdbc_pw);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// 데이터베이스 연결해제
	void disconnect() {
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	// 주소록 수정 업데이트
	public boolean updateDB(AddrDto addrDto) {
		connect();
		
		String sql = "UPDATE addrbook SET ab_name = ?, ab_email = ?, ab_birth = ?, ab_tel = ?, ab_comdept = ?, ab_memo = ? WHERE ab_id = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, addrDto.getAb_name());
			pstmt.setString(2, addrDto.getAb_email());
			pstmt.setString(3, addrDto.getAb_birth());
			pstmt.setString(4, addrDto.getAb_tel());
			pstmt.setString(5, addrDto.getAb_comdept());
			pstmt.setString(6, addrDto.getAb_memo());
			pstmt.setInt(7, addrDto.getAb_id());
			
			pstmt.executeUpdate();
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			disconnect();
		}
		return true;
	}
	
	
	// 주소록 삭제
	public boolean deleteDB(int gb_id) {
		connect();
		
		String sql = "DELETE FROM addrbook WHERE ab_id = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, gb_id);
			
			pstmt.executeUpdate();
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			disconnect();
		}
		return true;
	}
	
	
	// 주소록 추가
	public boolean insertDB(AddrDto addrDto) {
		connect();
		// sql 문자열, gb_id는 자동 등록되므로 입력하지 않는다.
		
		String sql = "INSERT INTO addrbook(ab_id, ab_name, ab_email, ab_birth, ab_tel, ab_comdept, ab_memo)"
				+ "VALUES(addr_SEQ.nextval, ?, ?, ?, ?, ?, ?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, addrDto.getAb_name());
			pstmt.setString(2, addrDto.getAb_email());
			pstmt.setString(3, addrDto.getAb_birth());
			pstmt.setString(4, addrDto.getAb_tel());
			pstmt.setString(5, addrDto.getAb_comdept());
			pstmt.setString(6, addrDto.getAb_memo());
			
			pstmt.executeUpdate();
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			disconnect();
		}
		return true;
	}
	

	// 주소록 개별 조회
	public AddrDto getDB(int gb_id) {
		connect();
		
		String sql = "select * from addrbook where ab_id=?";
		AddrDto addrDto = AddrDto.getInstance();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,gb_id);
			ResultSet rs = pstmt.executeQuery();
			
			// 데이터가 하나만 있으므로 rs.next()를 한번만 실행 한다.
			rs.next();
			addrDto.setAb_id(rs.getInt("ab_id"));
			addrDto.setAb_name(rs.getString("ab_name"));
			addrDto.setAb_email(rs.getString("ab_email"));
			addrDto.setAb_birth(rs.getString("ab_birth"));
			addrDto.setAb_tel(rs.getString("ab_tel"));
			addrDto.setAb_comdept(rs.getString("ab_comdept"));
			addrDto.setAb_memo(rs.getString("ab_memo"));
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			disconnect();
		}
		return addrDto;
	}
	
	
	// 전체 주소록 목록을 가져오는 메소드
	public ArrayList<AddrDto> getDBList() {
		connect();
		
		ArrayList<AddrDto> addrDtoList = new ArrayList<>();
				
		String sql = "SELECT * "
				+ "FROM addrbook "
				+ "ORDER BY ab_id ASC";
		
		try {
			pstmt = conn.prepareStatement(sql);
		
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				AddrDto addrDto = AddrDto.getInstance();
				
				addrDto.setAb_id(rs.getInt("ab_id"));
				addrDto.setAb_name(rs.getString("ab_name"));
				addrDto.setAb_email(rs.getString("ab_email"));
				addrDto.setAb_birth(rs.getString("ab_birth"));
				addrDto.setAb_tel(rs.getString("ab_tel"));
				addrDto.setAb_comdept(rs.getString("ab_comdept"));
				addrDto.setAb_memo(rs.getString("ab_memo"));
				
				// ArrayList에 추가
				addrDtoList.add(addrDto);
			}
			rs.close();
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			disconnect();
		}
		return addrDtoList;
	}
	
}
