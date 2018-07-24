package command;


import enums.Action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.*;
import domain.MemberBean;



public class Commander {

	public static  Command order(HttpServletRequest request, HttpServletResponse response) {
		Command cmd = null;
		switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
		case MOVE :
			System.out.println("무브진입");
			cmd = new MoveCommand(request);  
			// cmd는 sentry.cmd임
			// 이객체는 case문이 실행되고 나면 사라짐 그래서 sentry.cmd를 만들어서 그곳에 붙어 있게함
			//여러 형태로 sentry.cmd를 만들수있다, 아래처럼(다형성)
			break;
		case JOIN : 
			System.out.println("조인진입");
			cmd =new CreateCommand(request);
			break;
		case LIST :
			cmd = new ListCommand(request);
		case LOGIN : 
			System.out.println("로그인 진입");
			cmd = new LoginCommand(request);
			break;
		case RETRIEVE :
			
			cmd = new RetrieveCommand(request);
			break;
		case SEARCH :
			List<MemberBean> mems= ((SearchCommand) Sentry.cmd).getMember();
			cmd = new SearchCommand(request);
			break;
		case UPDATE :
			cmd = new UpdateCommand(request);
			break;
		case DELETE :
			cmd = new DeleteCommand(request);
			break;

		default:
			break;
			
		
			

		}
		return cmd;
	}
		
}
