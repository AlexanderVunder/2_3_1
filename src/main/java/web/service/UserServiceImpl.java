package web.service;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;
import java.util.List;


@Component
@Transactional(readOnly = true)
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
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public User show(int id) {

        return userDao.show(id);
    }

    @Override
    @Transactional
    public void update(int id, User updateUser) {

        userDao.update(id,updateUser);
    }

    @Override
    @Transactional
    public void delete(int id) {

        userDao.delete(id);
    }
}
