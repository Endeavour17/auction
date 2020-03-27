package kg.megacom.auction.entities;

import kg.megacom.auction.enums.BetStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "bets")
public class Bet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bet_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "lot_id")
    private Lot lot;
    private double sum;
    @Column(name = "bet_date")
    private Date betDate;
    private BetStatus betStatus;
}