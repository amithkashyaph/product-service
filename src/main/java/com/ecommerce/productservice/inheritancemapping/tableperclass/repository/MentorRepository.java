package com.ecommerce.productservice.inheritancemapping.tableperclass.repository;

import com.ecommerce.productservice.inheritancemapping.tableperclass.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tpcMentorRepository")
public interface MentorRepository extends JpaRepository<Mentor, Long> {
}
