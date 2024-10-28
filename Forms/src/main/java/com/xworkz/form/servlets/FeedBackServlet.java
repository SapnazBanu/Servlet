package com.xworkz.form.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.form.dto.FeedBackdto;

@WebServlet(loadOnStartup = 1, urlPatterns = "/feedback")

public class FeedBackServlet extends HttpServlet {
	public FeedBackServlet() {
		System.out.println("Created no-arg const of FeedBackServlet");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("no-arg const of FeedBackServlet");
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running service in FeedBackServlet...");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String comments = req.getParameter("comments");

		FeedBackdto feedBackDTO = new FeedBackdto(name, email, comments);

		System.out.println("feedBackDTO:" + feedBackDTO);
		System.out.println("after getting all par");

	}

}