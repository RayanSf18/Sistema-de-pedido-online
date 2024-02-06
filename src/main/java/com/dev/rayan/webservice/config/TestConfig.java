package com.dev.rayan.webservice.config;

import com.dev.rayan.webservice.entities.*;
import com.dev.rayan.webservice.entities.enums.OrderStatus;
import com.dev.rayan.webservice.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "(62) 9 9258-9539", "maria123");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "(62) 9 9358-9599", "alex123");

        userRepository.saveAll(Arrays.asList(u1, u2));

        Address add1 = new Address(null, "123 Main St", "Springfield", "IL", "62701", "USA", u1);
        Address add2 = new Address(null, "456 Elm St", "Riverside", "CA", "92501", "USA", u2);

        addressRepository.saveAll(Arrays.asList(add1, add2));

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

        Product p1 = new Product(null, "Smartphone X", "High-performance smartphone with advanced features.", 799.99, "https://example.com/smartphoneX.jpg");
        Product p2 = new Product(null, "The Great Gatsby", "Classic novel depicting the Jazz Age in America.", 12.99, "https://example.com/greatGatsby.jpg");
        Product p3 = new Product(null, "Gaming Laptop Y", "Powerful gaming laptop for immersive gaming experiences.", 1499.99, "https://example.com/gamingLaptopY.jpg");
        Product p4 = new Product(null, "Wireless Earbuds Z", "High-quality wireless earbuds for seamless audio experience.", 129.99, "https://example.com/wirelessEarbudsZ.jpg");
        Product p5 = new Product(null, "Educational Book A", "Comprehensive guide for learning new skills and knowledge.", 29.99, "https://example.com/educationalBookA.jpg");

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

        p1.getCategories().add(cat1);
        p2.getCategories().add(cat2);
        p3.getCategories().add(cat3);
        p4.getCategories().add(cat1);
        p5.getCategories().add(cat2);

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

    }
}
