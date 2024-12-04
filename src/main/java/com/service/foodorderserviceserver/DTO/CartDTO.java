package com.service.foodorderserviceserver.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CartDTO {
    private Integer id;
    private Double totalPrice;
    private UserDTO user;
    private Integer numberOfCartLineItems;
}
