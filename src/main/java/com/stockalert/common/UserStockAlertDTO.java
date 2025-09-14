package com.stockalert.common;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserStockAlertDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long alertId;
	private String userId;
    private String symbol;
    private double threshold;
    private TriggerType triggerType;
    private boolean isActive;
    private boolean isTriggered;
}