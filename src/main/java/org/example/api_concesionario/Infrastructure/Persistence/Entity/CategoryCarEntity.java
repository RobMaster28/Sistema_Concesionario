package org.example.api_concesionario.Infrastructure.Persistence.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "category_car")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoryCarEntity {
}
