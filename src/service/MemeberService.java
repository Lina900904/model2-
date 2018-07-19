package service;

import java.util.List;

import domain.ExamBean;
import domain.MemberBean;

public interface MemeberService {
	public void membercreateJoin(MemberBean member);
	public List<MemberBean> memberList();
	public List<MemberBean> memberfindByName(String name);
	public MemberBean memberfindById(String id);
	public boolean memberUpdate(MemberBean member);
	public boolean memberDelete(MemberBean member);
	public int memberCount();
	public boolean login(MemberBean member);


}
