package com.ecommerce.productservice.inheritancemapping.joinedtable.repository;

import com.ecommerce.productservice.inheritancemapping.joinedtable.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("joinedMentorRepository")
public interface MentorRepository extends JpaRepository<Mentor, Long> {
}
