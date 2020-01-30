package com.internousdev.mocha.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;

public class CreateDestinationAction extends ActionSupport implements SessionAware {
	private String backFlag;
	private Map<String, Object> session;

	public String execute() {
		String tempLogined = String.valueOf(session.get("logined"));
		int logined = "null".equals(tempLogined) ? 0 : Integer.parseInt(tempLogined);
		if (logined != 1) {
			return "loginError";
		}
		if (backFlag == null) {
			session.remove("user_id");
			session.remove("family_name");
			session.remove("first_name");
			session.remove("family_name_kana");
			session.remove("first_name_kana");
			session.remove("user_address");
			session.remove("tel_number");
			session.remove("email");
		}
		return SUCCESS;
	}

	public String getBackFlag() {
		return backFlag;
	}

	public void setBackFlag(String backFlag) {
		this.backFlag = backFlag;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
