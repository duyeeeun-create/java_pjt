package com.office.member;

public class MemberDto {
	
	//DTO 는 멤버필드 프라이빗 생성자오버로딩 겟터셋터
	
	//DTO 모아서 똑같이 해준다
	private String mamId;
	private String mamPw;
	private String mamMail;
	private String mamPhone;
	
	
	public MemberDto() {
		//다양한 경우의 수 때문에 디폴트생성자는만들어놓는다
	}
	
	public MemberDto(String mamId, String mamPw, String mamMail, String mamPhone) {
		
		this.mamId = mamId;
		this.mamPw = mamPw;
		this.mamMail = mamMail;
		this.mamPhone = mamPhone;
	}

	public String getMamId() {
		return mamId;
	}

	public void setMamId(String mamId) {
		this.mamId = mamId;
	}

	public String getMamPw() {
		return mamPw;
	}

	public void setMamPw(String mamPw) {
		this.mamPw = mamPw;
	}

	public String getMamMail() {
		return mamMail;
	}

	public void setMamMail(String mamMail) {
		this.mamMail = mamMail;
	}

	public String getMamPhone() {
		return mamPhone;
	}

	public void setMamPhone(String mamPhone) {
		this.mamPhone = mamPhone;
	}
	
	
	
	
	

}
