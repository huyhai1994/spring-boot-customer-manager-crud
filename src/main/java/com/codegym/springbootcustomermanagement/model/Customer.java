package com.codegym.springbootcustomermanagement.model;

import jakarta.persistence.*;
import lombok.Data;

/*TODO: Bước 3: Xây dựng model
        - Lớp Customer:*/
@Entity
@Table(name = "customer")
@Data
/*todo: - Annotation @Data của Lombok đã hỗ trợ
   phần tạo constructor và các phương thức getter / setter*/
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
}
