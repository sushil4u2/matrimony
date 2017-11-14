package com.matrimony.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
 * Servlet implementation class GetProfileByGender
 */
@WebServlet("/getProfileByGender")
public class GetProfileByGender extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetProfileByGender() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String gender=request.getParameter("myGender");
		
		//PrintWriter out=response.getWriter();
		
		ProfileDAO obj=new ProfileDAOIMPL();
		List<Profile> myPeople=obj.getProfileByGender(gender);
		
		request.setAttribute("myPeople", myPeople);
		RequestDispatcher rd= request.getRequestDispatcher("success.jsp");
		rd.include(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
