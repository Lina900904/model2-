package service;

import java.util.List;

import domain.ExamBean;
import domain.MemberBean;
import domain.ProjectTeamBean;

public interface ProjectTeamService {
	public void ProjectTeamcreateJoin(ProjectTeamBean ProjectTeam);
	public List<ProjectTeamBean> ProjectTeamlist();
	public List<ProjectTeamBean> ProjectTeamfindByName(ProjectTeamBean ProjectTeam);
	public ProjectTeamBean ProjectTeamfindById(ProjectTeamBean ProjectTeam);
	public void ProjectTeamUpdate(ProjectTeamBean ProjectTeam);
	public void ProjectTeamDelete(ProjectTeamBean ProjectTeam);
	public int ProjectTeamCount();
}
