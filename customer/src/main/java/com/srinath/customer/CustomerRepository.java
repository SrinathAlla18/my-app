package com.srinath.customer;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
