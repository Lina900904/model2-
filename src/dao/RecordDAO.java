package dao;

import java.util.List;

import domain.*;

public interface RecordDAO {
	public void insertRecord(RecordBean Record);
	public List<RecordBean> selectRecordList();
	public List<RecordBean> selectRecordSome(String word);
	public RecordBean selectRecordOne(RecordBean Record);
	public int countRecord();
	public void updateRecord(RecordBean Record);
	public void deleteRecord(RecordBean Record);
	public String selectFirstRowNum();
}
