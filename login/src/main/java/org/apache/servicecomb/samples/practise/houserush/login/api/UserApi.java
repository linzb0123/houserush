package org.apache.servicecomb.samples.practise.houserush.login.api;

import org.apache.servicecomb.samples.practise.houserush.login.aggregate.User;

public interface UserApi {
    User createUser(User user);

    User findUser(int id);

    User updateUser(int id, User user);

    void removeUser(int id);
}
