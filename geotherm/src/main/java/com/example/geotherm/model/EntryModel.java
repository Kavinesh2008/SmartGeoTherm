package com.example.geotherm.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table (name="entry")
public class EntryModel {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne 
    @JoinColumn(name="journal_id")
    private JournalModel journal;
    @ManyToOne 
    @JoinColumn(name="account_id")
    private AccountModel account;
    private LocalDateTime entry_date;
    private String description;
    private BigDecimal debit;
    private BigDecimal credit;
    private String reference_no;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public JournalModel getJournal() {
        return journal;
    }
    public void setJournal(JournalModel journal) {
        this.journal = journal;
    }
    public AccountModel getAccount() {
        return account;
    }
    public void setAccount(AccountModel account) {
        this.account = account;
    }
    public LocalDateTime getEntry_date() {
        return entry_date;
    }
    public void setEntry_date(LocalDateTime entry_date) {
        this.entry_date = entry_date;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public BigDecimal getDebit() {
        return debit;
    }
    public void setDebit(BigDecimal debit) {
        this.debit = debit;
    }
    public BigDecimal getCredit() {
        return credit;
    }
    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }
    public String getReference_no() {
        return reference_no;
    }
    public void setReference_no(String reference_no) {
        this.reference_no = reference_no;
    }
    
}
