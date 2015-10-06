package zone.cyclops.estoque.service;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

import zone.cyclops.estoque.domain.Item;
import zone.cyclops.estoque.domain.ItemRespose;

@Service
public class SqsWorker {
	
	@Value("${estoque.worker")
	private String worker;
	
	
	@MessageMapping("${estoque.sqs.get.req}")
	@SendTo("${estoque.sqs.get.res}")
	public ItemRespose queueListener(Item item, @Headers Map<String, Object> headers) {
		System.out.println(headers);
	
		System.out.println(item);
		
		//Fiz a busca
		
		
		// Dados para retorno na fila de response
		ItemRespose itemRespose = new ItemRespose();
		itemRespose.setRequest(headers);
		itemRespose.setWorker(worker);
		itemRespose.setData(new ArrayList<>());
		return itemRespose;
	}

}
