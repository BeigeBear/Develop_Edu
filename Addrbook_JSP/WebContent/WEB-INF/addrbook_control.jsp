<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" errorPage="addrbook_error.jsp" %>
<%@ page import="addrbook.*" %>
<%@ page import="java.util.*" %>
    
<% request.setCharacterEncoding("utf-8"); %>

<jsp:useBean id="ab" class="addrbook.AddrBean" />
<jsp:useBean id="addrbook" class="addrbook.AddrBook" />
<jsp:setProperty name ="addrbook" property="*" />


<%
	String action = request.getParameter("action");

	// List 호출
	if(action.equals("list")) {
	    ArrayList<AddrBook> datas = ab.getDBList();
	    request.setAttribute("datas", datas);
	    pageContext.forward("addrbook_list.jsp");
	}
	
	// Insert 호출
	else if (action.equals("insert")) {
	    if(ab.insertDB(addrbook)){
	    	response.sendRedirect("addrbook_control.jsp?action=list");
	    }
	    else{
	    	throw new Exception("DB입력 오류");
	    }
	}
		
		else if (action.equals("edit")) {
		    AddrBook abook = ab.getDB(addrbook.getAb_id());
		    if(!request.getParameter("upasswd").equals("1234")){		    		    
		    	out.println("<script>alert('비밀번호오류'); history.go(-1);</script>");
		    }
		    else{
		    	request.setAttribute("ab", abook);
		    	pageContext.forward("addrbook_edit_form.jsp");
		    }
		}
		
		else if(action.equals("update")){
		    if (ab.updateDB(addrbook)) {
		        response.sendRedirect("addrbook_control.jsp?action=list");
		    } else {
		        throw new Exception("DB 갱신 오류");
		    }
		}
		
		else if(action.equals("delete")){
			if(ab.deleteDB(addrbook.getAb_id())){
				response.sendRedirect("addrbook_control.jsp?action=list");
			}
			else{
				throw new Exception("DB 삭제 오류");
			}
		}
		else{
			out.println("<script>alert('action 파라미터를 확인하세요')</script>");
		}	

		
		
		
		
		%>