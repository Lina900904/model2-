package service;

import java.util.ArrayList;
import java.util.List;

import dao.*;
import domain.*;
import service.*;

public class MemberServiceImpl implements MemeberService {
	private static MemeberService intstance = new MemberServiceImpl();

	public static MemeberService getInstance() {
		return intstance;
	}

	private MemberServiceImpl() {
	}

	@Override
	public void membercreateJoin(MemberBean member) {

		MemberDAOImpl.getInstance().insertMember(member);

	}

	@Override
	public List<MemberBean> memberList() {
		return MemberDAOImpl.getInstance().selectMemberList();
	}

	@Override
	public List<MemberBean> memberfindByName(String name) {
		return MemberDAOImpl.getInstance().selectMemberSome(name);
	}

	@Override
	public MemberBean memberfindById(String id) {

		return MemberDAOImpl.getInstance().selectMemberOne(id);
	}

	@Override
	public boolean memberUpdate(MemberBean member) {
		return (MemberDAOImpl.getInstance().updateMember(member)!=null);

	}

	@Override
	public boolean memberDelete(MemberBean member) {
		return (MemberDAOImpl.getInstance().deleteMember(member)!=null);
		
	}

	@Override
	public int memberCount() {
		// TODO Auto-generated method stub
		return (MemberDAOImpl.getInstance().countMember());
	}

	@Override
	public boolean login(MemberBean member) {

		return (MemberDAOImpl.getInstance().login(member) != null);
	}

}
