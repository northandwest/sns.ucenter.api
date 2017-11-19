package com.bucuoa.ucenter.model;

import java.io.Serializable;
import java.util.Date;

public class UlewoUser implements Serializable {
	private static final long serialVersionUID = 8038625955059163316L;

	private Long userId; // userid

	private String email; // 邮箱

	private String userName; // 用户名

	private String nickName; // nickname

	private String password; // 密码

	private String userIcon; // 用户小图像

	private String age; // 年龄

	private String userBg; // 背景

	private String sex; // 性别 m男 f女

	private String characters; // 个性签名

	private Integer mark; // 积分

	private String address; // 籍贯

	private String work; // 职业

	private Date registerTime; // 注册时间

	private Date preVisitTime; // 访问时间

	private Date birthday; // 生日

	private String isvalid; // 是否有效 y有效 n无效

	private String centerTheme; // 主题

	private String activationCode; // 激活码
	private boolean haveFocus;
	
	

	public boolean isHaveFocus() {
		return haveFocus;
	}

	public void setHaveFocus(boolean haveFocus) {
		this.haveFocus = haveFocus;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserIcon() {
		return userIcon;
	}

	public void setUserIcon(String userIcon) {
		this.userIcon = userIcon;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getUserBg() {
		return userBg;
	}

	public void setUserBg(String userBg) {
		this.userBg = userBg;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCharacters() {
		return characters;
	}

	public void setCharacters(String characters) {
		this.characters = characters;
	}

	public Integer getMark() {
		return mark;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public Date getPreVisitTime() {
		return preVisitTime;
	}

	public void setPreVisitTime(Date preVisitTime) {
		this.preVisitTime = preVisitTime;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getIsvalid() {
		return isvalid;
	}

	public void setIsvalid(String isvalid) {
		this.isvalid = isvalid;
	}

	public String getCenterTheme() {
		return centerTheme;
	}

	public void setCenterTheme(String centerTheme) {
		this.centerTheme = centerTheme;
	}

	public String getActivationCode() {
		return activationCode;
	}

	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}

}
