package command;

import javax.servlet.http.HttpServletRequest;

import domain.MemberBean;
import enums.Domain;
import service.MemberServiceImpl;

public class DeleteCommand extends Command{
	public DeleteCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		execute();
		
	}
	
	@Override
	public void execute() {
		switch (Domain.valueOf(Sentry.cmd.domain.toUpperCase())) {
		case MEMBER:
			MemberBean dm = new MemberBean();
			dm.setId(request.getParameter("id"));
			dm.setPassword(request.getParameter("pass"));
			MemberServiceImpl.getInstance().memberDelete(dm);
			break;

		default:
			break;
		}
	
	}

}
