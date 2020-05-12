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
public class Gallery   {

  @Id
  @JsonProperty("id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @JsonProperty("name")
  private String name;

  @Valid
  @ElementCollection
  @JsonProperty("photos")
  private List<byte[]> photos;

  public Long getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Gallery addPhotosItem(byte[] photosItem) {
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
    Gallery gallery = (Gallery) o;
    return Objects.equals(this.id, gallery.id) &&
        Objects.equals(this.name, gallery.name) &&
        Objects.equals(this.photos, gallery.photos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, photos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gallery {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    photos: ").append(toIndentedString(photos)).append("\n");
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

