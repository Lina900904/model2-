package enums;

public enum Term {
	WEBPATH, MAIN, CONTEXT;
	
	@Override
	public String toString() {
		String res = "";
		switch(this) {
		case CONTEXT : 
			res = "context";
			break;
		case WEBPATH : 
			res = "/WEB-INF/view/";
			break;
		case MAIN : 
			res = "/main.jsp";
			break;
		
		


		}
		return res;
	}
}
