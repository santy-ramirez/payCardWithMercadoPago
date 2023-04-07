package com.santiago.cardMercadopago.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PayerIdentificationDTO {

    private String type;

    private String number;

}
