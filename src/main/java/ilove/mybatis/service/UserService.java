package ilove.mybatis.service;


import ilove.mybatis.model.User;

public interface UserService {

    void addUser(User user);

    User getUserById(Long userId);
}
