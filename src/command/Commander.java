package command;


import enums.Action;

import javax.servlet.http.HttpServletRequest;

import command.*;



public class Commander {

	public static  Command order(HttpServletRequest request) {
		Command cmd = null;
		switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
		case MOVE :
			System.out.println("무브진입");
			cmd = new MoveCommand(request);
			break;
		case JOIN : 
			System.out.println("조인진입");
			cmd =new CreateCommand(request);
		case LOGIN : 
			System.out.println("로그인 진입");
			cmd = new LoginCommand(request);
			break;
		case RETRIEVE :
			cmd = new RetrieveCommand(request);
			break;
		case SEARCH :
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
