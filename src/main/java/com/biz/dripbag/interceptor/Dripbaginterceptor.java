package com.biz.dripbag.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.biz.dripbag.service.SessionService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class Dripbaginterceptor extends HandlerInterceptorAdapter 
{	
	private final SessionService sService;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception 
	{
		if(request.getSession().getAttribute("login_registration") == null)
		{
			log.debug("인터셉터 했음");
			response.sendRedirect("/dripbag/");
			return false;
		}
		return true;
	}

}