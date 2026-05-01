package LLD.RateLimiter;

import LLD.RateLimiter.DTOs.RateLimitAlgorithmTypes;

public class RateLimitFactory {

	public static RateLimiterInterface createRateLimiter(RateLimitAlgorithmTypes types,RateLimitConfig config) {
		if(types.equals(RateLimitAlgorithmTypes.FIXED_WINDOW)) {
			return new FixedWindowRateLimiter(config);
		} else {
			return new TokenWindowRateLimiter(config);
		}
		
	}
}
