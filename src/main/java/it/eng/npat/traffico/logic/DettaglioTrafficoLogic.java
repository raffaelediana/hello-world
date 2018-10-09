package it.eng.npat.traffico.logic;


import it.eng.npat.traffico.model.ReportTrafficoBean;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;



public class DettaglioTrafficoLogic {
/*	
	@ApiParam(value = "numero di linea del cliente",required=true) @PathVariable("numLinea") String numLinea,
	@NotNull @ApiParam(value = "Identifica la macro tipologia di traffico che si vuole visualizzare.", required = true) @Valid @RequestParam(value = "macroFamiglia", required = true) String macroFamiglia,
	@NotNull @ApiParam(value = "periodo inizio di riferimento richiesto", required = true) @Valid @RequestParam(value = "dataInizio", required = true) @DateTimeFormat(iso = ISO.DATE) LocalDate dataInizio,
	@NotNull @ApiParam(value = "periodo fine di riferimento richiesto", required = true) @Valid @RequestParam(value = "dataFine", required = true) @DateTimeFormat(iso = ISO.DATE) LocalDate dataFine,
	@NotNull @ApiParam(value = "Permette di recuperare il traffico a costo", required = true) @Valid @RequestParam(value = "costo", required = true) String costo,
*/
	
	public List<ReportTrafficoBean> getTraffico(String numLinea,String macroFamiglia,LocalDate dataInizio,LocalDate dataFine,String costo){
		
		ReportTrafficoBean rtb1=new ReportTrafficoBean();
		rtb1.setMacroFamiglia("MF1");
		
		
		 OffsetDateTime dataChiamata=OffsetDateTime.of(dataInizio,LocalTime.now(),ZoneOffset.UTC);
		
		rtb1.setDataChiamata(dataChiamata);
		
		ReportTrafficoBean rtb2=new ReportTrafficoBean();
		rtb2.setMacroFamiglia("MF2");
		
		ArrayList<ReportTrafficoBean> al=new ArrayList<ReportTrafficoBean>();
		al.add(rtb1);
		al.add(rtb2);
		
		
		
		
		return (List<ReportTrafficoBean>) al;
		
		
		
	}
	
	

}
