package com.otobusbiletibackend.otobusbiletibackend.entity;

        import lombok.*;

        import javax.persistence.*;

@Entity
@Table(name = "Users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "username",length = 100)
    private String username;

    @Column(name = "surname",length = 100)
    private String surname;

    @Column(name = "email",length = 100)
    private String email;

}
