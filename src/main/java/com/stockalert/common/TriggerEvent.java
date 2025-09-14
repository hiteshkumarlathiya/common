package com.stockalert.common;

import lombok.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TriggerEvent {
  private UUID triggerId;
  private UUID alertId;
  private UUID userId;
  private String symbol;
  private BigDecimal price;
  private Instant ts;
}