package service;

import java.util.List;
import java.util.ArrayList;

import domain.*;

public interface ExamService {
	public void Examcreate(ExamBean exam);
	public List<ExamBean> Examlist();
	public List<ExamBean> ExamfindByName(ExamBean exam);
	public ExamBean ExamfindById(ExamBean exam);
	public void ExamUpdate(ExamBean exam);
	public void ExamDelete(ExamBean exam);
	public int ExamCount();
}
