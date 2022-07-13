package io.mkth.service;

import io.micronaut.http.HttpHeaders;
import io.mkth.model.MimicResponse;
import jakarta.inject.Singleton;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Singleton
public class MimicService {

    public MimicResponse mimic(HttpServletRequest request, HttpHeaders headers) {
        Map<String, String> customHeaders = new HashMap<>();
        headers.forEach(h -> customHeaders.put(h.getKey(), flattingList(h.getValue())));

        MimicResponse customResponse = new MimicResponse();
        customResponse.setHeaders(customHeaders);
        customResponse.setMethod(request.getMethod());
        customResponse.setOrigin(request.getRemoteAddr());
        customResponse.setUrl(request.getRequestURL().toString());

        return customResponse;
    }

    private String flattingList(List<String> headersValues) {
        return headersValues.stream().collect(Collectors.joining(","));
    }

}
