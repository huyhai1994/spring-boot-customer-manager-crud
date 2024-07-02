package com.codegym.springbootcustomermanagement.service;

import java.util.Optional;

/*TODO: Bước 5: Xây dựng service
        - Interface IGenerateService:*/
public interface IGenerateService<T> {
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    void save(T t);

    void remove(Long id);
}
