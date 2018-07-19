package command;

import javax.servlet.http.HttpServletRequest;

import enums.Action;
import enums.Domain;
import service.MemberServiceImpl;

public class RetrieveCommand extends Command{
	public RetrieveCommand(HttpServletRequest request){
		setRequest(request);
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		execute();
	}

	
	@Override
	public void execute() {
		switch (Domain.valueOf(Sentry.cmd.domain.toUpperCase())) {
		case MEMBER:
			MemberServiceImpl.getInstance().memberfindById(request.getParameter("id"));
			break;

		default:
			break;
		}
	}
}
