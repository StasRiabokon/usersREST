package com.spring.user.repository;

import com.spring.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author stas
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
