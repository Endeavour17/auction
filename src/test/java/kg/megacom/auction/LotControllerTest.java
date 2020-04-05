package kg.megacom.auction;

import com.fasterxml.jackson.databind.ObjectMapper;
import kg.megacom.auction.controllers.LotController;
import kg.megacom.auction.dto.LotDto;
import kg.megacom.auction.services.LotService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(LotController.class)
public class LotControllerTest {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private LotService lotService;

    private LotDto lotDto = new LotDto() {
        {
            setId(1L);
            setName("Retro car");
            setMinPrice(1000);
            setStep(100);
        }
    };

    @Before
    public void init() {
        Mockito.when(lotService.saveLot(any(LotDto.class)))
                .thenReturn(lotDto);
    }


    @Test
    public void LotControllerTesting() throws Exception {


        mockMvc.perform(post("/lot/save")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(lotDto))
        ).andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(lotDto.getId()));


    }
}
