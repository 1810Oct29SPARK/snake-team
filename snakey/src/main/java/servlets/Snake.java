package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import services.SnakeService;
import services.SnakeServiceImpl;

/**
 * Servlet implementation class Snake
 */
public class Snake extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ObjectMapper om = new ObjectMapper();
	 SnakeService snakeservice= new SnakeServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Snake() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		switch (request.getRequestURI()) {
		case "/snakey/snake":
		int id = Integer.parseInt(request.getParameter("id"));
		response.getWriter().write(om.writeValueAsString(snakeservice.getSnakeByID(id)));
		break;
		case "/snakey/snakes":
			response.getWriter().write(om.writeValueAsString(snakeservice.getAllSnakes()));
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
