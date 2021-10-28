package br.com.rfoliveira00.checkout.streaming;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CheckoutCreatedSource {
    String OUTPUT = "checkout-ceated-output";

    @Output(OUTPUT)
    MessageChannel output();
}
