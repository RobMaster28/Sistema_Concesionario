package org.example.api_concesionario.Infrastructure.Persistence.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.api_concesionario.Enum.Rol;

import java.util.UUID;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user")
    private UUID id;
    @Column(name = "username")
    private String username;
    @Column(name = "user_password")
    private String password;
    @Column(name = "rol")
    @Enumerated(EnumType.STRING)
    private Rol role;

}
