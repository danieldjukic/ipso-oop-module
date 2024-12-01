package org.ipso.knowledgebase.jwt;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class JwtAuthEntryPoint implements AuthenticationEntryPoint {
    private static final Logger logger = LoggerFactory.getLogger(JwtAuthEntryPoint.class);
    @Override
    public void commence(HttpServletRequest httpServletRequest,
                         HttpServletResponse httpServletResponse,
                         AuthenticationException e) throws IOException {
        String ipAddress = httpServletRequest.getHeader("X-FORWARDED-FOR");
        if (ipAddress == null) {
            ipAddress = httpServletRequest.getRemoteAddr();
        }
        logger.error("Responding with unauthorized error. Message - {}", e.getMessage() + " IP: " + ipAddress + " Path: " + httpServletRequest.getRequestURI());
        httpServletResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED,"Sorry, You're not authorized to access this resource.");
    }

}
