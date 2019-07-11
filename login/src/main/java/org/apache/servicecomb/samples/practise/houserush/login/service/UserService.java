package org.apache.servicecomb.samples.practise.houserush.login.service;

import org.apache.servicecomb.samples.practise.houserush.login.aggregate.User;

public interface UserService {
    User createUser(User user);

    User findUser(int id);

    User updateUser(User user);

    void removeUser(int id);
}
