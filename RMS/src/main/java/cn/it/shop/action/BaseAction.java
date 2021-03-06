package cn.it.shop.action;

import java.lang.reflect.ParameterizedType;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.it.shop.service.AdminService;
import cn.it.shop.service.CategoryService;

public class BaseAction<T> extends ActionSupport implements RequestAware,SessionAware, ApplicationAware,ModelDriven<T>{
	private static final long serialVersionUID = 1L;
	//注入service
	@Resource
	protected CategoryService categoryService;
	@Resource 
	protected AdminService adminService;
	
	
	//在调用构造方法的时候给model赋值
	protected T model;
	public BaseAction() {
		ParameterizedType type = (ParameterizedType) this.getClass()
				.getGenericSuperclass();
		Class clazz = (Class) type.getActualTypeArguments()[0];
		try {
			model = (T) clazz.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	//返回的对象将要压栈
	@Override
	public T getModel() {
		return model;
	}
	protected Map<String,Object> request;
	protected Map<String,Object> session;
	protected Map<String,Object> application;
	@Override
	public void setApplication(Map<String, Object> application) {
		this.application=application;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request=request;
	}
	
	
	

}
