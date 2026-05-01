package LLD.RateLimiter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import LLD.RateLimiter.DTOs.User;

public class TokenWindowRateLimiter implements RateLimiterInterface{

	private final int capacityPerBucket = 5;
	private final int tokensPerWindow = 5; // 1 token per 5 seconds
	private Map<String, Token> tokenMap = new ConcurrentHashMap<>();
	
	
	public TokenWindowRateLimiter(RateLimitConfig config) {
	
	}
	
	@Override
	public boolean allowRequest(User user) {
		
		String userID = user.getUserID();
		Token lastData = tokenMap.get(userID);
		long currentTimeStamp = System.currentTimeMillis();
		if(lastData == null) {
			tokenMap.put(userID, new Token(capacityPerBucket-1, currentTimeStamp));
			return true;
		}

		
		// refill
        long elapsed = (currentTimeStamp - lastData.getLastTimeStamp())/1000; //divided by 1000 to get in seconds
        int tokensToAdd = (int) (elapsed / tokensPerWindow);
	    
        if (tokensToAdd > 0) {
        	lastData.setTokensAvailable(Math.min(capacityPerBucket,lastData.getTokensAvailable() + tokensToAdd));
        	lastData.setLastTimeStamp(currentTimeStamp);
        }
        
        System.out.println("Elapsed: " + elapsed + 
                " TokensToAdd: " + tokensToAdd +
                " CurrentTokens: " + lastData.getTokensAvailable());
        
        //consume
        if(lastData.getTokensAvailable() > 0) {
            lastData.setTokensAvailable(lastData.getTokensAvailable()-1); 
        	return true;
        }
        return false;
	
	}

}

class Token {
	
	private int tokensAvailable;
	private long lastTimeStamp;
	
	public int getTokensAvailable() {
		return tokensAvailable;
	}
	public void setTokensAvailable(int tokensAvailable) {
		this.tokensAvailable = tokensAvailable;
	}
	public long getLastTimeStamp() {
		return lastTimeStamp;
	}
	
	public void setLastTimeStamp(long lastTimeStamp) {
		this.lastTimeStamp = lastTimeStamp;
	}
	
	
	public Token(int tokensAvailable, long lastTimeStamp) {
		super();
		this.tokensAvailable = tokensAvailable;
		this.lastTimeStamp = lastTimeStamp;
	}

}