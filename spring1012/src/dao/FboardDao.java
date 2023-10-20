package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dto.FboardDTO;
import factory.FactoryService;

public class FboardDao {
	
	private static FboardDao dao; //static 에다 private으로 하고
	private FboardDao() {}
	public synchronized static FboardDao getDao() { // 여기서 필요할때마다 한개씩 꺼내서 쓰기
		if(dao == null) {
			dao = new FboardDao();
		}
		return dao;
	}
	
	// insert
	public void addFboard(FboardDTO vo) {  //commit대신 opensession에 트루를 넣어서 완성가능
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.insert("fb.add",vo);
		//ss.commit();
		ss.close();
	}
	// select
	public List<FboardDTO> listboard(){
		SqlSession ss = FactoryService.getFactory().openSession(true);
		List<FboardDTO> list = ss.selectList("fb.list");
	
		ss.close();
		return list;
	}
	//detail
	
	
}
