package io.kompozytywni.controller;

import io.kompozytywni.model.Project;
import io.kompozytywni.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
public class ProjectApiController implements ProjectApi {

    @Autowired
    private ProjectRepository projectRepository;

    private static final Logger log = LoggerFactory.getLogger(ProjectApiController.class);
    private final HttpServletRequest request;

    @Autowired
    public ProjectApiController(HttpServletRequest request) {
        this.request = request;
    }

    public @ResponseBody ResponseEntity<List<Project>> getProjects() {
        return new ResponseEntity<>(projectRepository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<Void> addProject(@Valid @RequestBody Project body) {
        projectRepository.save(body);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public ResponseEntity<Void> deleteProject(Long projectId) {
        projectRepository.delete(projectId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public @ResponseBody ResponseEntity<Project> getProjectById(Long projectId) {
        return new ResponseEntity<>(projectRepository.getOne(projectId), HttpStatus.OK);
    }

    public ResponseEntity<Void> updateProject(Project body, Long projectId) {
        Project project = projectRepository.getOne(projectId);
        project.setName(body.getName());
        project.setDescription(body.getDescription());
        project.setPhotos(body.getPhotos());
        projectRepository.save(project);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<Void> uploadImageToProject(Long projectId, String additionalMetadata, MultipartFile photo) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
