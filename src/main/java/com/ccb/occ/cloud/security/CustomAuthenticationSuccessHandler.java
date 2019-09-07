package com.ccb.occ.cloud.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登陆成功后处理
 *
 * @author Mr.hua
 * @version v1.0.0
 * @description
 * @date Created in 2019/9/2 9:19
 */

@Component
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
//        String username = ((User) authentication.getPrincipal()).getUsername();
//        logger.info("登录成功,{}", username);

//        Object ss = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        /*String id = request.getSession().getId();

        HashMap<String, Object> map = new HashMap<>();
        map.put("name","huaxiang");
        map.put("token",id);
        map.put("uuid","1");
        JSONObject json = new JSONObject(map);*/
        response.sendRedirect("/");
        // 允许跨域
        /*response.setHeader("Access-Control-Allow-Origin", "*");
        // 允许自定义请求头token(允许head跨域)
        response.setHeader("Access-Control-Allow-Headers", "token, Accept, Origin, X-Requested-With, Content-Type, Last-Modified");
        response.getWriter().write(json.toString());*/
    }
}
