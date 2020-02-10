package com.abc.airlinesapp.user.service;

import java.util.ArrayList;
import java.util.List;

import com.abc.airlinesapp.user.model.User;

/**
 * This class provies implementation methods for UserService
 * @author bgsre
 *
 */
public class UserService {
    private List<User> users = new ArrayList<>();

    /**
     * Validate user session token  
     * @param userId
     * @param token
     * @return
     */
    public boolean validateSessionToken(Integer userId, String token) {
        boolean returnValue = false;

        //returnValue = validate the token with the one from the database table USER.USER_LOGIN

        return returnValue;

    }

    /**
     * Validate username/passwd and issue token 
     * @param username
     * @param passwd
     * @return
     */
    public String validateUser(String username, String encpasswd) {
        String token = "";

        //NOTE: passwd will be encrypted when saved in the database
        //token = validate the username and password with database credentials and issue token;

        return token;

    }

    /**
     * Find user by id
     * @param id
     * @return
     */
    public User findById(Integer userId) {

        //find user based on ID using primary key id
        //UserPK pk = new UserPK();
        //ps.getID(userId);
        //UserVO user = (UserVO)userDAO.findByPrimaryKey(pk);
        //return user;

        return new User(userId, "firstName", "lastName");
    }

    /**
     * Find all users
     * @return
     */
    public List<User> findAll() {
        List<User> l = new ArrayList<>();
        //find all the users using User Data Access Object
        //return(getUserDAO.findAll());
        return l;
    }

    /**
     * Add user to the system
     * @param user
     * @return
     */
    public User add(String firstName, String lastName) {

        //insert using DAO
        //UserVO vo = new UserVO();
        //vo.setuserID(id); //id can be generated by sequence or by special pattern
        //vo.setFirstName(firstName);
        //vo.setLastName(lastName);
        //vo=DAO.insert(vo);
        //return vo;

        return new User(1, firstName, lastName);
    }
}