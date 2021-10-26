package br.com.rfoliveira00.checkout.service;

import br.com.rfoliveira.checkout.event.CheckoutCreatedEvent;
import br.com.rfoliveira00.checkout.entity.CheckoutEntity;
import br.com.rfoliveira00.checkout.repository.CheckoutRepository;
import br.com.rfoliveira00.checkout.resource.checkout.CheckoutRequest;
import br.com.rfoliveira00.checkout.streaming.CheckoutCreatedSource;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class CheckoutServiceImplements implements CheckoutService{

    private final CheckoutRepository checkoutRepository;
    private final CheckoutCreatedSource checkoutCreatedSource;

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
        final CheckoutEntity checkoutEntity = CheckoutEntity.builder()
                .code(UUID.randomUUID().toString())
                .status(CheckoutEntity.Status.CREATED)
                .build();
        final CheckoutEntity entity = checkoutRepository.save(checkoutEntity);

        final CheckoutCreatedEvent checkoutCreatedEvent = CheckoutCreatedEvent
                .newBuilder()
                .setCheckoutCode(entity.getCode())
                .setStatus(entity.getStatus())
                .build();
        checkoutCreatedSource.output().send(MessageBuilder.withPayload(checkoutCreatedEvent).build());

        return Optional.of(entity);
    }
}
