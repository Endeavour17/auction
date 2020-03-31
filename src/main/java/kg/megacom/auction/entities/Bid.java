package kg.megacom.auction.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "bets")
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bid_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @Column(name = "bid_val")
    private double bidVal;
    @Column(name = "add_date")
    private Date addDate;
    @Column(name = "is_active")
    private boolean isActive;
    @ManyToOne
    @JoinColumn(name = "lot_id")
    private Lot lot;
}