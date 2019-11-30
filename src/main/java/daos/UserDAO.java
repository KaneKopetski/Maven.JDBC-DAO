package daos;

import models.User;

import java.util.Set;

public interface UserDAO {
    User getUserByUserNameAndPassword(String user, String pass);
    User findById(Integer id);
    Set<User> findAll();
    Boolean update(User dto);
    Boolean create(User dto);
    Boolean delete(Integer id);
}
