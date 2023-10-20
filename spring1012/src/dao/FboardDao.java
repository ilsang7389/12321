package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dto.FboardDTO;
import factory.FactoryService;

public class FboardDao {
	
	private static FboardDao dao; //static ���� private���� �ϰ�
	private FboardDao() {}
	public synchronized static FboardDao getDao() { // ���⼭ �ʿ��Ҷ����� �Ѱ��� ������ ����
		if(dao == null) {
			dao = new FboardDao();
		}
		return dao;
	}
	
	// insert
	public void addFboard(FboardDTO vo) {  //commit��� opensession�� Ʈ�縦 �־ �ϼ�����
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
