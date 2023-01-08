

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServDay3
 */
@WebServlet("/cal")
public class ServDay3 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<head>");
		
		out.print("<title>Calculation</title>");
	
		out.print("</head>");
		
		out.print("<body style='background-color: rgb(226, 215, 200)'>");
		out.print("<center><div style='Margin-top: 13%;background-color:paleturquoise;width:35%;padding-bottom:20px;border-radius: 15px;font-size: 22px;'>");
		
		out.print("<center><h1 style='margin-top:10%; color:red;padding-top:10px;'>Result</h1></center>");
		
		int fNum = Integer.parseInt(request.getParameter("fnum"));
		int sNum = Integer.parseInt(request.getParameter("snum"));
		String opp =request.getParameter("opp");
		
		if(opp.equals("Addition"))
		{
			out.print("<center><center style='background-color:paleturquoise;width:160px;height:30px;padding-top:10px;border-radius:8px;color:navy;padding:20px;font-size:22px;'><b>ADDITION = </b>"+(fNum+sNum)+"</center></center>");
		}
		else if(opp.equals("Substract"))
		{
			out.print("<center><center style='background-color:paleturquoise;width:240px;height:30px;padding-top:10px;border-radius:8px;color:navy;padding:20px;font-size:22px;'><b>SUBTRACTION = </b>"+(fNum-sNum)+"</center></center>");
		}
		else if(opp.equals("Multiple"))
		{
			out.print("<center><center style='background-color:paleturquoise;width:280px;height:30px;padding-top:10px;border-radius:8px;color:navy;padding:20px;font-size:22px;'><b>MULTIPLICATION = </b>"+(fNum*sNum)+"</center></center>");
		}
		else if(opp.equals("Division"))
		{
			out.print("<center><center style='background-color:paleturquoise;width:160px;height:30px;padding-top:10px;border-radius:8px;color:navy;padding:20px;font-size:22px;'><b>Division = </b>"+(fNum/sNum)+"</center></center>");
			out.print("<center><center style='background-color:paleturquoise;width:160px;height:30px;padding-top:10px;border-radius:8px;color:navy;padding:20px;font-size:22px;'><b>Remainder = </b>"+(fNum%sNum)+"</center></center>");
		}
		
		out.print("<a href='index.html'>");
		out.print("<br/><center><button style='Width:130px;height:40px;color:whitesmoke;background-color:cornflowerblue;cursor:pointer;font-size: 18px;border:none;border-radius:8px;' class='btn'>Back to Home</button></center>");
		out.print("</a>");
		
		out.print("</div></center>");
		
		out.print("</body>");
		out.print("</html>");
	}

}


