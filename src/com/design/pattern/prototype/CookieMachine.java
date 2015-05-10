package com.design.pattern.prototype;

public class CookieMachine {

	private Cookie cookie;

	public CookieMachine(Cookie cookie) {
		this.cookie = cookie;
	}

	public Cookie makeCookie() {
		Cookie cookie = new Cookie();
		cookie.cookieEndDate = "2015/12/31";
		// make return clone cookie
		return cookie;
	}

	public static void main(String args[]) {
		String[] nameArray = {"Jason", "Ethan", "Daniel", "Wendy", "Ascii", "Ryan", "Karen"};
		Cookie tempCookie = null;

		//setting prototype
		Cookie cookie = new Cookie();
		// setting cookie end date
		CookieMachine cm = new CookieMachine(cookie);

		for (int i = 0; i < nameArray.length; i++) {
			tempCookie = cm.makeCookie();//通過複製原型返回多個cookie
			tempCookie.cookieName = nameArray[i];
			System.out.println("========= new cookie ========");
			System.out.println("cookie name = " + tempCookie.cookieName);
			System.out.println("cookie end date = " + tempCookie.cookieEndDate);
		}
	}
}