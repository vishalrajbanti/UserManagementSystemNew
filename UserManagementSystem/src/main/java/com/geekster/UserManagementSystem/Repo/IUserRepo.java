package com.geekster.UserManagementSystem.Repo;

import com.geekster.UserManagementSystem.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends CrudRepository<User,Long> {

}
