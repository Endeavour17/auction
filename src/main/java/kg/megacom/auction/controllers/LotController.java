package kg.megacom.auction.controllers;

import kg.megacom.auction.dto.LotDto;
import kg.megacom.auction.services.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lot")
public class LotController {

    @Autowired
    private LotService lotService;

    @PostMapping("save")
    public ResponseEntity<?> saveLot(@RequestBody LotDto lotDto) {
        return ResponseEntity.ok(lotService.saveLot(lotDto));
    }
}
