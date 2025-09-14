package com.stockalert.common;

import java.io.Serializable;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserStockAlertNotificationDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String userId;
    private String symbol;
    private double threshold;
    private Set<NotificationChannel> channels;
}