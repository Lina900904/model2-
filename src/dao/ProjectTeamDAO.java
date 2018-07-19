package dao;

import java.util.List;

import domain.*;

public interface ProjectTeamDAO {
	public void insertProjectTeam(ProjectTeamBean ProjectTeamBean);
	public List<ProjectTeamBean> selectProjectTeamList();
	public List<ProjectTeamBean> selectProjectTeamSome(String word);
	public ProjectTeamBean selectProjectTeamOne(ProjectTeamBean ProjectTeamBean);
	public int countProjectTeam();
	public void updateProjectTeam(ProjectTeamBean ProjectTeamBean);
	public void deleteProjectTeam(ProjectTeamBean ProjectTeamBean);
}
