package command;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sentry {
	public static Command cmd = new Command();
	public static void init(HttpServletRequest request, HttpServletResponse response) {
		cmd = Commander.order(request, response); // commander에서 만든 cmd와 다름  커맨더에서 만든건 주소값으 만들고 죽어 그래서 여기에 주소를 남기고 죽음
			
	
	}
}
