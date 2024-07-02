package com.codegym.springbootcustomermanagement.repository;

import com.codegym.springbootcustomermanagement.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*TODO: Bước 4: Xây dựng repository
    - Interface ICustomerRepository:*/
@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}
