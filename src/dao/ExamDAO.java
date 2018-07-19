package dao;

import domain.*;
import java.util.*;
public interface ExamDAO {
	public void insertExam(ExamBean examBean);
	public List<ExamBean> selectExamList();
	public List<ExamBean> selectExamSome(String word);
	public ExamBean selectExamOne(ExamBean examBean);
	public int countExam();
	public void updateExam(ExamBean examBean);
	public void deleteExam(ExamBean examBean);
	

}
