package kg.megacom.auction.entities;

import kg.megacom.auction.enums.Status;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "lots")
public class Lot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "lot_id")
    private Long id;
    private String name;
    @Column(name = "min_cost")
    private double minCost;
    @Column(name = "buyout_cost")
    private double buyoutCost;
    private double step;
    @Column(name = "end_date")
    private Date endDate;
    @Column(name = "status")
    private Status status;
}