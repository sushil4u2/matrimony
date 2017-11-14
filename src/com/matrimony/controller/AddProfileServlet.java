package com.matrimony.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.matrimony.bean.Profile;
import com.matrimony.dao.ProfileDAO;
import com.matrimony.dao.ProfileDAOIMPL;

/**
 * Servlet implementation class AddProfileServlet
 */
@WebServlet("/addProfileServlet")
public class AddProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String agetemp=request.getParameter("age");
		int age=Integer.parseInt(agetemp);
		String mobiletemp=request.getParameter("mobile");
		long mobile=Long.parseLong(mobiletemp);
		String salarytemp=request.getParameter("salary");
		int salary=Integer.parseInt(salarytemp);
		String motherTounge=request.getParameter("motherTounge");
		
		Profile profile=new Profile();
		profile.setName(name);
		profile.setGender(gender);
		profile.setAge(age);
		profile.setMobileNo(mobile);
		profile.setSalary(salary);
		profile.setMotherTounge(motherTounge);
		
		
		ProfileDAO obj=new ProfileDAOIMPL();
		boolean flag=obj.addProfile(profile);
		
		if(flag){
			out.println("Your Profile Added. Thanks for Registering.");
		RequestDispatcher rd= request.getRequestDispatcher("index.jsp");
		rd.include(request, response);
		}//else write code to return to main page
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
