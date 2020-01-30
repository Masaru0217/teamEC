package com.internousdev.mocha.action;

import java.sql.SQLException;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.internousdev.mocha.dao.DestinationInfoDAO;

public class CreateDestinationCompleteAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	private DestinationInfoDAO destinationInfoDAO = new DestinationInfoDAO();

	// throws SQLExceptionエラーメッセージを表示
	public String execute() throws SQLException {
	// DAOにfirst_name,user_address等を渡して、データベースに登録
		String tempLogined = String.valueOf(session.get("logined"));
		int logined = "null".equals(tempLogined) ? 0 : Integer.parseInt(tempLogined);
		if (logined != 1) {
			return "loginError";
		}
		String result = ERROR;
		int count = destinationInfoDAO.insert(session.get("userId").toString(), session.get("family_name").toString(),
				session.get("first_name").toString(), String.valueOf(session.get("family_name_kana")),
				String.valueOf(session.get("first_name_kana")),session.get("email").toString(),
				String.valueOf(session.get("tel_number")), String.valueOf(session.get("user_address")));

		if (count > 0) {
			result = SUCCESS;
		}

		session.remove("family_name");
		session.remove("first_name");
		session.remove("family_name_kana");
		session.remove("first_name_kana");
		session.remove("email");
		session.remove("tel_number");
		session.remove("user_address");
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
