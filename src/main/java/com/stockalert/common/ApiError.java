package com.stockalert.common;

import lombok.*;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiError {
  private Instant timestamp;
  private int status;
  private String error;
  private String message;
  private String path;
}