package command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import domain.MemberBean;
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
		 request.setAttribute("member", MemberServiceImpl.getInstance().memberfindById(request.getParameter("id")));
		 super.execute();
		
		
	}
}
