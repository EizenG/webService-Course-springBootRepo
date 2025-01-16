package sn.edu.ept.git.dic2.demoServiceWeb.filters;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Enumeration;

@Component
public class Journalisation extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain
    ) throws ServletException, IOException {
        System.out.println("####Journalisation Filter");
        String ip = request.getRemoteAddr();
        String host = request.getRemoteHost();
        String url =  request.getContextPath();
        System.out.println("###########REquetes##########");
        System.out.println("url: " + url);
        System.out.println("ip: " + ip);
        System.out.println("host: " + host);
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);
            System.out.println("header: " + headerName + " = " + headerValue);

        }
        filterChain.doFilter(request, response);
    }
}
