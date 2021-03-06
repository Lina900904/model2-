package command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import domain.MemberBean;
import enums.Domain;
import service.MemberServiceImpl;

public class SearchCommand extends Command {
	
	private List<MemberBean> member;

	public List<MemberBean> getMember() {
		return member;
	}

	public SearchCommand(HttpServletRequest request) {
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
			this.member=
			MemberServiceImpl.getInstance().memberfindByName(request.getParameter("teamid"));
			break;

		default:
			break;
		}
		super.execute();
	
	
	}


	
	
}
