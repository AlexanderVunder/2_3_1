package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.List;


public interface UserDao {

    List<User> getAllUsers();

    void save(User user);

    User show(int id);

    void update(int id, User updateUser);

    void delete(int id);
}
