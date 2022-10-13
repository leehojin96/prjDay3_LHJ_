package prjDay3_LHJ;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/studentinput")
public class studentinput extends HttpServlet{
//	ArrayList<studentinput> students = new ArrayList<>();
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("name");
		String eng_ = request.getParameter("eng");
		String kor_ = request.getParameter("kor");
		String grade = request.getParameter("grade");
		
		int eng = Integer.parseInt(eng_);
		int kor = Integer.parseInt(kor_);
		
//		students.add(new Score(name,eng_,kor_,grade));
		
		
}
	
}