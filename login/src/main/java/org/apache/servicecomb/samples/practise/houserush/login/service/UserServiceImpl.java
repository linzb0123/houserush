package org.apache.servicecomb.samples.practise.houserush.login.service;

import org.apache.servicecomb.samples.practise.houserush.login.aggregate.User;
import org.apache.servicecomb.samples.practise.houserush.login.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataRetrievalFailureException;

public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    public User createUser(User user) {
        return userDao.save(user);
    }


    public User findUser(int id) {
        return userDao.findOne(id);
    }

    public User updateUser(User user) {
        int id = user.getId();
        if (userDao.exists(id)) {
            return userDao.save(user);
        }
        else {
            throw new DataRetrievalFailureException("cannot update non-existed user");
        }
    }

    public void removeUser(int id) {
        userDao.delete(id);
    }
}
