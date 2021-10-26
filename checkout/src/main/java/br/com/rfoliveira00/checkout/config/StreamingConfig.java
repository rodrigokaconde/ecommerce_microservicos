package br.com.rfoliveira00.checkout.config;

import br.com.rfoliveira00.checkout.streaming.CheckoutCreatedSource;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding( value = {
        CheckoutCreatedSource.class
})
public class StreamingConfig {
}
