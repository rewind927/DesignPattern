package com.design.pattern.prototype;

public class CookieMachine {

	private Cookie cookie;//cookie必須是可複製的

	public CookieMachine(Cookie cookie) {
		this.cookie = cookie;
	}

	public Cookie makeCookie() {
		try {
			return (Cookie) cookie.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String args[]) {
		String[] nameArray = {"Jason", "Ethan", "Daniel", "Wendy", "Ascii", "Ryan", "Karen"};
		Cookie tempCookie = null;
		Cookie cookie = new Cookie();
		cookie.cookieEndDate = "2015/12/31";
		CookieMachine cm = new CookieMachine(cookie); //設置原型
		for (int i = 0; i < nameArray.length; i++) {
			tempCookie = cm.makeCookie();//通過複製原型返回多個cookie
			tempCookie.cookieName = nameArray[i];
			System.out.println("========= new cookie ========");
			System.out.println("cookie name = " + tempCookie.cookieName);
			System.out.println("cookie end date = " + tempCookie.cookieEndDate);
		}
	}
}