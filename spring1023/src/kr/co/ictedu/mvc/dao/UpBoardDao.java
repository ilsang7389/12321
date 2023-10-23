package kr.co.ictedu.mvc.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ictedu.mvc.dto.BoardVO;
import kr.co.ictedu.mvc.dto.FboardDTO;

@Repository
public class UpBoardDao implements UpBoardDaoInter {

	@Autowired
	private SqlSessionTemplate ss;

	@Override
	public void upboardAdd(BoardVO vo) {
		ss.insert("upboard.add",vo);
	}

	@Override
	public List<BoardVO> upboardList(Map<String, String> map) {
		
		return ss.selectList("upboard.list",map);
	}

	@Override
	public int getTotal() {
		
		return ss.selectOne("upboard.totalCount");
	}
	@Override
	public void updateHit(int num) {
		ss.insert("upboard.hit",num);
	}

	@Override
	public BoardVO detailupboard(int num) {
		return ss.selectOne("upboard.detail",num);
	}

	@Override
	public void updateupboard(BoardVO vo) {
		ss.insert("upboard.update",vo);
		
	}

	@Override
	public void deleteupboard(int num) {
		ss.insert("upboard.del" , num);
		
	}

}
