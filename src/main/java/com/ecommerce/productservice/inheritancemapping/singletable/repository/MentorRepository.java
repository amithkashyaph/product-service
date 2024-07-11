package com.ecommerce.productservice.inheritancemapping.singletable.repository;

import com.ecommerce.productservice.inheritancemapping.singletable.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("singleMentorRepository")
public interface MentorRepository extends JpaRepository<Mentor, Long> {
}
