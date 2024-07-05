package com.ecommerce.productservice.inheritancemapping.joinedtable.repository;

import com.ecommerce.productservice.inheritancemapping.joinedtable.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("joinedUserRepository")
public interface UserRepository extends JpaRepository<User, Long> {
}
