package org.apache.servicecomb.samples.practise.houserush.login.dao;

import org.apache.servicecomb.samples.practise.houserush.login.aggregate.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
