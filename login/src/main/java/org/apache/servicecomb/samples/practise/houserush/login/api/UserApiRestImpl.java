package org.apache.servicecomb.samples.practise.houserush.login.api;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.apache.servicecomb.samples.practise.houserush.login.aggregate.User;
import org.apache.servicecomb.samples.practise.houserush.login.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestSchema(schemaId = "userApiRest")
@RequestMapping("/")
public class UserApiRestImpl implements UserApi {
    @Autowired
    UserDao userDao;

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userDao.save(user);
    }

    @GetMapping("/users/{id}")
    public User findUser(@PathVariable int id) {
        return userDao.findOne(id);
    }

    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable int id,@RequestBody User user) {
        user.setId(id);
        return userDao.save(user);
    }

    @DeleteMapping("/users/{id}")
    public void removeUser(@PathVariable int id) {
        userDao.delete(id);
    }
}
