package com.givemefive.customerservicesystem.repostory;


import com.givemefive.customerservicesystem.model.User;
import java.util.*;

public interface UserDao {
    List<User> getAll();

    void save(User user);

    void update(User user);

    void delete(String id);

    User queryBymail(String usermail);
}
