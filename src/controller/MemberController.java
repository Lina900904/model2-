package controller;

import java.io.IOException;
import java.util.List;

import enums.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Carrier;
import command.SearchCommand;
import command.Sentry;
import domain.MemberBean;
import service.MemberServiceImpl;

@WebServlet( "/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action =request.getParameter("action");
		String page = request.getParameter("page");
		Sentry.init(request, response); // sentry.cmd를 만들었다
		
		
				
			switch(Action.valueOf(Sentry.cmd.getAction().toUpperCase())) {
			case MOVE :
					System.out.println("무브안으로 진입");
					Carrier.forword(request, response);
				break;
			case JOIN: 
				Carrier.redirect(request,response,"/member.do?action=move&page=user_login_form");
				break;
			case COUNT: 
				
				break;
			case LIST : 
				System.out.println("리스트~~~");
				Carrier.redirect(request,response,"/member.do?action=move&page=memberList");				
				break;
			
			case LOGIN :
				if(request.getAttribute("match").equals("TRUE")) {
					Carrier.forword(request, response);
				}else {
					Carrier.redirect(request, response, "/member.do?action=move&page=user_login_result");
				}
		
				break;
			case RETRIEVE :
				Carrier.redirect(request, response, "/member.do?action=move&page=searchIdResult");
				break;
			case SEARCH : 

				Carrier.redirect(request, response, "/member.do?action=move&page=searchTeamResult");
				break;
			case UPDATE : 
				Carrier.redirect(request, response, "/member.do?action=move&page=updateResult");
				
				break;
			case DELETE : 
				Carrier.redirect(request, response, "/member.do?action=move&page=deleteResult");
				break;
				
				
		
			default:
				break;
				
	
				


	}

			}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
