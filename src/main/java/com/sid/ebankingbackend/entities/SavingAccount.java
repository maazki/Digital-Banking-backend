package com.sid.ebankingbackend.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@DiscriminatorValue("SA")
@Data
@NoArgsConstructor @AllArgsConstructor
public class SavingAccount extends BankAccount{

    private double interestRate;
}
