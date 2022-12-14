package web.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao{
    @PersistenceContext
    private final EntityManager entityManager;
    @Autowired
    public UserDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public User show(int id) {
        TypedQuery<User> query = entityManager.createQuery(
                "select u from User u where u.id = :id", User.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public void update(int id, User updateUser) {
        User user = show(id);
        user.setName(updateUser.getName());
        user.setLastName(updateUser.getLastName());
        entityManager.merge(user);
    }

    @Override
    public void delete(int id) {
        User user = show(id);
        entityManager.remove(user);
    }
}
