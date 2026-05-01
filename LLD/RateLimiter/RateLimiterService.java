package LLD.RateLimiter;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import LLD.RateLimiter.DTOs.RateLimitAlgorithmTypes;
import LLD.RateLimiter.DTOs.RateLimiterUserTypes;
import LLD.RateLimiter.DTOs.User;


public class RateLimiterService {

	
	private static Map<RateLimiterUserTypes, RateLimiterInterface> userToServiceMap = new HashMap<>();
	
	public static void main(String...args) {
		
		new RateLimitFactory();
		//build the map for user to tier service
		userToServiceMap.put(RateLimiterUserTypes.FREE_TIER,RateLimitFactory.createRateLimiter(RateLimitAlgorithmTypes.FIXED_WINDOW, new RateLimitConfig(10,TimeUnit.HOURS.toMillis(24))));
		new RateLimitFactory();
		userToServiceMap.put(RateLimiterUserTypes.PREMIUM,RateLimitFactory.createRateLimiter(RateLimitAlgorithmTypes.TOKEN_BUCKET, null));
		
		User user1 = new User();
		user1.setUserID("Shiny001");
		user1.setUserTier(RateLimiterUserTypes.FREE_TIER);
		
		User user2 = new User();
		user2.setUserID("Shiny002");
		user2.setUserTier(RateLimiterUserTypes.PREMIUM);
		
		//check user details and get the respective rateLimiter
		RateLimiterInterface limiter = userToServiceMap.get(user2.getUserTier());
				
		//calling free tier user for 15 times in a window when the max size per 24 hours is 10, so last 5 should be blocked
		for(int i = 1 ; i <= 10; i++) {
			//serverCalled(user1,i, limiter);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			serverCalled(user2,i,limiter);
		}
		
		
	}
	
	
	private static void serverCalled(User userdetails, int i, RateLimiterInterface limiter) {
		
		//rate limiter check
		boolean allowRequest = limiter.allowRequest(userdetails);
		
		if(allowRequest) {
		System.out.println("Server called successfully for attempt: " + i);
		} else {
			System.out.println("Request blocked for attempt : " + i);
		}
		
	}
	

}
