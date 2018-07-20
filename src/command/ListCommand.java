package command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import domain.MemberBean;
import enums.Action;
import enums.Domain;
import service.MemberServiceImpl;

public class ListCommand extends Command{


	public ListCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		setPage(request.getParameter("page"));
		execute();
	
	}
	
	@Override
	public void execute() {
	request.setAttribute("list", MemberServiceImpl.getInstance().memberList());

	
	super.execute();
	}



	
}
