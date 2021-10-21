package br.com.rfoliveira00.checkout.service;

import br.com.rfoliveira00.checkout.entity.CheckoutEntity;
import br.com.rfoliveira00.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create (CheckoutRequest checkoutRequest);

}
