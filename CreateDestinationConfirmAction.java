package com.internousdev.mocha.action;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.mocha.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;

public class CreateDestinationConfirmAction extends ActionSupport implements SessionAware {

	// 変数を宣言する
	private String family_name;
	private String first_name;
	private String family_name_kana;
	private String first_name_kana;
	private String user_address;
	private String tel_number;
	private String email;
	public Map<String, Object> session;
	private String errorMessage;

	private List<String> Message_family_name = new ArrayList<String>();
	private List<String> Message_first_name = new ArrayList<String>();
	private List<String> Message_family_name_kana = new ArrayList<String>();
	private List<String> Message_first_name_kana = new ArrayList<String>();
	private List<String> Message_user_address = new ArrayList<String>();
	private List<String> Message_tel_number = new ArrayList<String>();
	private List<String> Message_Email = new ArrayList<String>();

	// Strutsで実行する
	public String execute() {
		String result = SUCCESS;
		InputChecker input = new InputChecker();

		// 値を送る
		session.put("family_name", family_name);
		session.put("first_name", first_name);
		session.put("family_name_kana", family_name_kana);
		session.put("first_name_kana", first_name_kana);
		session.put("tel_number", tel_number);
		session.put("email", email);
		session.put("user_address", user_address);

		Message_family_name = input.doCheck("姓", family_name, 1, 16, true, true, true, false, true, false);
		Message_first_name = input.doCheck("名", first_name, 1, 16, true, true, true, false, true, false);
		Message_family_name_kana = input.doCheck("姓ふりがな", family_name_kana, 1, 16, false, false, true, false, false,
				false);
		Message_first_name_kana = input.doCheck("名ふりがな", first_name_kana, 1, 16, false, false, true, false, false,
				false);
		Message_user_address = input.doCheck("住所", user_address, 10, 50, true, true, true, true, true, true);
		Message_tel_number = input.doCheck("電話番号", tel_number, 10, 13, false, false, false, true, false, false);
		Message_Email = input.doCheckForEmail(email);

		if (Message_family_name.size() > 0 || Message_first_name.size() > 0 || Message_family_name.size() > 0
				|| Message_family_name_kana.size() > 0 || Message_first_name_kana.size() > 0
				|| Message_user_address.size() > 0 || Message_tel_number.size() > 0 || Message_Email.size() > 0) {
			result = ERROR;

		} else {
			// setErrorMessage("未入力の項目があります。");
			result = SUCCESS;
		}
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	// セッターとゲッターで受け渡しする
	public String getFamily_name() {
		return family_name;
	}

	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getFamily_name_kana() {
		return family_name_kana;
	}

	public void setFamily_name_kana(String family_name_kana) {
		this.family_name_kana = family_name_kana;
	}

	public String getFirst_name_kana() {
		return first_name_kana;
	}

	public void setFirst_name_kana(String first_name_kana) {
		this.first_name_kana = first_name_kana;
	}

	public String getTel_number() {
		return tel_number;
	}

	public void setTel_number(String tel_number) {
		this.tel_number = tel_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<String> getMessage_family_name() {
		return Message_family_name;
	}

	public void setMessage_family_name(List<String> message_family_name) {
		Message_family_name = message_family_name;
	}

	public List<String> getMessage_first_name() {
		return Message_first_name;
	}

	public void setMessage_first_name(List<String> message_first_name) {
		Message_first_name = message_first_name;
	}

	public List<String> getMessage_family_name_kana() {
		return Message_family_name_kana;
	}

	public void setMessage_family_name_kana(List<String> message_family_name_kana) {
		Message_family_name_kana = message_family_name_kana;
	}

	public List<String> getMessage_first_name_kana() {
		return Message_first_name_kana;
	}

	public void setMessage_first_name_kana(List<String> message_first_name_kana) {
		Message_first_name_kana = message_first_name_kana;
	}

	public List<String> getMessage_user_address() {
		return Message_user_address;
	}

	public void setMessage_user_address(List<String> message_user_address) {
		Message_user_address = message_user_address;
	}

	public List<String> getMessage_tel_number() {
		return Message_tel_number;
	}

	public void setMessage_tel_number(List<String> message_tel_number) {
		Message_tel_number = message_tel_number;
	}

	public List<String> getMessage_Email() {
		return Message_Email;
	}

	public void setMessage_Email(List<String> message_Email) {
		Message_Email = message_Email;
	}

}
