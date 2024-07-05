package com.ecommerce.productservice.inheritancemapping.joinedtable.repository;

import com.ecommerce.productservice.inheritancemapping.joinedtable.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("joinedStudentRepository")
public interface StudentRepository extends JpaRepository<Student, Long> {
}
