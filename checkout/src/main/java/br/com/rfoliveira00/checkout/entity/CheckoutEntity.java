package br.com.rfoliveira00.checkout.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CheckoutEntity {
    @Id
    private Long id;

    @Column
    private String code;
}
