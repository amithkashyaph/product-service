package com.ecommerce.productservice.inheritancemapping.tableperclass.repository;

import com.ecommerce.productservice.inheritancemapping.tableperclass.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tpcUserRepository")
public interface UserRepository extends JpaRepository<User, Long> {
}
