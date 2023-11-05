package app.house_finder.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ciencuadras.service.CienCuadrasPlatform;
import com.metrocuadrado.service.MetroCuadradoPlatform;

import api.house_finder.model.RealEstatePlatform;
import co.com.fincaraiz.service.FincaRaizPlatform;

@Configuration
public class RealEstatePlatformConfig {      

	@Bean
	public List<RealEstatePlatform> realEstatePlatform( 
			@Value("${plugins.fincaraiz.enabled}") boolean fincaraizEnabled,
			@Value("${plugins.metrocuadrado.enabled}") boolean metrocuadradoEnabled,
			@Value("${plugins.ciencuadras.enabled}") boolean ciencuadrasEnabled) {
		
		List<RealEstatePlatform> realEstatePlatformList = new ArrayList<>();
		realEstatePlatformList.add(
				new FincaRaizPlatform("Fincaraiz", "1.0", fincaraizEnabled));
		realEstatePlatformList.add( 
				new MetroCuadradoPlatform("Metrocuadrado", "1.0", metrocuadradoEnabled));
		realEstatePlatformList.add(
				new CienCuadrasPlatform("Ciencuadras", "1.0", ciencuadrasEnabled));
		return realEstatePlatformList;
	} 
	
}
