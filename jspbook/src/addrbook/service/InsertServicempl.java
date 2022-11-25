package addrbook.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import addrbook.model.AddrDao;
import addrbook.model.AddrDto;

public class InsertServicempl implements InsertService {
	// 메소드 객체 선언
	private AddrDao addrDao;
	// 주소록 객체 선언
	private AddrDto addrDto;
	
	// 생성자(?)
	public InsertServicempl() {
		addrDto = AddrDto.getInstance();
	}
	
	// 메소드 선언
	@Override
	public boolean execute(HttpServletRequest request, HttpServletResponse response) {
		return addrDao.insertDB(addrDto);
	}
}
