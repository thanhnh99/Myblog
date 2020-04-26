package com.shippingsystem.services;

import com.shippingsystem.models.Order;
import com.shippingsystem.repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    IOrderRepository orderRepository ;

    public List<Order> getAllOrder()
    {
        return orderRepository.findAll();
    }

    public void addOrder(Order order)
    {
        orderRepository.save(order);
    }

    public Optional<Order> getInfor(Long id)
    {
        return orderRepository.findById(id);
    }
}