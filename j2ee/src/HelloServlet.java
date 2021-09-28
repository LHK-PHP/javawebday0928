import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response){
		
		try {
			response.getWriter().println("<h1>九九乘法表</h1>");
			for(int i=1 ; i <= 9 ; i++) {//打印9行
				for(int j=1; j<= i ; j++) {
				System.out.print(""+i+"*"+j+"="+i*j+" ");
				}
				System.out.println();//换行
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
