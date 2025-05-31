package net.naour.studentapp;

import net.naour.studentapp.entities.Product;
import net.naour.studentapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class StudentAppApplication implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;
    public static void main(String[] args) {
        SpringApplication.run(StudentAppApplication.class, args);//lapp spring demmare et vas scanner les classe et tout
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product(null , "Computer" , 4300 , 4));
        productRepository.save(new Product(null , "Printer" , 4300 , 4));
        productRepository.save(new Product(null , "Smart Phone" , 4300 , 4));
        List<Product> products = productRepository.findAll();
        products.forEach(p->{
            System.out.println(p.toString());
        }) ;

        Product product = productRepository.findById(Long.valueOf(1l)).get();
        System.out.println("************");
        System.out.println((product.getId()));
        System.out.println((product.getName()));
        System.out.println((product.getQuantity()));
        System.out.println((product.getPrice()));
    }
}
