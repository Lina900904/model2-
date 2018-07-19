package dao;


import domain.*;
import service.*;

import java.util.List;

import dao.*;

public class ExamDAOImpl implements ExamDAO{
	private static ExamDAO instance = new ExamDAOImpl();
	public static ExamDAO getInstance() {return instance;}
	private ExamDAOImpl() {};
	
	@Override
	public void insertExam(ExamBean exam) {
		

	}
	@Override
	public List<ExamBean> selectExamList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ExamBean> selectExamSome(String word) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ExamBean selectExamOne(ExamBean examBean) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int countExam() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void updateExam(ExamBean examBean) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteExam(ExamBean examBean) {
		// TODO Auto-generated method stub
		
	}

	
	


}
