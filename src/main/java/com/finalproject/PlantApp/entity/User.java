package com.finalproject.PlantApp.entity;


public class User {
	private String userId;
	private String clientId;
	
	public User() {
		
	}

	public User(String userId) {
		this.userId = userId;
	}
	public User(String userId, String clientId) {
		this.userId = userId;
		this.clientId = clientId;
	}
	

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", clientId=" + clientId + "]";
	}

	

}
