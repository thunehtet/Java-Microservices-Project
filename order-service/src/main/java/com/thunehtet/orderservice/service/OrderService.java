package com.thunehtet.orderservice.service;

import java.util.List;
import java.util.UUID;


import org.springframework.stereotype.Service;

import com.thunehtet.orderservice.dto.OrderLineItemsDto;
import com.thunehtet.orderservice.dto.OrderRequest;
import com.thunehtet.orderservice.model.Order;
import com.thunehtet.orderservice.model.OrderLineItems;
import com.thunehtet.orderservice.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;



    public void placeOrder(OrderRequest orderRequest){
        Order order=new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderLineItems>orderLineItems=orderRequest.getOrderLineItmesDtoList()
        .stream()
        .map(this::mapToDto)
        .toList();

        order.setOrderLineItemsList(orderLineItems);

        orderRepository.save(order);
    }

    private OrderLineItems mapToDto(OrderLineItemsDto orderLineItemsDto){
        OrderLineItems orderLineItems=new OrderLineItems();
        orderLineItems.setPrice(orderLineItemsDto.getPrice());
        orderLineItems.setQuantity(orderLineItemsDto.getQuantity());
        orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());

        return orderLineItems;
    }

    
    
}
