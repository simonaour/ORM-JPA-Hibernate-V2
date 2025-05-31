package entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //getters et setters
@NoArgsConstructor //constructor par defaut
@AllArgsConstructor //constructor avec param
@Builder //creer des objets


@Entity //marquer la classe comme une table dans la base de donnée


public class Product {
    @Id //clee primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
    private Long id;
    private String name;
    private double price;
    private int quantity;
}
