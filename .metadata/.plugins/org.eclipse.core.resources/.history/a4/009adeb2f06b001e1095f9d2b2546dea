package ex5_collection;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ChildMapMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex5_collection/map_child.xml");
		Ex2_Map ref = ctx.getBean("map2", Ex2_Map.class);
		Map<String, String> maps = ref.getMap();
		System.out.println(maps);
		
		  // for 를 사용하여 key와 value 출력
        for (Map.Entry<String, String> e : maps.entrySet()) {
            System.out.println("key=> " + e.getKey() + ", value=> " + e.getValue());
        }
		
	}

}
