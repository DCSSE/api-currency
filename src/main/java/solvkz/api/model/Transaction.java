package solvkz.api.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "acct_from", nullable = false)
    private Long accountFrom;

    @Column(name = "acct_to", nullable = false)
    private Long accountTo;

    @Column(name = "currency", nullable = false)
    private String currency;

    @Column(name = "sum", nullable = false)
    private BigDecimal sum;

    @Column(name = "expense_cat", nullable = false)
    private String expenseCategory;

    @Column(name = "datetime", nullable = false)
    private LocalDateTime datetime;

    @Column(name = "limit_exceeded")
    private Boolean limitExceeded;
}
