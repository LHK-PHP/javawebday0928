import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	//һ��Servlet������������ ʵ��������ʼ�����ṩ�������٣������� �����������


	  //��ȡProperties������
	/*
	 * private void readPropertiesByClass() { // ��ȡProperties·����Ϣ InputStream
	 * inputStream = getClass() .getResourceAsStream("test.properties"); Properties
	 * properties = new Properties(); try { // ���� properties.load(inputStream); //
	 * getProperty()�����ڲ�����get()�������ؽ����װ��String���� String name =
	 * properties.getProperty("name"); String weight =
	 * properties.getProperty("Weight"); String height =
	 * properties.getProperty("height");
	 * System.out.println("name:"+name+"--weight:"+weight+"--height:"+height); }
	 * catch (IOException e) { e.printStackTrace(); } }
	 */
	  
	  
	// service����ֱ����doGet��doPost
	/*
	 * protected void service(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException {
	 * 
	 * String name = request.getParameter("name"); String password =
	 * request.getParameter("password");
	 * 
	 * String html = null;
	 * 
	 * if ("admin".equals(name) && "123".equals(password)) html =
	 * "<div style='color:green'>success</div>"; else html =
	 * "<div style='color:red'>fail</div>";
	 * 
	 * PrintWriter pw = response.getWriter(); pw.println(html);
	 * 
	 * }
	 */
	//��ʼ��
	 public LoginServlet() {
	        System.out.println("LoginServlet ���췽�� ������");
	    }
	 
	    public void init(ServletConfig config) {
	        System.out.println("init(ServletConfig)");
	    }
	 
	    protected void service(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	 
	        // �ṩ����
	    	String name =
	  			  request.getParameter("name"); String password =
	  			  request.getParameter("password");
	  			  
	  			  String html = null;
	  			  
	  			  if ("admin".equals(name) && "123".equals(password)) html =
	  			  "<div style='color:green'>��½�ɹ�</div>"; else html =
	  			  "<div style='color:red'>��½ʧ��</div>";
	  			  //��仰��Ŀ���Ǹ�������������·���Ϣ����������ʱ��ʹ��UTF-8���룬����ʶ������
	  			  response.setContentType("text/html; charset=UTF-8");
	  			  PrintWriter pw = response.getWriter(); pw.println(html); }
	 
}