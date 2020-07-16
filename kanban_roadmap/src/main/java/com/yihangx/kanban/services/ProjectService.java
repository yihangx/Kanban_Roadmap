package com.yihangx.kanban.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yihangx.kanban.domain.Project;
import com.yihangx.kanban.repositories.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
	private ProjectRepository  projectReposity;
	
	public Project saveOrUpdateProject(Project project) {
		return projectReposity.save(project);
	}
}
