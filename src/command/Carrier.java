package command;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Carrier { //해당 페이지로 이동하는 역할만
	public static void forword(HttpServletRequest request,
			HttpServletResponse response) {
	try {
		System.out.println("뷰:"+Sentry.cmd.getView());
		request
		.getRequestDispatcher(Sentry.cmd.getView())
		.forward(request, response);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public static void redirect(HttpServletRequest request,
			HttpServletResponse response, String url) {
		try {
			response.sendRedirect(request.getContextPath()+url);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
	}
	
}
