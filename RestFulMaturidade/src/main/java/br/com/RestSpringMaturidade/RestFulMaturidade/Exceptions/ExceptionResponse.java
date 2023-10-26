package br.com.RestSpringMaturidade.RestFulMaturidade.Exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {

    private Date TimeSDate;
    private String message;
    private String details;

    public ExceptionResponse(Date timeSDate, String message, String details) {
        TimeSDate = timeSDate;
        this.message = message;
        this.details = details;
    }

    public Date getTimeSDate() {
        return TimeSDate;
    }

    public void setTimeSDate(Date timeSDate) {
        TimeSDate = timeSDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
