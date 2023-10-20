package action;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ActionForward;
import dao.FboardDao;
import dto.FboardDTO;
// list
public class FBoardAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String url = "fboard/fboardList";
		boolean method = false;
		//dao 연결 사용
		List<FboardDTO> list = FboardDao.getDao().listboard();
		request.setAttribute("list", list);
		request.setAttribute("msg", "Listpage!");
		return new ActionForward(url, method);
	}
	

}
