package dto;

public class MemberDTO {
	String memberid,name;
	int pw;
	String phone,email,regtime,update_name;
	public MemberDTO() {}
	public MemberDTO(String memberid, String name, int pw, String phone, String email, String regtime) {
		super();
		this.memberid = memberid;
		this.name = name;
		this.pw = pw;
		this.phone = phone;
		this.email = email;
		this.regtime = regtime;
	}
	public String getUpdate_name() {
		return update_name;
	}
	public void setUpdate_name(String update_name) {
		this.update_name = update_name;
	}
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegtime() {
		return regtime;
	}
	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}
	@Override
	public String toString() {
		return memberid + ":" + name + ":" + pw + ":" + phone + ":" + email + ":" + regtime;
	}
	
	
	
}
