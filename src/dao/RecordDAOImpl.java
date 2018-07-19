package dao;

import java.util.List;

import domain.RecordBean;

public class RecordDAOImpl implements RecordDAO{
	private static RecordDAO instance = new RecordDAOImpl();
	public static RecordDAO getInstance() {return instance;}
	private RecordDAOImpl() {};


	@Override
	public void insertRecord(RecordBean Record) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<RecordBean> selectRecordList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RecordBean> selectRecordSome(String word) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RecordBean selectRecordOne(RecordBean Record) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countRecord() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateRecord(RecordBean Record) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRecord(RecordBean Record) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String selectFirstRowNum() {
		// TODO Auto-generated method stub
		return null;
	}

}
