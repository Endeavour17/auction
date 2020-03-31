package kg.megacom.auction.dto;

import lombok.Data;

import javax.validation.constraints.Min;

@Data
public class UserDto {
    private Long id;
    private String name;
    @Min(value = 5, message = "Длина логина должна быть более 5 символов")
    private String login;
    @Min(value = 8, message = "Длина пароля должна быть более 8 символов")
    private String pwd;
}