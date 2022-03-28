package com.womenempowerment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.womenempowerment.model.User;
@Repository
public interface IUserDao extends JpaRepository<User, Integer> {

}
