package com.ford.demogl.demoglpostsoap.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * Class to hold Journal Entry data
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JournalEntryBO {
    private String bUnitId;
    private String journalId;
    private Date journalDate;
    private List<GeneralLedgerAccountBO> item;
}