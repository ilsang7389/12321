package kr.co.ictedu.mvc.dao;

import java.util.List;
import java.util.Map;

import kr.co.ictedu.mvc.dto.BoardVO;

public interface UpBoardDaoInter {
	
	public void upboardAdd(BoardVO vo);
	public List<BoardVO> upboardList(Map<String, String> map);
	public int getTotal();


}
