package it.eng.npat.traffico.api;

import java.math.BigDecimal;

import it.eng.npat.traffico.model.ErrorMessage;

import java.time.LocalDate;

import it.eng.npat.traffico.model.ReportTrafficoBean;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientiApiControllerIntegrationTest {

    @Autowired
    private ClientiApi api;

    @Test
    public void clientiConsistenzeNumLineaDettaglioTrafficoGetTest() throws Exception {
        String numLinea = "numLinea_example";
        String macroFamiglia = "macroFamiglia_example";
        LocalDate dataInizio = new LocalDate(0, 0, 0);
        LocalDate dataFine = new LocalDate(0, 0, 0);
        String costo = "costo_example";
        String sourceSystem = "sourceSystem_example";
        String channel = "channel_example";
        LocalDate interactionDateDate = new LocalDate();
        String interactionDateTime = "interactionDateTime_example";
        String sessionID = "sessionID_example";
        String businessID = "businessID_example";
        String transactionID = "transactionID_example";
        List<String> tipoChiamata = Arrays.asList("tipoChiamata_example");
        List<String> fields = Arrays.asList("fields_example");
        BigDecimal pageNumber = new BigDecimal(0);
        BigDecimal pageSize = new BigDecimal(0);
        String orderField = "orderField_example";
        String order = "order_example";
        String messageID = "messageID_example";
        String apIGWRequestID = "apIGWRequestID_example";
        String resubmitted = "resubmitted_example";
        ResponseEntity<List<ReportTrafficoBean>> responseEntity = api.clientiConsistenzeNumLineaDettaglioTrafficoGet(numLinea, macroFamiglia, dataInizio, dataFine, costo, sourceSystem, channel, interactionDateDate, interactionDateTime, sessionID, businessID, transactionID, tipoChiamata, fields, pageNumber, pageSize, orderField, order, messageID, apIGWRequestID, resubmitted);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
