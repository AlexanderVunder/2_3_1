package web.service;
import org.springframework.stereotype.Component;
import web.dao.UserDao;
import web.model.User;
import java.util.List;


@Component
public class UserServiceImpl implements UserService {

    final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public User show(int id) {
        return userDao.show(id);
    }

    @Override
    public void update(int id, User updateUser) {
        userDao.update(id,updateUser);
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }
}
