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
	
	//一个Servlet的生命周期由 实例化，初始化，提供服务，销毁，被回收 几个步骤组成


	  //获取Properties的内容
	/*
	 * private void readPropertiesByClass() { // 获取Properties路径信息 InputStream
	 * inputStream = getClass() .getResourceAsStream("test.properties"); Properties
	 * properties = new Properties(); try { // 加载 properties.load(inputStream); //
	 * getProperty()方法内部调用get()并将返回结果包装成String类型 String name =
	 * properties.getProperty("name"); String weight =
	 * properties.getProperty("Weight"); String height =
	 * properties.getProperty("height");
	 * System.out.println("name:"+name+"--weight:"+weight+"--height:"+height); }
	 * catch (IOException e) { e.printStackTrace(); } }
	 */
	  
	  
	// service可以直接用doGet与doPost
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
	//初始化
	 public LoginServlet() {
	        System.out.println("LoginServlet 构造方法 被调用");
	    }
	 
	    public void init(ServletConfig config) {
	        System.out.println("init(ServletConfig)");
	    }
	 
	    protected void service(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	 
	        // 提供服务
	    	String name =
	  			  request.getParameter("name"); String password =
	  			  request.getParameter("password");
	  			  
	  			  String html = null;
	  			  
	  			  if ("admin".equals(name) && "123".equals(password)) html =
	  			  "<div style='color:green'>登陆成功</div>"; else html =
	  			  "<div style='color:red'>登陆失败</div>";
	  			  //这句话的目的是告诉浏览器，等下发消息给服务器的时候，使用UTF-8编码，可以识别中文
	  			  response.setContentType("text/html; charset=UTF-8");
	  			  PrintWriter pw = response.getWriter(); pw.println(html); }
	 
}