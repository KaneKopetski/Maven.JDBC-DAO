package daos;

import models.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DAOTest {
    DAO dao;

    @Before
    public void setup() {
        dao = new DAO();
    }

    @Test
    public void findById() {
        User fetched = dao.findById(2);
        Integer expected = 2;
        Integer actual = fetched.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUserByUserNameAndPassword() {
    }

    @Test
    public void findAll() {
    }

    @Test
    public void update() {
    }

    @Test
    public void create() {
    }

    @Test
    public void delete() {
    }
}