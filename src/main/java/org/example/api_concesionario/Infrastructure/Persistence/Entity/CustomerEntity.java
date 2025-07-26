package org.example.api_concesionario.Infrastructure.Persistence.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.api_concesionario.Enum.TypeDocument;
import java.util.UUID;

@Entity
@Table(name = "customer")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_customer")
    private UUID id_customer;

    @Column(name = "firstname")
    private String first_name;

    @Column(name = "lastname")
    private String last_name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "type_document")
    @Enumerated(EnumType.STRING)
    private TypeDocument Enum_document;

    @Column(name = "document")
    private String document;

    @Column(name = "is_delete")
    private Boolean is_deleted = Boolean.FALSE;

    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.REFRESH, CascadeType.MERGE}
    )
    @JoinColumn(
            name = "id_user",
            referencedColumnName = "id_user",
            nullable = false
    )
    private UserEntity user;

    public CustomerEntity(String first_name, String last_name, String email, String phone, TypeDocument enum_document, String document, UserEntity user) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone = phone;
        this.Enum_document = enum_document;
        this.document = document;
        this.user = user;
    }
}
