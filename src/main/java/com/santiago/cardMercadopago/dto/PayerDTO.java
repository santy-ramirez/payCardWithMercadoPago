package com.santiago.cardMercadopago.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PayerDTO {
    private String email;


    private PayerIdentificationDTO identification;
}
