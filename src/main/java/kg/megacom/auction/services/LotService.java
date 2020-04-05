package kg.megacom.auction.services;

import kg.megacom.auction.dto.LotDto;
import kg.megacom.auction.entities.Lot;

public interface LotService {
    LotDto saveLot(LotDto lotDto);

    Lot findById(Long id);
}
