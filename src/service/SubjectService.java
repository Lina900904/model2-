package service;

import java.util.List;

import domain.ExamBean;
import domain.MemberBean;
import domain.SubjectBean;

public interface SubjectService {
	public void SubjectcreateJoin(SubjectBean Subject);
	public List<SubjectBean> Subjectlist();
	public List<SubjectBean> SubjectfindByName(SubjectBean Subject);
	public SubjectBean SubjectfindById(SubjectBean Subject);
	public void SubjectUpdate(SubjectBean Subject);
	public void SubjectDelete(SubjectBean Subject);
	public int SubjectCount();

}
