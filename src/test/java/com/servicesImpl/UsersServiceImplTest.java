package com.servicesImpl;

import com.daoapi.UsersDao;
import com.entities.Users;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by Aschalew on 13/01/2017. new
 */
public class UsersServiceImplTest {
    private UsersServiceImpl serviceImpe;
    private UsersDao usersDao;
    private Users users;


    @org.junit.Before
    public void setUp() throws Exception {
        serviceImpe = new UsersServiceImpl();
        usersDao = mock(UsersDao.class);

        users= new Users();
        users.setUser_id(12);
        users.setUser_name("Aschalew");
        users.setEmail("aschalew@uk.com");

        serviceImpe.setUserDao(usersDao);
    }

    @Test
    public void testList() throws Exception {
        List<Users> list = new ArrayList<Users>();
        list.add(users);
        when(usersDao.list()).thenReturn(list);

        List<Users> usersList = serviceImpe.list();
        assertEquals(list.size(),usersList.size());
    }

    @Test
    public void testDelete() throws Exception {
        when(usersDao.delete(users)).thenReturn(true);
        boolean val = serviceImpe.delete(users);

        assertTrue(val);

    }
}