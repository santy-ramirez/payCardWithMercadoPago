package com.santiago.cardMercadopago.controller;

import com.santiago.cardMercadopago.dto.CardPaymentDTO;
import com.santiago.cardMercadopago.dto.PaymentResponseDTO;
import com.santiago.cardMercadopago.service.CardPaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/process_payment")
@RequiredArgsConstructor
public class CardPaymentController {
    private final CardPaymentService cardPaymentService;



    @PostMapping
    public ResponseEntity<PaymentResponseDTO> processPayment(@RequestBody  CardPaymentDTO cardPaymentDTO) {
            PaymentResponseDTO payment = cardPaymentService.processPayment(cardPaymentDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(payment);
    }

}
