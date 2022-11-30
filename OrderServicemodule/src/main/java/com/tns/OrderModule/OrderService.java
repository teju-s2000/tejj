package com.tns.OrderModule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tns.OrderModule.Order;
import com.tns.OrderModule.OrderRepository;
@Service
@Transactional
public class OrderService {

@Autowired
private OrderRepository repo;

public List<Order> listAll()
{

return repo.findAll();
}

public Order get(Integer id) {
// TODO Auto-generated method stub
return repo.findById(id).get();
}

public void save(Order order) {
// TODO Auto-generated method stub
repo.save(order);
}

public void delete(Integer id) {
// TODO Auto-generated method stub
repo.deleteById(id);
}

}