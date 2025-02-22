package com.sorune.gttapiserver.cart.repository;

import com.sorune.gttapiserver.cart.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository <Cart,Long>{

    List<Cart> findAllByUserNo(Long userNo);

}
