package com.hendisantika.springbootrestswaggerexample.endpoint.error;

/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/4/17
 * Time: 1:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class Error {
    private String field;

    private String value;

    private String message;

    public Error(String field, String value, String message) {
        this.field = field;
        this.value = value;
        this.message = message;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
