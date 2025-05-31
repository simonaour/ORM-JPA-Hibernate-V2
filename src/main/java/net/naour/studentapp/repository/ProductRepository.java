package net.naour.studentapp.repository;

import net.naour.studentapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContains(String mc);

    @Query("select p from Product p where p.name LIKE :x)
    List<Product> search(@Param("x") String mc);
}
