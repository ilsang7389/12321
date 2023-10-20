package exam;

import org.springframework.beans.factory.annotation.Autowired;

public class SecurityImple  implements BIzService{
	@Autowired
	BIzService biz ;
	@Override
	public void securityMethod() {
		
		System.out.println("비지니스 로직 3 수행");
		
	}
	

}
