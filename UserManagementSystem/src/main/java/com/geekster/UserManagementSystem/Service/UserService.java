package com.geekster.UserManagementSystem.Service;

import com.geekster.UserManagementSystem.Model.User;
import com.geekster.UserManagementSystem.Repo.IUserRepo;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    IUserRepo iUserRepo;

    public String addUser(User user) {
        iUserRepo.save(user);
        return "added";
    }

    public User getUser(Long Id) {
        return iUserRepo.findById(Id).get();
    }

    public List<User> getUsers() {
        return (List<User>)iUserRepo.findAll();
    }


   public User updateUserInfo(Long id, @NotNull User myUser) {
        User user =iUserRepo.findById(id).get();

        user.setEmail(myUser.getEmail());
      return  iUserRepo.save(myUser);
    }

    public String deleteUsers() {
        iUserRepo.deleteAll();
        return "deleted all users";
    }
}
