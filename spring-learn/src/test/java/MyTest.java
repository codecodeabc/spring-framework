

import com.cpp.project.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author enter
 * @date 2021/9/24
 */
public class MyTest {

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		User bean = context.getBean(User.class);
		System.out.println(bean.getName());
	}
}