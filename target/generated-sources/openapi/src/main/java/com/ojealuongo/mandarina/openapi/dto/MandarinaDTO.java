package com.ojealuongo.mandarina.openapi.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MandarinaDTO
 */

@JsonTypeName("mandarina")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-01T14:23:24.654369204-03:00[America/Argentina/Buenos_Aires]")
public class MandarinaDTO {

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  public MandarinaDTO id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identificador de la mandarina
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "Identificador de la mandarina", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MandarinaDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nombre de la mandarina
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Nombre de la mandarina", required = true)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MandarinaDTO mandarina = (MandarinaDTO) o;
    return Objects.equals(this.id, mandarina.id) &&
        Objects.equals(this.name, mandarina.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MandarinaDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

