package kg.megacom.auction.entities;

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
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;
    @Column(name = "min_price")
    private double minPrice;
    @Column(name = "max_price")
    private double maxPrice;
    private double step;
    @ManyToOne
    @JoinColumn(name = "status_id")
    private LotStatus lotStatus;
}