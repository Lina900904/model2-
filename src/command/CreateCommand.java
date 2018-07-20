package command;

import javax.servlet.http.HttpServletRequest;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

import domain.MemberBean;
import enums.Domain;
import service.MemberServiceImpl;

public class CreateCommand extends Command{
	MemberBean joinm;
	public CreateCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		execute(); //this.이 생략되어있다
	}
	
	@Override
	public void execute() {
		switch(Domain.valueOf(domain.toUpperCase())) { 
		case MEMBER:
			System.out.println("조인안으로 진입");
			joinm = new MemberBean();			 
			joinm.setId(request.getParameter("userid"));
			joinm.setName(request.getParameter("name"));
			joinm.setPassword(request.getParameter("password"));
			joinm.setSsn(request.getParameter("ssn"));
			MemberServiceImpl.getInstance().membercreateJoin(joinm);	
			System.out.println("회원가입 성공");
		
			break;

		default:
			break;
		
		}
		super.execute();
		

		
	}
	
	
}
