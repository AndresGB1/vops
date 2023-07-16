package com.vops.demo.Repositories;

import com.vops.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Long, User> {

    @Query(nativeQuery = true, value = "Select * from user where username = ?1 and password = ?2")
    User findByUsernameAndPassword(String username, String password);

}
