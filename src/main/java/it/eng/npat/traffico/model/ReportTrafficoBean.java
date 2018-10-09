package it.eng.npat.traffico.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReportTrafficoBean
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-10-08T17:21:54.417Z[Etc/UTC]")

public class ReportTrafficoBean   {
  @JsonProperty("numLinea")
  private String numLinea = null;

  @JsonProperty("macroFamiglia")
  private String macroFamiglia = null;

  @JsonProperty("tipoChiamata")
  private String tipoChiamata = null;

  @JsonProperty("dataChiamata")
  private OffsetDateTime dataChiamata = null;

  @JsonProperty("codiceOfferta")
  private String codiceOfferta = null;

  @JsonProperty("apn")
  private String apn = null;

  @JsonProperty("durataChiamata")
  private Integer durataChiamata = null;

  @JsonProperty("numChiamato")
  private String numChiamato = null;

  @JsonProperty("dataFatturazione")
  private OffsetDateTime dataFatturazione = null;

  @JsonProperty("centrale")
  private String centrale = null;

  @JsonProperty("costo")
  private BigDecimal costo = null;

  @JsonProperty("profiloTariffario")
  private String profiloTariffario = null;

  @JsonProperty("tipoCartaServizi2")
  private String tipoCartaServizi2 = null;

  @JsonProperty("tipoComunicazione")
  private String tipoComunicazione = null;

  @JsonProperty("volumeDati")
  private String volumeDati = null;

  @JsonProperty("classeServizio")
  private String classeServizio = null;

  @JsonProperty("prodId")
  private String prodId = null;

  @JsonProperty("identificativoSIM")
  private BigDecimal identificativoSIM = null;

  public ReportTrafficoBean numLinea(String numLinea) {
    this.numLinea = numLinea;
    return this;
  }

  /**
   * Numero utente TIM oggetto di tariffazione.
   * @return numLinea
  **/
  @ApiModelProperty(required = true, value = "Numero utente TIM oggetto di tariffazione.")
  @NotNull

@Size(min=1) 
  public String getNumLinea() {
    return numLinea;
  }

  public void setNumLinea(String numLinea) {
    this.numLinea = numLinea;
  }

  public ReportTrafficoBean macroFamiglia(String macroFamiglia) {
    this.macroFamiglia = macroFamiglia;
    return this;
  }

  /**
   * Tipo di traffico. I valori possibili sono VOCE, DATI, SMS-MMS
   * @return macroFamiglia
  **/
  @ApiModelProperty(required = true, value = "Tipo di traffico. I valori possibili sono VOCE, DATI, SMS-MMS")
  @NotNull

@Size(min=1) 
  public String getMacroFamiglia() {
    return macroFamiglia;
  }

  public void setMacroFamiglia(String macroFamiglia) {
    this.macroFamiglia = macroFamiglia;
  }

  public ReportTrafficoBean tipoChiamata(String tipoChiamata) {
    this.tipoChiamata = tipoChiamata;
    return this;
  }

  /**
   * Definisce la tipologia di traffico esportato verso i client afferenti.
   * @return tipoChiamata
  **/
  @ApiModelProperty(required = true, value = "Definisce la tipologia di traffico esportato verso i client afferenti.")
  @NotNull

@Size(min=1) 
  public String getTipoChiamata() {
    return tipoChiamata;
  }

  public void setTipoChiamata(String tipoChiamata) {
    this.tipoChiamata = tipoChiamata;
  }

  public ReportTrafficoBean dataChiamata(OffsetDateTime dataChiamata) {
    this.dataChiamata = dataChiamata;
    return this;
  }

  /**
   * Data e ora in cui è stata effettuata la chiamata
   * @return dataChiamata
  **/
  @ApiModelProperty(required = true, value = "Data e ora in cui è stata effettuata la chiamata")
  @NotNull

  @Valid

  public OffsetDateTime getDataChiamata() {
    return dataChiamata;
  }

  public void setDataChiamata(OffsetDateTime dataChiamata) {
    this.dataChiamata = dataChiamata;
  }

  public ReportTrafficoBean codiceOfferta(String codiceOfferta) {
    this.codiceOfferta = codiceOfferta;
    return this;
  }

  /**
   * Codice offerta. Obbligatorio solo quando macroFamiglia = DATI
   * @return codiceOfferta
  **/
  @ApiModelProperty(value = "Codice offerta. Obbligatorio solo quando macroFamiglia = DATI")


  public String getCodiceOfferta() {
    return codiceOfferta;
  }

  public void setCodiceOfferta(String codiceOfferta) {
    this.codiceOfferta = codiceOfferta;
  }

  public ReportTrafficoBean apn(String apn) {
    this.apn = apn;
    return this;
  }

  /**
   * Rappresenta il nome logico del punto di accesso connesso alla rete dati a pacchetto esterna. Obbligatorio solo quando macroFamiglia = DATI
   * @return apn
  **/
  @ApiModelProperty(value = "Rappresenta il nome logico del punto di accesso connesso alla rete dati a pacchetto esterna. Obbligatorio solo quando macroFamiglia = DATI")


  public String getApn() {
    return apn;
  }

  public void setApn(String apn) {
    this.apn = apn;
  }

  public ReportTrafficoBean durataChiamata(Integer durataChiamata) {
    this.durataChiamata = durataChiamata;
    return this;
  }

  /**
   * Durata della chiamata. Obbligatorio solo quando macroFamiglia = VOCE
   * @return durataChiamata
  **/
  @ApiModelProperty(value = "Durata della chiamata. Obbligatorio solo quando macroFamiglia = VOCE")


  public Integer getDurataChiamata() {
    return durataChiamata;
  }

  public void setDurataChiamata(Integer durataChiamata) {
    this.durataChiamata = durataChiamata;
  }

  public ReportTrafficoBean numChiamato(String numChiamato) {
    this.numChiamato = numChiamato;
    return this;
  }

  /**
   * Numero chiamato mascherato  
   * @return numChiamato
  **/
  @ApiModelProperty(value = "Numero chiamato mascherato  ")


  public String getNumChiamato() {
    return numChiamato;
  }

  public void setNumChiamato(String numChiamato) {
    this.numChiamato = numChiamato;
  }

  public ReportTrafficoBean dataFatturazione(OffsetDateTime dataFatturazione) {
    this.dataFatturazione = dataFatturazione;
    return this;
  }

  /**
   * Data e ora in cui è stata fatturata la chiamata
   * @return dataFatturazione
  **/
  @ApiModelProperty(value = "Data e ora in cui è stata fatturata la chiamata")

  @Valid

  public OffsetDateTime getDataFatturazione() {
    return dataFatturazione;
  }

  public void setDataFatturazione(OffsetDateTime dataFatturazione) {
    this.dataFatturazione = dataFatturazione;
  }

  public ReportTrafficoBean centrale(String centrale) {
    this.centrale = centrale;
    return this;
  }

  /**
   * Centrale di emissione della chiamata
   * @return centrale
  **/
  @ApiModelProperty(value = "Centrale di emissione della chiamata")


  public String getCentrale() {
    return centrale;
  }

  public void setCentrale(String centrale) {
    this.centrale = centrale;
  }

  public ReportTrafficoBean costo(BigDecimal costo) {
    this.costo = costo;
    return this;
  }

  /**
   * Importo relativo al costo della chiamata
   * @return costo
  **/
  @ApiModelProperty(value = "Importo relativo al costo della chiamata")

  @Valid

  public BigDecimal getCosto() {
    return costo;
  }

  public void setCosto(BigDecimal costo) {
    this.costo = costo;
  }

  public ReportTrafficoBean profiloTariffario(String profiloTariffario) {
    this.profiloTariffario = profiloTariffario;
    return this;
  }

  /**
   * Codice del profilo Tariffario
   * @return profiloTariffario
  **/
  @ApiModelProperty(value = "Codice del profilo Tariffario")


  public String getProfiloTariffario() {
    return profiloTariffario;
  }

  public void setProfiloTariffario(String profiloTariffario) {
    this.profiloTariffario = profiloTariffario;
  }

  public ReportTrafficoBean tipoCartaServizi2(String tipoCartaServizi2) {
    this.tipoCartaServizi2 = tipoCartaServizi2;
    return this;
  }

  /**
   * Campo utilizzato per rappresentare sui singoli bit alcune informazioni presenti nel campo di input Campo Descrittivo.
   * @return tipoCartaServizi2
  **/
  @ApiModelProperty(value = "Campo utilizzato per rappresentare sui singoli bit alcune informazioni presenti nel campo di input Campo Descrittivo.")


  public String getTipoCartaServizi2() {
    return tipoCartaServizi2;
  }

  public void setTipoCartaServizi2(String tipoCartaServizi2) {
    this.tipoCartaServizi2 = tipoCartaServizi2;
  }

  public ReportTrafficoBean tipoComunicazione(String tipoComunicazione) {
    this.tipoComunicazione = tipoComunicazione;
    return this;
  }

  /**
   * Identifica il tipo comunicazione
   * @return tipoComunicazione
  **/
  @ApiModelProperty(value = "Identifica il tipo comunicazione")


  public String getTipoComunicazione() {
    return tipoComunicazione;
  }

  public void setTipoComunicazione(String tipoComunicazione) {
    this.tipoComunicazione = tipoComunicazione;
  }

  public ReportTrafficoBean volumeDati(String volumeDati) {
    this.volumeDati = volumeDati;
    return this;
  }

  /**
   * Rappresenta il volume dei dati. Valorizzato se il campo macroFamilgia=DATI e se il campo  tipoChiamata assume il valore che identifica gli MMS
   * @return volumeDati
  **/
  @ApiModelProperty(value = "Rappresenta il volume dei dati. Valorizzato se il campo macroFamilgia=DATI e se il campo  tipoChiamata assume il valore che identifica gli MMS")


  public String getVolumeDati() {
    return volumeDati;
  }

  public void setVolumeDati(String volumeDati) {
    this.volumeDati = volumeDati;
  }

  public ReportTrafficoBean classeServizio(String classeServizio) {
    this.classeServizio = classeServizio;
    return this;
  }

  /**
   * Identifica la Classe del Servizio
   * @return classeServizio
  **/
  @ApiModelProperty(value = "Identifica la Classe del Servizio")


  public String getClasseServizio() {
    return classeServizio;
  }

  public void setClasseServizio(String classeServizio) {
    this.classeServizio = classeServizio;
  }

  public ReportTrafficoBean prodId(String prodId) {
    this.prodId = prodId;
    return this;
  }

  /**
   * Codice offerta DBSS
   * @return prodId
  **/
  @ApiModelProperty(value = "Codice offerta DBSS")


  public String getProdId() {
    return prodId;
  }

  public void setProdId(String prodId) {
    this.prodId = prodId;
  }

  public ReportTrafficoBean identificativoSIM(BigDecimal identificativoSIM) {
    this.identificativoSIM = identificativoSIM;
    return this;
  }

  /**
   * Identifica ls direttrice di chiamata della carta SIM relativa all’utente chiamato (TIM o NON TIM).
   * @return identificativoSIM
  **/
  @ApiModelProperty(value = "Identifica ls direttrice di chiamata della carta SIM relativa all’utente chiamato (TIM o NON TIM).")

  @Valid

  public BigDecimal getIdentificativoSIM() {
    return identificativoSIM;
  }

  public void setIdentificativoSIM(BigDecimal identificativoSIM) {
    this.identificativoSIM = identificativoSIM;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportTrafficoBean reportTrafficoBean = (ReportTrafficoBean) o;
    return Objects.equals(this.numLinea, reportTrafficoBean.numLinea) &&
        Objects.equals(this.macroFamiglia, reportTrafficoBean.macroFamiglia) &&
        Objects.equals(this.tipoChiamata, reportTrafficoBean.tipoChiamata) &&
        Objects.equals(this.dataChiamata, reportTrafficoBean.dataChiamata) &&
        Objects.equals(this.codiceOfferta, reportTrafficoBean.codiceOfferta) &&
        Objects.equals(this.apn, reportTrafficoBean.apn) &&
        Objects.equals(this.durataChiamata, reportTrafficoBean.durataChiamata) &&
        Objects.equals(this.numChiamato, reportTrafficoBean.numChiamato) &&
        Objects.equals(this.dataFatturazione, reportTrafficoBean.dataFatturazione) &&
        Objects.equals(this.centrale, reportTrafficoBean.centrale) &&
        Objects.equals(this.costo, reportTrafficoBean.costo) &&
        Objects.equals(this.profiloTariffario, reportTrafficoBean.profiloTariffario) &&
        Objects.equals(this.tipoCartaServizi2, reportTrafficoBean.tipoCartaServizi2) &&
        Objects.equals(this.tipoComunicazione, reportTrafficoBean.tipoComunicazione) &&
        Objects.equals(this.volumeDati, reportTrafficoBean.volumeDati) &&
        Objects.equals(this.classeServizio, reportTrafficoBean.classeServizio) &&
        Objects.equals(this.prodId, reportTrafficoBean.prodId) &&
        Objects.equals(this.identificativoSIM, reportTrafficoBean.identificativoSIM);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numLinea, macroFamiglia, tipoChiamata, dataChiamata, codiceOfferta, apn, durataChiamata, numChiamato, dataFatturazione, centrale, costo, profiloTariffario, tipoCartaServizi2, tipoComunicazione, volumeDati, classeServizio, prodId, identificativoSIM);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportTrafficoBean {\n");
    
    sb.append("    numLinea: ").append(toIndentedString(numLinea)).append("\n");
    sb.append("    macroFamiglia: ").append(toIndentedString(macroFamiglia)).append("\n");
    sb.append("    tipoChiamata: ").append(toIndentedString(tipoChiamata)).append("\n");
    sb.append("    dataChiamata: ").append(toIndentedString(dataChiamata)).append("\n");
    sb.append("    codiceOfferta: ").append(toIndentedString(codiceOfferta)).append("\n");
    sb.append("    apn: ").append(toIndentedString(apn)).append("\n");
    sb.append("    durataChiamata: ").append(toIndentedString(durataChiamata)).append("\n");
    sb.append("    numChiamato: ").append(toIndentedString(numChiamato)).append("\n");
    sb.append("    dataFatturazione: ").append(toIndentedString(dataFatturazione)).append("\n");
    sb.append("    centrale: ").append(toIndentedString(centrale)).append("\n");
    sb.append("    costo: ").append(toIndentedString(costo)).append("\n");
    sb.append("    profiloTariffario: ").append(toIndentedString(profiloTariffario)).append("\n");
    sb.append("    tipoCartaServizi2: ").append(toIndentedString(tipoCartaServizi2)).append("\n");
    sb.append("    tipoComunicazione: ").append(toIndentedString(tipoComunicazione)).append("\n");
    sb.append("    volumeDati: ").append(toIndentedString(volumeDati)).append("\n");
    sb.append("    classeServizio: ").append(toIndentedString(classeServizio)).append("\n");
    sb.append("    prodId: ").append(toIndentedString(prodId)).append("\n");
    sb.append("    identificativoSIM: ").append(toIndentedString(identificativoSIM)).append("\n");
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

