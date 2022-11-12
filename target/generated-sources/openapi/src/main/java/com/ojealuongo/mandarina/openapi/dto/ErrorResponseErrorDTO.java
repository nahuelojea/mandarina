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
 * Payload estandard
 */

@Schema(name = "error_response_error", description = "Payload estandard")
@JsonTypeName("error_response_error")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-01T14:23:24.654369204-03:00[America/Argentina/Buenos_Aires]")
public class ErrorResponseErrorDTO {

  @JsonProperty("message")
  private String message;

  @JsonProperty("request_id")
  private String requestId;

  @JsonProperty("details")
  private String details;

  @JsonProperty("code")
  private Integer code;

  public ErrorResponseErrorDTO message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Describe la causa del error. Las descripciones se deberán componer de textos fijos para cada tipo de error producido, por lo que deben ser generadas a partir de una estructura de datos como un enumerado.
   * @return message
  */
  @NotNull 
  @Schema(name = "message", description = "Describe la causa del error. Las descripciones se deberán componer de textos fijos para cada tipo de error producido, por lo que deben ser generadas a partir de una estructura de datos como un enumerado.", required = true)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorResponseErrorDTO requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Describe un código de petición único. Esto permite disponer de trazabilidad en caso de necesitar inspeccionar logs.
   * @return requestId
  */
  @NotNull 
  @Schema(name = "request_id", description = "Describe un código de petición único. Esto permite disponer de trazabilidad en caso de necesitar inspeccionar logs.", required = true)
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public ErrorResponseErrorDTO details(String details) {
    this.details = details;
    return this;
  }

  /**
   * Contiene un objeto con el detalle adicional de errores que desee aportar cada product owner del aplicativo sobre el que se desarrolla el servicio REST y que debe ser definido por este. Puede contener arrays con mayor detalle.
   * @return details
  */
  
  @Schema(name = "details", description = "Contiene un objeto con el detalle adicional de errores que desee aportar cada product owner del aplicativo sobre el que se desarrolla el servicio REST y que debe ser definido por este. Puede contener arrays con mayor detalle.", required = false)
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public ErrorResponseErrorDTO code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Respuesta proporcionada por las aplicaciones en caso de error. Dicho valor será utilizado como Código de Error de Aplicación, siendo su empleo opcional y de libre uso por parte de los responsables de las aplicaciones para gestionar sus propios códigos de retorno ante errores, aunque en caso de utilizarse, es obligatorio documentar apropiadamente el significado de cada uno de los posibles valores devueltos en dicho atributo, pudiendo documentarse en el propio fichero OpenAPI o pudiendo ser documentado apropiadamente (subiendo documentación adicional al API con los posibles códigos de error o un enlace a dicha documentación a un enlace externo) para que sea fácilmente accesible en caso de precisarse consultar.
   * @return code
  */
  
  @Schema(name = "code", description = "Respuesta proporcionada por las aplicaciones en caso de error. Dicho valor será utilizado como Código de Error de Aplicación, siendo su empleo opcional y de libre uso por parte de los responsables de las aplicaciones para gestionar sus propios códigos de retorno ante errores, aunque en caso de utilizarse, es obligatorio documentar apropiadamente el significado de cada uno de los posibles valores devueltos en dicho atributo, pudiendo documentarse en el propio fichero OpenAPI o pudiendo ser documentado apropiadamente (subiendo documentación adicional al API con los posibles códigos de error o un enlace a dicha documentación a un enlace externo) para que sea fácilmente accesible en caso de precisarse consultar.", required = false)
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponseErrorDTO errorResponseError = (ErrorResponseErrorDTO) o;
    return Objects.equals(this.message, errorResponseError.message) &&
        Objects.equals(this.requestId, errorResponseError.requestId) &&
        Objects.equals(this.details, errorResponseError.details) &&
        Objects.equals(this.code, errorResponseError.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, requestId, details, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponseErrorDTO {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

