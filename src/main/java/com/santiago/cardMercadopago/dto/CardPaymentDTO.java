package com.santiago.cardMercadopago.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardPaymentDTO {

    private String token;

    private String issuerId;


    private String paymentMethodId;


    private BigDecimal transactionAmount;


    private Integer installments;



    private String productDescription;


    private PayerDTO payer;
}
