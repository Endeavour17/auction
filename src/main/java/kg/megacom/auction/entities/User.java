package kg.megacom.auction.entities;

import kg.megacom.auction.enums.Status;
import kg.megacom.auction.enums.UserRole;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;
    private String phone;
    private UserRole userRole;
    private Status status;
}