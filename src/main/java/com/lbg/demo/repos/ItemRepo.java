package com.lbg.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lbg.demo.domain.Item;

public interface ItemRepo extends JpaRepository<Item, Integer> {

}
