package io.kompozytywni.api;

import io.kompozytywni.model.Project;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.validation.Valid;
import java.util.List;

@RequestMapping
public interface ProjectApi {

    @RequestMapping(value = "/projects",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<List<Project>> getProjects();

    @RequestMapping(value = "/project",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addProject(@Valid @RequestBody Project body);

    @RequestMapping(value = "/project/{projectId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteProject(@PathVariable("projectId") Long projectId);

    @RequestMapping(value = "/project/{projectId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Project> getProjectById(@PathVariable("projectId") Long projectId);

    @RequestMapping(value = "/project/{projectId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateProject(@Valid @RequestBody Project body, @PathVariable("projectId") Long projectId);

    @RequestMapping(value = "/project/{projectId}/uploadImage",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    ResponseEntity<Void> uploadImageToProject(@PathVariable("projectId") Long projectId, @RequestParam(value="additionalMetadata", required=false)  String additionalMetadata, @Valid @RequestPart(value="photo", required=false) MultipartFile photo);
}
