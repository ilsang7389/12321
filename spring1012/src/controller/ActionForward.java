package controller;

public class ActionForward {
	private String url; // 모델이 실행한 후 이동할viewName
	private boolean method; //모델이 실행 후 이동할 이동 방식 / method에는 forward와 redirect가 들어간다
	public ActionForward() {
	}
	//hello,false:foward,true:redirect
	public ActionForward(String url, boolean method){
		this.url = url;
		this.method = method;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public boolean isMethod() {
		return method;
	}
	public void setMethod(boolean method) {
		this.method = method;
	}
	
	
}
