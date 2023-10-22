package app.controller;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/testing")
public class TestServiceController {

	@GetMapping("/token")
	public ResponseEntity<RespuestaToken> test() {
		RestTemplate restTemplate = new RestTemplate();
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
	    headers.add(
	        "Authorization",
	        "Basic MXRjbW03MzQyajY2NjFvNDRnZ2JvNGoxNnA6MTlnYW1hOXJxaXRodHE4OWZkN3NoYzl2Y2xtdXVtbWFoYmJnOTc1ZjJpNzB0dDFrc21saA==");
	    headers.add("Content-Type", "application/x-www-form-urlencoded");

	    MultiValueMap<String, String> bodyParamMap = new LinkedMultiValueMap<>();
	    bodyParamMap.add("grant_type", "client_credentials");

	    HttpEntity entity = new HttpEntity<>(bodyParamMap, headers);
 
	    ResponseEntity<RespuestaToken> respuesta =
	        restTemplate.postForEntity(
	            "https://ciencuadras-prod-api-auth.auth.us-east-1.amazoncognito.com/oauth2/token",
	            entity,
	            RespuestaToken.class); 
	    System.out.println("Respuesta: "+respuesta); 
	    return respuesta;
	}
	
	
}
