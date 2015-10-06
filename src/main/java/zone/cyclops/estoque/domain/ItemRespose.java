package zone.cyclops.estoque.domain;

import java.util.List;
import java.util.Map;

public class ItemRespose {
	
	private String worker;
	
	public String getWorker() {
		return worker;
	}

	public void setWorker(String worker) {
		this.worker = worker;
	}

	private List<Item> data;
	
	private Map<String, Object> request;
	
	private Object error;

	public List<Item> getData() {
		return data;
	}

	public void setData(List<Item> data) {
		this.data = data;
	}

	public Map<String, Object> getRequest() {
		return request;
	}

	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	
	

	public Object getError() {
		return error;
	}

	public void setError(Object error) {
		this.error = error;
	}
	

}
