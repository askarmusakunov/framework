package apiBeans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MetaBean {

    private boolean success;

    private String message;

    private RateLimitBean rateLimit;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RateLimitBean getRateLimit() {
        return rateLimit;
    }

    public void setRateLimit(RateLimitBean rateLimit) {
        this.rateLimit = rateLimit;
    }
}
