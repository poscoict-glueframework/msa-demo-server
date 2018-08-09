package com.example.demozuulserver;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class MyPostFilter extends ZuulFilter {

	@Override
	public boolean shouldFilter() {
		System.out.println("############### MyPostFilter.shouldFilter() 뭐니?");
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object run() throws ZuulException {
		System.out.println("############### MyPostFilter.run() 뭐니?");
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		System.out.println("############### MyPostFilter.run() " + request.getMethod());
		System.out.println("############### MyPostFilter.run() " + request.getRequestURI());
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String filterType() {
		System.out.println("############### MyPostFilter.filterType() 뭐니?");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int filterOrder() {
		System.out.println("############### MyPostFilter.filterOrder() 뭐니?");
		// TODO Auto-generated method stub
		return 4;
	}
}
