package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Breed {
    @JsonProperty("level")
    private String level;
    @JsonProperty("message")
    private String message;
    @JsonProperty("status")
    private int status;


    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
