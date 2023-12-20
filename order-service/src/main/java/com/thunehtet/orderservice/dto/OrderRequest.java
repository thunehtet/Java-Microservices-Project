package com.thunehtet.orderservice.dto;

import java.util.List;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class OrderRequest {
    private List<OrderLineItemsDto> orderLineItmesDtoList; 
    
}
