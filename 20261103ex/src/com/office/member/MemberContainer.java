package com.office.member;

public class MemberContainer {
	
//싱글턴
	final private MemberDao MEMBER_DAO = new MemberDao();
	final private MemberService MEMBER_SERVICE = new MemberService(MEMBER_DAO);
	final private MemberController MEMBER_CONTROLLER = new MemberController(MEMBER_SERVICE);
	
	
	
	private static MemberContainer memberContainer;
	
	
	private MemberContainer() {}
	
	public static MemberContainer getInstance() {
		if(memberContainer == null) {
			memberContainer = new MemberContainer();
		}
		
		return memberContainer;
	}

	public MemberController getMemberController() {
		return MEMBER_CONTROLLER; //수정할 수 없게 겟터만 만들기
	}

	public MemberService getMemberService() {
		return MEMBER_SERVICE;
	}

	public MemberDao getMemberDao() {
		return MEMBER_DAO;
	}

}
