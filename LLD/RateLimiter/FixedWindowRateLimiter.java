package LLD.RateLimiter;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import LLD.RateLimiter.DTOs.User;

public class FixedWindowRateLimiter implements RateLimiterInterface {

	private final int maxRequestsAllowed;
	private final long windowSize; 
	private final Map<String,UserMetadata> metadata = new HashMap<>();//in hrs
	
	public FixedWindowRateLimiter(RateLimitConfig config) {
		this.maxRequestsAllowed = config.getMaxRequests();
		this.windowSize = config.getWindow();
	}
	
	@Override
	public boolean allowRequest(User user) {
	
		String userID = user.getUserID();
		UserMetadata meta = metadata.get(userID);
		long currentTimeStamp = System.currentTimeMillis();
		
		if(null == meta) {
			metadata.put(userID, new UserMetadata(currentTimeStamp, 1));
			return true;
		} 
	
		long lastTimeStamp = meta.getLastTimeStamp();
		long diff = currentTimeStamp - lastTimeStamp;
		int currentCounter = meta.getRequestCounter();
		if(diff < windowSize) {
			if(currentCounter >= maxRequestsAllowed) {
				return false;
			}
			meta.setRequestCounter(++currentCounter);
			return true;
		} else {
			meta.setLastTimeStamp(currentTimeStamp);
			meta.setRequestCounter(1);
			return true;
		}
	}

}

class UserMetadata {
	
	private long lastTimeStamp;
	private int requestCounter;
	
	public long getLastTimeStamp() {
		return lastTimeStamp;
	}
	public void setLastTimeStamp(long lastTimeStamp) {
		this.lastTimeStamp = lastTimeStamp;
	}
	public int getRequestCounter() {
		return requestCounter;
	}
	public void setRequestCounter(int requestCounter) {
		this.requestCounter = requestCounter;
	}
	
	public UserMetadata(long lastTimeStamp, int requestCounter) {
		super();
		this.lastTimeStamp = lastTimeStamp;
		this.requestCounter = requestCounter;
	}
	
	
}