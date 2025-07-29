package org.example.api_concesionario.Infrastructure.Persistence.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;


@Entity
@Table(name = "category_car")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoryCarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_category")
    private UUID id_category;

    @Column(name = "name_category", nullable = false, length = 20)
    private String name_category;

    @Column(name = "is_delete", nullable = false)
    private Boolean is_delete = Boolean.FALSE ;

    public CategoryCarEntity(String name_category) {
        this.name_category = name_category;
    }
}