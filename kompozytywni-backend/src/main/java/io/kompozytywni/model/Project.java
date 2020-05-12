package io.kompozytywni.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;

@Entity
@Validated
public class Project   {

  @Id
  @JsonProperty("id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @JsonProperty("name")
  private String name;

  @Valid
  @ElementCollection
  @JsonProperty("photos")
  private List<String> photos;

  @JsonProperty("description")
  private String description;

  public Project id (Long id){
    this.id = id;
    return this;
  }

  public Project name (String name) {
    this.name = name;
    return this;
  }

  public Project photos (List<String> photos) {
    this.photos = photos;
    return this;
  }


  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public Project addPhotosItem(String photosItem) {
    if (this.photos == null) {
      this.photos = new ArrayList<String>();
    }
    this.photos.add(photosItem);
    return this;
  }

  public List<String> getPhotos() {
    return photos;
  }
  public void setPhotos(List<String> photos) {
    this.photos = photos;
  }

  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.id, project.id) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.photos, project.photos) &&
        Objects.equals(this.description, project.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, photos, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    photos: ").append(toIndentedString(photos)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

