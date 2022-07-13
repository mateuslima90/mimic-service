package io.mkth.model;

import java.util.Map;

public class MimicResponse {

    private Map<String, String> args;
    private String data;
    private Map<String, String> headers;
    private String method;
    private String origin;
    private String url;

    public MimicResponse() {

    }

    public MimicResponse(Map<String, String> args, String data, Map<String, String> headers, String method, String origin, String url) {
        this.args = args;
        this.data = data;
        this.headers = headers;
        this.method = method;
        this.origin = origin;
        this.url = url;
    }

    public Map<String, String> getArgs() {
        return args;
    }

    public void setArgs(Map<String, String> args) {
        this.args = args;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
