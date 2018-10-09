package it.eng.npat.traffico.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * dati che caratterizzano il messaggio di errore in caso di 4XX e 5XX
 */
@ApiModel(description = "dati che caratterizzano il messaggio di errore in caso di 4XX e 5XX")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-10-08T17:21:54.417Z[Etc/UTC]")

public class ErrorMessage   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("erroreSourceSystem")
  private String erroreSourceSystem = null;

  @JsonProperty("moreInfo")
  private String moreInfo = null;

  @JsonProperty("userMessage")
  private String userMessage = null;

  public ErrorMessage code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Contiene il codice di errore generato dall'applicazione. Qualora non applicabile il campo verrà valorizzato a stringa vuota. Nel caso di propagazione da parte dell’APIGW di un errore del Legacy, il campo verrà valorizzato a -1 
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Contiene il codice di errore generato dall'applicazione. Qualora non applicabile il campo verrà valorizzato a stringa vuota. Nel caso di propagazione da parte dell’APIGW di un errore del Legacy, il campo verrà valorizzato a -1 ")
  @NotNull


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ErrorMessage message(String message) {
    this.message = message;
    return this;
  }

  /**
   * dettaglio dell'errore (possibilmente comprensibile dai comuni mortali) 
   * @return message
  **/
  @ApiModelProperty(required = true, value = "dettaglio dell'errore (possibilmente comprensibile dai comuni mortali) ")
  @NotNull


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorMessage timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * E' la data-ora in formato date-time UTC in cui è avvenuto l'errore
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "E' la data-ora in formato date-time UTC in cui è avvenuto l'errore")
  @NotNull

  @Valid

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public ErrorMessage erroreSourceSystem(String erroreSourceSystem) {
    this.erroreSourceSystem = erroreSourceSystem;
    return this;
  }

  /**
   * E' il nome dell'applicazione che ha generato l'errore. Viene valorizzato a FASTDATA nei casi in cui sia stato il microservizio a restituire la Response di errore. Ad \\\"APIGW\\\" nel caso in cui l'errore sia stato generato dall'APIGW. A \\\"LEGACY\\\" nel caso di servizi Passthrough in cui l'errore è stato generato dal sistema invocato dall'APIGW
   * @return erroreSourceSystem
  **/
  @ApiModelProperty(required = true, value = "E' il nome dell'applicazione che ha generato l'errore. Viene valorizzato a FASTDATA nei casi in cui sia stato il microservizio a restituire la Response di errore. Ad \\\"APIGW\\\" nel caso in cui l'errore sia stato generato dall'APIGW. A \\\"LEGACY\\\" nel caso di servizi Passthrough in cui l'errore è stato generato dal sistema invocato dall'APIGW")
  @NotNull


  public String getErroreSourceSystem() {
    return erroreSourceSystem;
  }

  public void setErroreSourceSystem(String erroreSourceSystem) {
    this.erroreSourceSystem = erroreSourceSystem;
  }

  public ErrorMessage moreInfo(String moreInfo) {
    this.moreInfo = moreInfo;
    return this;
  }

  /**
   * E' un campo che contiene ulteriori informazioni sull'errore come per esempio il link ad una pagina web
   * @return moreInfo
  **/
  @ApiModelProperty(value = "E' un campo che contiene ulteriori informazioni sull'errore come per esempio il link ad una pagina web")


  public String getMoreInfo() {
    return moreInfo;
  }

  public void setMoreInfo(String moreInfo) {
    this.moreInfo = moreInfo;
  }

  public ErrorMessage userMessage(String userMessage) {
    this.userMessage = userMessage;
    return this;
  }

  /**
   * Contiene un eventuale messaggio da fornire all'utente finale
   * @return userMessage
  **/
  @ApiModelProperty(value = "Contiene un eventuale messaggio da fornire all'utente finale")


  public String getUserMessage() {
    return userMessage;
  }

  public void setUserMessage(String userMessage) {
    this.userMessage = userMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorMessage errorMessage = (ErrorMessage) o;
    return Objects.equals(this.code, errorMessage.code) &&
        Objects.equals(this.message, errorMessage.message) &&
        Objects.equals(this.timestamp, errorMessage.timestamp) &&
        Objects.equals(this.erroreSourceSystem, errorMessage.erroreSourceSystem) &&
        Objects.equals(this.moreInfo, errorMessage.moreInfo) &&
        Objects.equals(this.userMessage, errorMessage.userMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, timestamp, erroreSourceSystem, moreInfo, userMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorMessage {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    erroreSourceSystem: ").append(toIndentedString(erroreSourceSystem)).append("\n");
    sb.append("    moreInfo: ").append(toIndentedString(moreInfo)).append("\n");
    sb.append("    userMessage: ").append(toIndentedString(userMessage)).append("\n");
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

