package service;

import java.util.ArrayList;
import java.util.List;

import domain.*;
import service.*;

public class RecordServiceImpl implements RecordService{
	private static RecordService intstance = new RecordServiceImpl();
	public static RecordService getInstance() {return intstance;}
	private RecordServiceImpl() {}
	@Override
	public void RecordcreateJoin(RecordBean Record) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<RecordBean> Recordlist() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<RecordBean> RecordfindByName(RecordBean Record) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public RecordBean RecordfindById(RecordBean Record) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void RecordUpdate(RecordBean Record) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void RecordDelete(RecordBean Record) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int RecordCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String selectFirstRowNum() {
		// TODO Auto-generated method stub
		return null;
	}

		


}
