package com.example.Trading.modal;

import com.example.Trading.domain.VerificationType;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class TwoFectorAuth {

    private boolean isEnable = false;
    private VerificationType sendTo;

}
