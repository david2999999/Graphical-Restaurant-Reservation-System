package com.restaurant.reservation.dao;

import com.restaurant.reservation.model.User;

public class LoginUserDAO implements UserDAO {
    @Override
    public User getUserWithId(int id) {
        return null;
    }

    @Override
    public User getUserWithEmail(String email) {
        return null;
    }

    @Override
    public User getUserWithLoginId(String loginId) {
        return null;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(User user) {
        return false;
    }
}
