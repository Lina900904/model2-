package command;

import javax.servlet.http.HttpServletRequest;

import dao.MemberDAOImpl;
import domain.MemberBean;
import enums.*;
import service.MemberServiceImpl;

public class LoginCommand extends Command {
	public LoginCommand (HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		execute();
		
	}
	@Override
	public void execute() {
		switch(Domain.valueOf(Sentry.cmd.domain.toUpperCase())) {
		case MEMBER : 
			System.out.println("멤버안으로 진입");
			MemberBean lom= new MemberBean();
			lom.setId(request.getParameter("userid"));
			lom.setPassword(request.getParameter("password"));
		MemberServiceImpl.getInstance().login(lom);
			break;
		default:
			break;
		
	}
}
	
}
