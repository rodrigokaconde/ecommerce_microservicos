package br.com.rfoliveira00.checkout.resource.checkout;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/checkout")
@RequiredArgsConstructor
public class CheckoutResource {

    @PostMapping("/")
    public ResponseEntity<CheckoutResponse> create (CheckoutRequest checkoutRequest){
        return ResponseEntity.ok().build();
    }
}
