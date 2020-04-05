package kg.megacom.auction;

import kg.megacom.auction.dao.LotRepo;
import kg.megacom.auction.entities.Lot;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class LotRepoTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private LotRepo lotRepo;

    @Test
    public void testLotRepo() {

        Lot lot = new Lot();
        lot.setName("Retro car");
        lot.setMinPrice(2000);
        lot.setStep(100);

        testEntityManager.persist(lot);
        testEntityManager.flush();

        Lot foundLot = lotRepo.findById(1L).orElse(null);

        assertEquals(lot.getName(), foundLot.getName());

    }
}
