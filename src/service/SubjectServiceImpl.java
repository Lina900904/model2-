package service;

import java.util.ArrayList;
import java.util.List;

import domain.*;
import service.*;

public class SubjectServiceImpl implements SubjectService{
	private static SubjectService intstance = new SubjectServiceImpl();
	public static SubjectService getInstance() {return intstance;}
	private SubjectServiceImpl() {}
	@Override
	public void SubjectcreateJoin(SubjectBean Subject) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<SubjectBean> Subjectlist() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<SubjectBean> SubjectfindByName(SubjectBean Subject) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public SubjectBean SubjectfindById(SubjectBean Subject) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void SubjectUpdate(SubjectBean Subject) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void SubjectDelete(SubjectBean Subject) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int SubjectCount() {

		
		
		return 0;
	}


		

}
