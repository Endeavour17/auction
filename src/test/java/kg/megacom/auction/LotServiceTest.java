package kg.megacom.auction;

import kg.megacom.auction.dao.LotRepo;
import kg.megacom.auction.entities.Lot;
import kg.megacom.auction.services.LotService;
import kg.megacom.auction.services.impl.LotServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class LotServiceTest {

    @Autowired
    private LotService lotService;
    @MockBean
    private LotRepo lotRepo;

    @Test
    public void testLotService() {

        Lot lot = new Lot();
        lot.setId(1L);
        lot.setName("Retro car");
        lot.setMinPrice(2000);
        lot.setStep(100);

        Mockito.when(lotRepo.findById(lot.getId()))
                .thenReturn(Optional.of(lot));

        Lot foundLot = lotService.findById(lot.getId());

        assertEquals(lot.getName(), foundLot.getName());
    }

    @TestConfiguration
    static class LotServiceTestConfig {

        @Bean
        public LotService lotService() {
            return new LotServiceImpl();
        }
    }
}
