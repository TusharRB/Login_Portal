package com.example.User_Manager.repository;


import com.example.User_Manager.model.UserDtls;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDtls,Integer> {

    public boolean existsByEmail(String email);

    public UserDtls findByEmail(String email);

}
