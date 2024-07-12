package com.ecommerce.productservice.inheritancemapping.tableperclass.repository;

import com.ecommerce.productservice.inheritancemapping.tableperclass.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tpcStudentRepository")
public interface StudentRepository extends JpaRepository<Student, Long> {
}
