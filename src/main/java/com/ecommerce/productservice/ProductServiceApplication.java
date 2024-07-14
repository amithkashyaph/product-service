package com.ecommerce.productservice;

//import com.ecommerce.productservice.inheritancemapping.tableperclass.Mentor;
//import com.ecommerce.productservice.inheritancemapping.tableperclass.Student;
//import com.ecommerce.productservice.inheritancemapping.joinedtable.Mentor;
//import com.ecommerce.productservice.inheritancemapping.tableperclass.User;
//import com.ecommerce.productservice.inheritancemapping.tableperclass.repository.MentorRepository;
//import com.ecommerce.productservice.inheritancemapping.tableperclass.repository.StudentRepository;
//import com.ecommerce.productservice.inheritancemapping.tableperclass.repository.UserRepository;
//import com.ecommerce.productservice.inheritancemapping.joinedtable.Student;
//import com.ecommerce.productservice.inheritancemapping.joinedtable.User;
//import com.ecommerce.productservice.inheritancemapping.joinedtable.repository.MentorRepository;
//import com.ecommerce.productservice.inheritancemapping.joinedtable.repository.StudentRepository;
//import com.ecommerce.productservice.inheritancemapping.joinedtable.repository.UserRepository;
import com.ecommerce.productservice.inheritancemapping.singletable.Mentor;
import com.ecommerce.productservice.inheritancemapping.singletable.Student;
import com.ecommerce.productservice.inheritancemapping.singletable.User;
import com.ecommerce.productservice.inheritancemapping.singletable.repository.MentorRepository;
import com.ecommerce.productservice.inheritancemapping.singletable.repository.StudentRepository;
import com.ecommerce.productservice.inheritancemapping.singletable.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
@AllArgsConstructor
public class ProductServiceApplication implements CommandLineRunner {

	@Qualifier("joinedMentorRepository")
	private MentorRepository mentorRepository;

	@Qualifier("joinedStudentRepository")
	private StudentRepository studentRepository;

	@Qualifier("joinedUserRepository")
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Mentor mentor = new Mentor();
//		mentor.setName("Amith");
//		mentor.setEmail("amith@gmail.com");
//		mentor.setRating(5.0f);
//		mentor.setNoOfSessions(100);
//
//		mentorRepository.save(mentor);
//
//		Student student = new Student();
//		student.setName("Deepthi");
//		student.setEmail("deepthi@gmail.com");
//		student.setPsp(100);
//		student.setBatchName("Amiths batch");
//
//		studentRepository.save(student);

//		User user = new User();
//		user.setEmail("user@gmail.com");
//		user.setName("user");
//
//
//		userRepository.save(user);

//		List<User> users = userRepository.findAll();
//
//		System.out.println(users);



	}
}
