package kg.megacom.auction.dto;

import lombok.Data;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Positive;
import java.util.Date;

@Data
public class BidDto {
    private Long id;
    private CustomerDto customerDto;
    @Positive
    private double bidVal;
    private Date addDate;
    @AssertTrue
    private boolean isActive;
    private LotDto lotDto;
}