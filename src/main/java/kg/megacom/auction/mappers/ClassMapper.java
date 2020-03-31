package kg.megacom.auction.mappers;

import kg.megacom.auction.dto.*;
import kg.megacom.auction.entities.*;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ClassMapper {

    ClassMapper INSTANCE = Mappers.getMapper(ClassMapper.class);

    Bid bidDtoToBid(BidDto bidDto);

    BidDto bidToBidDto(Bid bid);

    List<BidDto> bidsToBidDtos(List<Bid> bids);

    Customer customerDtoToCustomer(CustomerDto customerDto);

    CustomerDto customerToCustomerDto(Customer customer);

    List<CustomerDto> customersToCustomerDtos(List<Customer> customers);

    Lot lotDtoToLot(LotDto lotDto);

    LotDto lotToLotDto(Lot lot);

    List<LotDto> lotsToLotDtos(List<Lot> lots);

    LotStatus lotStatusDtoToLotStatus(LotStatusDto lotStatusDto);

    LotStatusDto lotStatusToLotStatusDto(LotStatus lotStatus);

    List<LotStatusDto> lotStatusesToLotStatusDtos(List<LotStatus> lotStatuses);

    User userDtoToUser(UserDto userDto);

    UserDto userToUserDto(User user);

    List<UserDto> usersToUserDtos(List<User> users);

}
