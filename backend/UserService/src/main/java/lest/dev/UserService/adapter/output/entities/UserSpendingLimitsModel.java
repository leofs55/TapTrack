package lest.dev.UserService.adapter.output.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;


@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_user_spending_limits")
public class UserSpendingLimitsModel {

    private UUID userId;
    private BigDecimal daily;
    private BigDecimal monthly;

    }
