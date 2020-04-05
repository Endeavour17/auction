package kg.megacom.auction.dao;

import kg.megacom.auction.entities.Lot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LotRepo extends JpaRepository<Lot, Long> {

}
