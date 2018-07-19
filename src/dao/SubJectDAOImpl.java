package dao;

import java.util.List;

import domain.SubjectBean;

public class SubJectDAOImpl implements SubjectDAO{
	private static SubjectDAO instance = new SubJectDAOImpl();
	public static SubjectDAO getInstance() {return instance;}
	private SubJectDAOImpl() {};



	@Override
	public void insertSubject(SubjectBean Subject) {
		
	}

	@Override
	public List<SubjectBean> selectSubjectList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SubjectBean> selectSubjectSome(String word) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SubjectBean selectSubjectOne(SubjectBean Subject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countSubject() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateSubject(SubjectBean Subject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSubject(SubjectBean Subject) {
		// TODO Auto-generated method stub
		
	}


	
}
