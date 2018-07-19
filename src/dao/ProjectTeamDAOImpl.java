package dao;

import java.util.List;

import domain.ProjectTeamBean;

public class ProjectTeamDAOImpl implements ProjectTeamDAO {
	private static ProjectTeamDAO instance = new ProjectTeamDAOImpl();
	public static ProjectTeamDAO getInstance() {return instance;}
	private ProjectTeamDAOImpl() {};

	@Override
	public void insertProjectTeam(ProjectTeamBean ProjectTeamBean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProjectTeamBean> selectProjectTeamList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProjectTeamBean> selectProjectTeamSome(String word) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProjectTeamBean selectProjectTeamOne(ProjectTeamBean ProjectTeamBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countProjectTeam() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateProjectTeam(ProjectTeamBean ProjectTeamBean) {

		
	}

	@Override
	public void deleteProjectTeam(ProjectTeamBean ProjectTeamBean) {
		// TODO Auto-generated method stub
		
	}


}
