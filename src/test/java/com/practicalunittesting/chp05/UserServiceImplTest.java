package com.practicalunittesting.chp05;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Created by m3c0d3 on 1/16/2018.
 */
public class UserServiceImplTest {


    public static final String PASS_1 = "pass1";
    public static final String MD_5_FOR_PASS_1 = "md5forpass1";
    private User user = mock(User.class);
    private UserDAO userDAO = mock(UserDAO.class);
    private SecurityService securityService = mock(SecurityService.class);

    @Test
    public void assignPassword_shouldAssignPassword() throws Exception {
        UserServiceImpl userServiceImpl = new UserServiceImpl(userDAO, securityService);

        userServiceImpl.assignPassword(user);

        verify(user).setPassword(MD_5_FOR_PASS_1);
    }

    @Before
    public void setUp() {
        when(user.getPassword()).thenReturn(PASS_1);
        when(securityService.md5(PASS_1)).thenReturn(MD_5_FOR_PASS_1);
    }

    @Test
    public void assignPassword_shouldCallUpdateUser() throws Exception {
        UserServiceImpl userServiceImpl = new UserServiceImpl(userDAO, securityService);

        userServiceImpl.assignPassword(user);

        verify(userDAO).updateUser(user);
    }


}