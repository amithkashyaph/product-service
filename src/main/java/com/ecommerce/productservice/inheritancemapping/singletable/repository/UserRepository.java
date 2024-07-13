package com.ecommerce.productservice.inheritancemapping.singletable.repository;

import com.ecommerce.productservice.inheritancemapping.singletable.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("singleUserRepository")
public interface UserRepository extends JpaRepository<User, Long> {
}
