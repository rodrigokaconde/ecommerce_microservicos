package br.com.rfoliveira00.checkout.repository;

import br.com.rfoliveira00.checkout.entity.CheckoutEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutRepository extends JpaRepository<CheckoutEntity, Long> {

}
