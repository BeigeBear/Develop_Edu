package addrbook.service;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import addrbook.model.AddrDao;
import addrbook.model.AddrDto;

public class ListServicempl implements ListService {
	// 클래스 객체 선언
	private AddrDao addrDao;
	
	// 생성자
	public ListServicempl() {
		addrDao = AddrDao.getInstance();
	}
	
	// 메소드 선언
	@Override
	public ArrayList<AddrDto> execute(HttpServletRequest request, HttpServletResponse response) {
		// 모델의 DB리스트를 불러오는 메소드를 실행하여 반환
		return addrDao.getDBList();
	}
}
