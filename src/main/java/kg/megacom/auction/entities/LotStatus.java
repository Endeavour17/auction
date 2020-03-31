package kg.megacom.auction.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "lot_statuses")
public class LotStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "status_id")
    private Long id;
    private String name;
}
