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
import com.ecommerce.productservice.entity.Category;
import com.ecommerce.productservice.entity.Price;
import com.ecommerce.productservice.entity.Product;
import com.ecommerce.productservice.inheritancemapping.singletable.Mentor;
import com.ecommerce.productservice.inheritancemapping.singletable.Student;
import com.ecommerce.productservice.inheritancemapping.singletable.User;
import com.ecommerce.productservice.inheritancemapping.singletable.repository.MentorRepository;
import com.ecommerce.productservice.inheritancemapping.singletable.repository.StudentRepository;
import com.ecommerce.productservice.inheritancemapping.singletable.repository.UserRepository;
import com.ecommerce.productservice.repositories.CategoryRepository;
import com.ecommerce.productservice.repositories.PriceRepository;
import com.ecommerce.productservice.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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

	private PriceRepository priceRepository;

	private CategoryRepository categoryRepository;

	private ProductRepository productRepository;

	@Autowired
	public ProductServiceApplication(ProductRepository productRepository, PriceRepository priceRepository, CategoryRepository categoryRepository) {
		this.productRepository = productRepository;
		this.categoryRepository = categoryRepository;
		this.priceRepository = priceRepository;
	}

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

//		Category category = new Category();
//		category.setName("mobile");
//		Category mobileCategory = categoryRepository.save(category);
//
//		Category category2 = new Category();
//		category2.setName("laptop");
//		Category laptopCategory = categoryRepository.save(category2);
//
//		Category category3 = new Category();
//		category3.setName("desktop");
//		Category desktopCategory = categoryRepository.save(category3);
//
//		Price price = new Price();
//		price.setCurrency("INR");
//		price.setValue(1000d);
//		Price savedPrice = priceRepository.save(price);
//
//		Price price2 = new Price();
//		price2.setCurrency("INR");
//		price2.setValue(2000d);
//		Price savedPrice2 = priceRepository.save(price2);
//
//		Price price3 = new Price();
//		price3.setCurrency("INR");
//		price3.setValue(2000d);
//		Price savedPrice3 = priceRepository.save(price3);
//
//		Product product = new Product();
//		product.setTitle("Iphone 13");
//		product.setDescription("Good iPhone 13 phone");
//		product.setCategory(mobileCategory);
//		product.setPrice(savedPrice);
//		product.setRating(4.4f);
//		productRepository.save(product);
//
//		Product product2 = new Product();
//		product2.setTitle("Iphone 14");
//		product2.setDescription("Good iPhone 14 phone");
//		product2.setCategory(mobileCategory);
//		product2.setPrice(savedPrice2);
//		product2.setRating(4.7f);
//		productRepository.save(product2);
//
//
//		Product product3 = new Product();
//		product3.setTitle("Iphone 15");
//		product3.setDescription("Good iPhone 15 phone");
//		product3.setCategory(mobileCategory);
//		product3.setPrice(savedPrice3);
//		product3.setRating(4.9f);
//		productRepository.save(product3);

	}
}
