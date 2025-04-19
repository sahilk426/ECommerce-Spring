package project.Ecommerce_Spring.model;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "categories")
@Data
public class Category {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String name;

    @NotNull
    @Column(unique = true)
    private String categoryId;
    
    @ManyToOne
    private Category parentCategory;

    @org.jetbrains.annotations.NotNull
    private Integer level;
    


}
