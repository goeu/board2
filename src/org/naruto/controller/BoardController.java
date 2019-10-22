package org.naruto.controller;

import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.naruto.dao.BoardDAO;
import org.naruto.dao.BoardDAOImple;
import org.naruto.domain.BoardVO;
import org.zerock.dto.PagingDTO;

/**
 * Servlet implementation class BoardController
 */
@WebServlet("/board/*") // board로 시작하는 모든 애들 다받음
public class BoardController extends BasicController {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BoardController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value = "/board/register", type = "GET")
	public String add(HttpServletRequest req, HttpServletResponse res) throws Exception {

		System.out.println("add...............");
		return "/board/register";
	}

	@RequestMapping(value = "/board/list", type = "GET")
	public String list(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// 파라미터 값 받아오고
		String page = req.getParameter("page");
		String amount = req.getParameter("amount");

		int page1 = page == null ? 1 : Integer.parseInt(page);
		int amount1 = amount == null ? 10 : Integer.parseInt(amount);

		PagingDTO dto = new PagingDTO();
		dto.setPage(page1);
		dto.setAmount(amount1);

		BoardDAO dao = new BoardDAOImple();
		List<BoardVO> list = dao.getList(dto);
		req.setAttribute("list", list);
		System.out.println("list...............");

		return "/board/list";
	}

	@RequestMapping(value = "/board/write", type = "GET")
	public String addGet(HttpServletRequest req, HttpServletResponse res) throws Exception {

		return "redirect:/board/register";
	}

	@RequestMapping(value = "/board/register", type = "POST")
	public String addPost(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		String writer = req.getParameter("writer");
		BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setContent(content);
		vo.setWriter(writer);
		BoardDAO dao = new BoardDAOImple();
		boolean insert = dao.insert(vo);
		System.out.println(insert);
		System.out.println("add.post.................");
		System.out.println(req.getParameter("title"));

		return "redirect:/list";
	}

}
