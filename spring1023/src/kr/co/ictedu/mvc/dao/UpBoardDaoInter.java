package kr.co.ictedu.mvc.dao;

import java.util.List;
import java.util.Map;

import kr.co.ictedu.mvc.dto.BoardVO;
import kr.co.ictedu.mvc.dto.FboardDTO;

public interface UpBoardDaoInter {
	
	public void upboardAdd(BoardVO vo);
	public List<BoardVO> upboardList(Map<String, String> map);
	public int getTotal();
	public void updateHit(int num);
	public BoardVO detailupboard(int num);
	public void updateupboard(BoardVO vo); //¼öÁ¤
	public void deleteupboard(int num);



}
