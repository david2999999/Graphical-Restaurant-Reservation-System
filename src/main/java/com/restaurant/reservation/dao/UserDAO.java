package com.restaurant.reservation.dao;

import com.restaurant.reservation.model.User;

public interface UserDAO {
    public User getUserWithId(int id);
    public User getUserWithEmail(String email);
    public User getUserWithLoginId(String loginId);
    public boolean updateUser(User user);
    public boolean deleteUser(User user);
}
