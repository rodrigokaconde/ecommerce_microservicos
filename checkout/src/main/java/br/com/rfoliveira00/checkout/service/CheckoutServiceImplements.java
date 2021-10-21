package br.com.rfoliveira00.checkout.service;

import br.com.rfoliveira00.checkout.entity.CheckoutEntity;
import br.com.rfoliveira00.checkout.repository.CheckoutRepository;
import br.com.rfoliveira00.checkout.resource.checkout.CheckoutRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CheckoutServiceImplements implements CheckoutService{
    private final CheckoutRepository checkoutRepository;

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
        return Optional.empty();
    }
}
