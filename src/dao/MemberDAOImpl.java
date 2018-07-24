package dao;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;
import com.sun.org.apache.regexp.internal.recompile;
import com.sun.xml.internal.ws.developer.MemberSubmissionAddressing.Validation;

import domain.*;
import enums.*;
import factory.*;

import oracle.jdbc.driver.DBConversion;
import pool.*;


public class MemberDAOImpl implements MemberDAO {
	private static MemberDAO instance = new MemberDAOImpl();
	public static MemberDAO getInstance() {return instance;}
	
	private MemberDAOImpl() {};


	@Override
	public void insertMember(MemberBean member) {

		try { 
		DatabaseFactory.createDatabase(
					Vendor.ORACLE, 
					DBConstant.USERNAME, 
					DBConstant.PASSWORD)
					.getConnection()
					.createStatement()
					.executeQuery(
							String.format(MemberQuery.INSERT_MEMBER.toString(),						           
						             member.getId(),member.getPassword(), member.getSsn(),member.getName()));
		} catch (Exception e) {   
			e.printStackTrace();
		}
	}

	@Override
	public List<MemberBean> selectMemberList() {

		List<MemberBean> lst = new ArrayList<>();
		try {
			Class.forName(DBConstant.ORACLE_DRIVER);
			ResultSet rs = DatabaseFactory.createDatabase(Vendor.ORACLE, DBConstant.USERNAME, DBConstant.PASSWORD)
					.getConnection()
					.createStatement()
					.executeQuery(MemberQuery.SELECT_ALL.toString());

			while(rs.next()) {
				MemberBean m = new MemberBean();
				m.setId(rs.getString("MEM_ID"));
				m.setName(rs.getString("NAME"));
				m.setPassword(rs.getString("PASSWORD"));
				m.setRoll(rs.getString("ROLL"));
				m.setSsn(rs.getString("SSN"));
				m.setTeamId(rs.getString("TEAM_ID"));
				lst.add(m);
				
	
			
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		return lst;
	}

	@Override
	public List<MemberBean> selectMemberSome(String word) {// 팀아이디
		List<MemberBean> teamList = new ArrayList<>();
		MemberBean m = null;
		try {
		Class.forName(DBConstant.ORACLE_DRIVER);
		ResultSet rs= DatabaseFactory.createDatabase(Vendor.ORACLE, DBConstant.USERNAME, DBConstant.PASSWORD)
				.getConnection()
				.createStatement()
				.executeQuery(String.format(MemberQuery.SELECT_TEAM.toString(), word));
		 
			while(rs.next()) {
			m = new MemberBean();
				m.setId(rs.getString("MEM_ID"));
				m.setName(rs.getString("NAME"));
				m.setPassword(rs.getString("PASSWORD"));
				m.setRoll(rs.getString("ROLL"));
				m.setSsn(rs.getString("SSN"));
				m.setTeamId(rs.getString("TEAM_ID"));
				teamList.add(m);

			}
	
		}catch (Exception e) {
			e.printStackTrace();
		}
		

		
		return teamList;
	}



	@Override
	public MemberBean selectMemberOne(String id) {

		MemberBean m = null;
		try {
			ResultSet rs = DatabaseFactory.createDatabase(
					Vendor.ORACLE, 
					DBConstant.USERNAME, 
					DBConstant.PASSWORD)
					.getConnection()
					.createStatement()
					.executeQuery(
							String.format(MemberQuery.SELECT_ID.toString(),
						              id));
			while(rs.next()) {
			m= new MemberBean();
           m.setId(rs.getString("MEM_ID"));
           m.setName(rs.getString("NAME"));
           m.setRoll(rs.getString("ROLL"));
           m.setPassword(rs.getString("PASSWORD"));
           m.setSsn(rs.getString("SSN"));
           m.setTeamId(rs.getString("TEAM_ID"));            
			}
		} catch (Exception e) {   
			e.printStackTrace();
		}
		
	
	return m;

	}

	@Override
	public int countMember() {
		int count = 0;
		try {
			ResultSet rs = DatabaseFactory.createDatabase(
					Vendor.ORACLE, 
					DBConstant.USERNAME, 
					DBConstant.PASSWORD)
					.getConnection()
					.createStatement()
					.executeQuery(
							MemberQuery.COUNT_MEMBER.toString());

			while(rs.next()) {
				count = rs.getInt("count");
				
                }
			
		} catch (Exception e) {   
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public MemberBean updateMember(MemberBean member) {
		MemberBean m = null;
		String oldPass = member.getPassword().split("/")[0];
		String newPass = member.getPassword().split("/")[1];
		
		
		try {
			DatabaseFactory.createDatabase(
					Vendor.ORACLE, DBConstant.USERNAME, DBConstant.PASSWORD)
			.getConnection()
			.createStatement()
			.executeUpdate(String.format(MemberQuery.UPDATE_MEMBER.toString(),        
					newPass,member.getId(), oldPass));
		
		
			 m = new MemberBean();
	
	
                
			
		} catch (Exception e) {   
			e.printStackTrace();
		}
		return m;
	}

	@Override
	public MemberBean deleteMember(MemberBean member) {

		MemberBean m =null;
		
		try {
			ResultSet rs =  DatabaseFactory.createDatabase(
					Vendor.ORACLE, DBConstant.USERNAME, DBConstant.PASSWORD)
			.getConnection()
			.createStatement()
			.executeQuery(String.format(MemberQuery.DELETE_MEMBER.toString(),        
		              member.getId(),member.getPassword()));
			
		


				m = new MemberBean();

				
	
                
			
		} catch (Exception e) {   
			e.printStackTrace();
		}
		return m;
	}


	

	@Override
	public MemberBean login(MemberBean member) {
		MemberBean m = null;
		
		try {
			ResultSet rs =  DatabaseFactory.createDatabase(
					Vendor.ORACLE, DBConstant.USERNAME, DBConstant.PASSWORD)
			.getConnection()
			.createStatement()
			.executeQuery(String.format(MemberQuery.LOGIN.toString(),        
		              member.getId(),member.getPassword()));
			
		

			while(rs.next()) {
				m = new MemberBean();
                m.setId(rs.getString("MEM_ID"));
                m.setName(rs.getString("NAME"));
                m.setTeamId(rs.getString("TEAM_ID"));                  
                m.setRoll(rs.getString("ROLL"));
                m.setPassword(rs.getString("PASSWORD"));
                }
			
		} catch (Exception e) {   
			e.printStackTrace();
		}

		return m;
	}





	
	
}