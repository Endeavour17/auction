package kg.megacom.auction.services.impl;

import kg.megacom.auction.dao.LotRepo;
import kg.megacom.auction.dto.LotDto;
import kg.megacom.auction.entities.Lot;
import kg.megacom.auction.mappers.ClassMapper;
import kg.megacom.auction.services.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LotServiceImpl implements LotService {

    @Autowired
    private LotRepo lotRepo;


    @Override
    public LotDto saveLot(LotDto lotDto) {
        Lot lot = ClassMapper.INSTANCE.lotDtoToLot(lotDto);
        return ClassMapper.INSTANCE.lotToLotDto(lotRepo.save(lot));
    }

    @Override
    public Lot findById(Long id) {
        return lotRepo.findById(id).orElse(null);
    }
}
