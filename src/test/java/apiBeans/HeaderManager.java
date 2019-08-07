package apiBeans;

import java.util.Map;

public class HeaderManager {

	private static Map<String,String> headers;

	public static Map<String,String> getHeaders(){
		return headers;
	}
}
