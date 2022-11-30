package com.tns.OrderModule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tns.OrderModule.Order;
@Repository
public interface OrderRepository extends JpaRepository < Order, Integer>
{

}