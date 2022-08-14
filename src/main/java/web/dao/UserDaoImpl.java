package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao{

    List<User> userList;

    {
        userList = new ArrayList<>();
        userList.add(new User("User1", "Lastname1"));
        userList.add(new User("User2", "Lastname2"));
        userList.add(new User("User3", "Lastname3"));
        userList.add(new User("User4", "Lastname4"));
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(userList);
    }
}
