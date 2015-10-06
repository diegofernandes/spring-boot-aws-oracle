package zone.cyclops.estoque.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.amazonaws.services.sqs.AmazonSQS;

import zone.cyclops.estoque.domain.Item;

@Service
public class SqsSender {
	
	
	@Value("${estoque.sqs.get.req}")
	private String estoqueReq;
	
	private final QueueMessagingTemplate queueMessagingTemplate;

	@Autowired
	public SqsSender(AmazonSQS amazonSqs) {
		this.queueMessagingTemplate = new QueueMessagingTemplate(amazonSqs);
	}

	public void send(Item item) {
		this.queueMessagingTemplate.convertAndSend(estoqueReq, item);
	}
	
	
}
