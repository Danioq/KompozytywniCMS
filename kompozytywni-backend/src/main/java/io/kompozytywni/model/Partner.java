package io.kompozytywni.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Validated
public class Partner   {

  @Id
  @JsonProperty("id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("logo")
  private byte[] logo;

  @JsonProperty("description")
  private String description;

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public byte[] getLogo() {
    return logo;
  }
  public void setLogo(byte[] logo) {
    this.logo = logo;
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
    Partner partner = (Partner) o;
    return Objects.equals(this.id, partner.id) &&
        Objects.equals(this.name, partner.name) &&
        Objects.equals(this.logo, partner.logo) &&
        Objects.equals(this.description, partner.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, logo, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Partner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
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

