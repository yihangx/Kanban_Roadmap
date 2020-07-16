package com.yihangx.kanban.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yihangx.kanban.domain.Project;
import com.yihangx.kanban.repositories.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
	private ProjectRepository  projectRepository;
	
	public Project saveOrUpdateProject(Project project) {
		return projectRepository.save(project);
	}
	
    public Project findProjectByIdentifier(String projectId){

        Project project = projectRepository.findByProjectIdentifier(projectId.toUpperCase());

        return project;
    }
    
    public Iterable<Project> findAllProjects() {
    	return projectRepository.findAll();
    }
    
    public void deleteProjectByIdentifier(String projectid){
        Project project = projectRepository.findByProjectIdentifier(projectid.toUpperCase());
        projectRepository.delete(project);
    }

}