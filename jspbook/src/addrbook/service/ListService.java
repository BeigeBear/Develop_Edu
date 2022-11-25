package addrbook.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import addrbook.model.AddrDto;
//

public interface ListService {
	// 메소드 선언
	public ArrayList<AddrDto> execute(HttpServletRequest request, HttpServletResponse response);
}
