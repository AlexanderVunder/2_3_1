package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao{

    int id = 4;
    List<User> userList;

    {
        userList = new ArrayList<>();
        userList.add(new User(1,"User1", "Lastname1"));
        userList.add(new User(2,"User2", "Lastname2"));
        userList.add(new User(3,"User3", "Lastname3"));
        userList.add(new User(4,"User4", "Lastname4"));
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(userList);
    }

    @Override
    public void save(User user) {
        user.setId(++id);
        userList.add(user);
    }

    @Override
    public User show(int id) {
        return userList.stream().filter(user ->user.getId()==id).findAny().orElse(null);
    }

    @Override
    public void update(int id, User updateUser) {
        User user = show(id);
        user.setName(updateUser.getName());
        user.setLastName(updateUser.getLastName());
    }

    @Override
    public void delete(int id) {
        userList.removeIf(user -> user.getId() == id);
    }
}
