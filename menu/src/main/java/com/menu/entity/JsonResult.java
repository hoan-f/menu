package com.menu.entity;

public class JsonResult {
	public static final int SUCCESS=0;
	public static final int ERROR=1;
	private int state;
	private Object data;
	private String message;
	public JsonResult(int state, Object data, String message) {
		super();
		this.state = state;
		this.data = data;
		this.message = message;
	}
	public JsonResult(int state,Throwable e){
		this.state = state;
		data=null;
		message = e.getMessage();
	}
	public JsonResult(Throwable e){
		state = ERROR;
		data = null;
		message = e.getMessage();
	}
	public JsonResult(Object data){
		state = SUCCESS;
		this.data = data;
		message="";
	}
	public JsonResult() {
		super();
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public static int getSuccess() {
		return SUCCESS;
	}
	public static int getError() {
		return ERROR;
	}
	@Override
	public String toString() {
		return "JsonResult [state=" + state + ", data=" + data + ", message=" + message + "]";
	}
	

}
