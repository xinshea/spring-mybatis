package ilove;

import ilove.mybatis.model.User;
import ilove.mybatis.service.UserService;
import ilove.mybatis.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App
{

    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
        UserService userService = (UserServiceImpl)ac.getBean("UserServiceImpl");
        User user = new User();
        user.setAge(11);
        user.setName("zhaoxinyuan");
        user.setSex(1);
//        userService.addUser(user);
        userService.getUserById(1L);
        System.out.println(user.getAge());
    }
}
