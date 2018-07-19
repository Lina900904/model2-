package dao;

import java.util.List;

import domain.*;

public interface SubjectDAO {
	public void insertSubject(SubjectBean Subject);
	public List<SubjectBean> selectSubjectList();
	public List<SubjectBean> selectSubjectSome(String word);
	public SubjectBean selectSubjectOne(SubjectBean Subject);
	public int countSubject();
	public void updateSubject(SubjectBean Subject);
	public void deleteSubject(SubjectBean Subject);


}
