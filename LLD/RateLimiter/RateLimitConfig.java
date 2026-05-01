package LLD.RateLimiter;

public class RateLimitConfig {

	private int maxRequests;
	private long window;
	
	public int getMaxRequests() {
		return maxRequests;
	}
	public void setMaxRequests(int maxRequests) {
		this.maxRequests = maxRequests;
	}
	public long getWindow() {
		return window;
	}
	public void setWindow(long window) {
		this.window = window;
	}
	
	public RateLimitConfig(int maxRequests, long l) {
		super();
		this.maxRequests = maxRequests;
		this.window = l;
	}
	
	
	
}
