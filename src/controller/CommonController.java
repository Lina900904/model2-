package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import enums.Domain;
import enums.Term;

@WebServlet("/common.do")
public class CommonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	enum Resources {
		CONTEXT, CSS, JS, IMG
		

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int i = 0;
		for (Resources r : Resources.values()) {		
				request.getSession().setAttribute(r.toString().toLowerCase(),(i == 0)?request.getContextPath():			
					request.getContextPath().toLowerCase() + "Resources" + r.toString().toLowerCase());
				
				System.out.println("r.toString() 값"+r.toString());//	CONTEXT, CSS, JS, IMG
				System.out.println("request.getSession() 값"+request.getSession()); //org.apache.catalina.session.StandardSessionFacade@7da3d2cd
				System.out.println("r.toString().toLowerCase()값 "+r.toString().toLowerCase()); //js, img;
			/*	if(i==0) {
	                request.getSession().setAttribute(r.toString().toLowerCase(), request.getContextPath());
	            }else {
	                System.out.println(request.getContextPath()+"/resources/"+r.toString().toLowerCase());
	                request.getSession().setAttribute(r.toString().toLowerCase(), request.getContextPath()+"/resources/"+r.toString().toLowerCase());
	            }*/
			}

		// HttpSession session = request.getSession(); //가지고와서 객체를 만드는 형태 ,associated된
		// 관계
		// request는 자신의 일부만 session에게 넘겨주므로 죽지않고 남아있음
		// request가 자료를 넘겨줘야만 session은 객체가 됨, 그전엔 객체가 아님
		// 더이상 context를 설정할 필요없음
		request.getSession().setAttribute(Term.CONTEXT.toString(), request.getContextPath());
		request.getRequestDispatcher(Term.WEBPATH.toString() + Term.MAIN.toString()).forward(request, response);
	}
}

