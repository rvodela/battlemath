package com.ford.demogl.demoglpostsoap.model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GeneralLedgerAccountRequest {
    private String glAccount;
    private double amount;
    private String currency;
    private String debitCreditMode;
}

