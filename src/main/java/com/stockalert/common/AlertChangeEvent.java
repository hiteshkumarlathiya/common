package com.stockalert.common;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlertChangeEvent implements Serializable {
	private static final long serialVersionUID = 1L;
	private String symbol;
    private AlertChangeType type;
    private Long alertId;
    private UserStockAlertDTO alert;
    private long eventTs;
}
