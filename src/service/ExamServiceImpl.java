package service;

import java.util.List;

import javax.naming.ServiceUnavailableException;

import dao.ExamDAOImpl;
import dao.RecordDAOImpl;
import dao.SubJectDAOImpl;

import java.util.ArrayList;

import domain.*;
import service.*;

public class ExamServiceImpl  implements ExamService{
	private static ExamService intstance = new ExamServiceImpl();
	public static ExamService getInstance() {return intstance;}
	private ExamServiceImpl() {}
	
	@Override
	public void Examcreate(ExamBean exam) {
		System.out.println("===== ExamService =====");
        System.out.println(exam);
        // 과목SEQ=null,
        // 성적표SEQ=null
        System.out.println("----- RECORD TABLE INSERT ------");
        RecordBean rec = new RecordBean();
        rec.setAvg("80");
        rec.setGrade("");
        RecordDAOImpl.getInstance().insertRecord(rec);
        System.out.println("------ Exam TABLE INSERT ------");
        exam.setScore(exam.getScore().split("/")[0]);
        exam.setSub_seq(
                SubJectDAOImpl.getInstance().
               selectSubjectSome("JAVA").get(0)
                .getSub_seq())
                ;
        exam.setSub_seq(RecordDAOImpl.getInstance()
                .selectFirstRowNum());    
        ExamDAOImpl.getInstance().insertExam(exam);
	}
	@Override
	public List<ExamBean> Examlist() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ExamBean> ExamfindByName(ExamBean exam) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ExamBean ExamfindById(ExamBean exam) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void ExamUpdate(ExamBean exam) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ExamDelete(ExamBean exam) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int ExamCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
	

}
