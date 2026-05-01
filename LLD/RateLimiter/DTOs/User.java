package LLD.RateLimiter.DTOs;

import java.util.Objects;

public class User {

	private String userID;
	private RateLimiterUserTypes userTier;

	public RateLimiterUserTypes getUserTier() {
		return userTier;
	}

	public void setUserTier(RateLimiterUserTypes userTier) {
		this.userTier = userTier;
	}
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}


	@Override
	public int hashCode() {
		return Objects.hash(userTier);
	}

	
}
