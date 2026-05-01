package LLD.RateLimiter;

import LLD.RateLimiter.DTOs.User;

public interface RateLimiterInterface {

	boolean allowRequest(User user);
	
}
