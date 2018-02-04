package ilove.mybatis.service.impl;

import ilove.mybatis.dao.UserMapper;
import ilove.mybatis.model.User;
import ilove.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    public void addUser(User user) {
        userMapper.insert(user);
    }

    public User getUserById(Long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
