package com.spring.user.service;

import com.spring.user.model.User;
import java.util.List;

/**
 *
 * @author stas
 */
public interface UserService {
    
    public List<User> getAllUsers();
    
    public User getUser(Long id);
    
    public User addUser(User user);
    
    public User updateUser(Long id, User user);
    
    public void deleteUser(Long id);
    
}
