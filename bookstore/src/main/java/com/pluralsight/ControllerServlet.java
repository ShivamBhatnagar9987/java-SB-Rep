package com.pluralsight;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */

public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DBConnection dbConnection;

	@Inject
	private BookDAO bookDAO;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	public void init() {
		dbConnection = new DBConnection();
		bookDAO = new BookDAO(dbConnection.getConnection());
	}

	public void destroy() {
		dbConnection.disconnect();
	}

	public ControllerServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getPathInfo();

		try {
			switch (action) {
			case "/admin":
				showBookAdmin(request, response);
				break;
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertBook(request, response);
				break;
			case "/delete":
				deleteBook(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateBook(request, response);
				break;
			default:
				listBooks(request, response);
				break;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void showBookAdmin(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, SQLException, ServletException, IOException {
		ArrayList<Book> books_list = bookDAO.listAllBooks();

		request.setAttribute("books", books_list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/BookAdmin.jsp");
		dispatcher.forward(request, response);
	}

	private void listBooks(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, SQLException, ServletException, IOException {
		ArrayList<Book> books_list = bookDAO.listAllBooks();

		request.setAttribute("books", books_list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/BookList.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/BookForm.jsp");
		dispatcher.forward(request, response);
	}

	private void insertBook(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		String title = request.getParameter("booktitle");
		String author = request.getParameter("bookauthor");
		String priceString = request.getParameter("bookprice");

		Book newBook = new Book(title, author, Float.parseFloat(priceString));

		bookDAO.insertBook(newBook);
		response.sendRedirect("list");
	}

	private void deleteBook(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		bookDAO.deleteBook(id);

		resp.sendRedirect("list");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("This is the doPost() method!");
		doGet(request, response);

	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Book book = bookDAO.getBook(id);
		RequestDispatcher rd = request.getRequestDispatcher("/BookForm.jsp");
		request.setAttribute("book", book);
		rd.forward(request, response);

	}

	public void updateBook(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String title = request.getParameter("booktitle");
		String author = request.getParameter("bookauthor");
		float price = Float.parseFloat(request.getParameter("bookprice"));
		Book book = new Book(id, title, author, price);
		bookDAO.updateBook(book);

		response.sendRedirect("list");
	}

}