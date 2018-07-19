package service;

import java.util.ArrayList;
import java.util.List;

import domain.*;
import domain.ProjectTeamBean;
import service.*;

public class ProjectTeamServiceImpl implements ProjectTeamService{
	private static ProjectTeamService intstance = new ProjectTeamServiceImpl();
	public static ProjectTeamService getInstance() {return intstance;}
	private ProjectTeamServiceImpl() {}
	@Override
	public void ProjectTeamcreateJoin(ProjectTeamBean ProjectTeam) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<ProjectTeamBean> ProjectTeamlist() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ProjectTeamBean> ProjectTeamfindByName(ProjectTeamBean ProjectTeam) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ProjectTeamBean ProjectTeamfindById(ProjectTeamBean ProjectTeam) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void ProjectTeamUpdate(ProjectTeamBean ProjectTeam) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ProjectTeamDelete(ProjectTeamBean ProjectTeam) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int ProjectTeamCount() {
		// TODO Auto-generated method stub
		return 0;
	}

		
}
