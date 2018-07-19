package service;

import java.util.List;

import domain.ExamBean;
import domain.MemberBean;
import domain.RecordBean;

public interface RecordService {
	public void RecordcreateJoin(RecordBean Record);
	public List<RecordBean> Recordlist();
	public List<RecordBean> RecordfindByName(RecordBean Record);
	public RecordBean RecordfindById(RecordBean Record);
	public void RecordUpdate(RecordBean Record);
	public void RecordDelete(RecordBean Record);
	public int RecordCount();
	public String selectFirstRowNum();
}
