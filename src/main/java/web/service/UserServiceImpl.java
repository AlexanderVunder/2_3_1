package web.service;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;


@Component
public class UserServiceImpl implements UserService {

    List<User> userList;

    {
        userList = new ArrayList<>();
        userList.add(new User("User1", "Lastname1"));
        userList.add(new User("User2", "Lastname2"));
        userList.add(new User("User3", "Lastname3"));
        userList.add(new User("User4", "Lastname4"));
    }


    @Override
    public List<User> getUserByNumber(int number) {
        List<User> res = new ArrayList<>();
        if (number >= 5) {
            res.addAll(userList);
        } else {
            for (int i = 0; i < number; i++) {
                res.add(userList.get(i));
            }
        }
        return res;
    }
}
