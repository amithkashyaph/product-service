package com.ecommerce.productservice.inheritancemapping.singletable.repository;

import com.ecommerce.productservice.inheritancemapping.singletable.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("singleStudentRepository")
public interface StudentRepository extends JpaRepository<Student, Long> {
}
