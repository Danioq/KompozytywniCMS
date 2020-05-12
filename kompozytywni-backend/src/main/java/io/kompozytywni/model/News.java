package io.kompozytywni.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;

@Entity
@Validated
public class News   {

  @Id
  @JsonProperty("id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @JsonProperty("title")
  private String title;

  @JsonProperty("date")
  private LocalDate date;

  @JsonProperty("projectId")
  private Integer projectId;

  @JsonProperty("description")
  private String description;

  @Valid
  @JsonProperty("photos")
  @ElementCollection
  private List<byte[]> photos;

  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  @Valid
  public LocalDate getDate() {
    return date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Integer getProjectId() {
    return projectId;
  }
  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }

  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  public News addPhotosItem(byte[] photosItem) {
    if (this.photos == null) {
      this.photos = new ArrayList<byte[]>();
    }
    this.photos.add(photosItem);
    return this;
  }

  public List<byte[]> getPhotos() {
    return photos;
  }
  public void setPhotos(List<byte[]> photos) {
    this.photos = photos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    News news = (News) o;
    return Objects.equals(this.id, news.id) &&
        Objects.equals(this.title, news.title) &&
        Objects.equals(this.date, news.date) &&
        Objects.equals(this.projectId, news.projectId) &&
        Objects.equals(this.description, news.description) &&
        Objects.equals(this.photos, news.photos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, date, projectId, description, photos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class News {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    photos: ").append(toIndentedString(photos)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

