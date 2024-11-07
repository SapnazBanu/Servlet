package com.xworkz.compnayServlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.companyDTO.CompanyDTO;
import com.xworkz.compnayImplement.CompanyImpl;
import com.xworkz.compnayService.CompanyService;

@WebServlet(loadOnStartup = 1, urlPatterns = "/submitProduct")
public class CompanyServlet extends HttpServlet {

	public CompanyServlet() {
		System.out.println("no args const");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {

		String CompanyName = arg0.getParameter("companyName");
		String ProductName = arg0.getParameter("productName");
		String ProductType = arg0.getParameter("productType");
		String ProductQuantity = arg0.getParameter("productQuantity");
		String cost = arg0.getParameter("productCost");

		// Null and format checks for ProductQuantity and ProductCost
		int ref1 = 0;
		double ref2 = 0.0;

		try {
			if (ProductQuantity != null && !ProductQuantity.isEmpty()) {
				ref1 = Integer.valueOf(ProductQuantity);
			} else {
				System.out.println("Product Quantity is missing or invalid.");
			}

			if (cost != null && !cost.isEmpty()) {
				ref2 = Double.valueOf(cost);
			} else {
				System.out.println("Product Cost is missing or invalid.");
			}

		} catch (NumberFormatException e) {
			System.out.println("Error in parsing Product Quantity or Product Cost: " + e.getMessage());
		}

		double totalCost = ref1 * ref2;

		CompanyDTO dto = new CompanyDTO(CompanyName, ProductName, ProductType, ref1, ref2);
		CompanyService service = new CompanyImpl();
		boolean isvalid = service.validate(dto);

		if (isvalid) {
			System.out.println("details are valid");
			arg0.setAttribute("success", "product details are valid");
			arg0.setAttribute("ProductName", ProductName);
			arg0.setAttribute("totalCost", totalCost);
		} else {
			System.out.println("details are invalid");
			arg0.setAttribute("failure", "product details are invalid");
			arg0.setAttribute("valid", "validation error");
			arg0.setAttribute("value", new CompanyDTO(CompanyName, ProductName, ProductType));
			arg0.setAttribute("dto", new CompanyDTO(CompanyName, ProductName, ProductType, ref1, ref2));
		}

		RequestDispatcher requestDispatcher = arg0.getRequestDispatcher("/Product.jsp");
		requestDispatcher.forward(arg0, arg1);
	}
}
