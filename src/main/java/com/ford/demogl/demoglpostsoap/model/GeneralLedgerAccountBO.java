package com.ford.demogl.demoglpostsoap.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GeneralLedgerAccountBO {
    private String glAccount;
    private double amount;
    private String currency;
    private String debitCreditMode;
}
