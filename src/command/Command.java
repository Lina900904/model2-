package command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.MemberBean;
import lombok.Data;
@Data


public class Command implements Order{


	protected HttpServletRequest request;
	protected String action, domain, page, view;	







	@Override
	public void execute() {
		this.view = "/WEB-INF/view/"+domain+"/"+page+".jsp";
	}

}
