package mcs.service.rest.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/test")
public class TestService {
		
	//Loading records from sample data list
	Object[] loadCarDataFile() throws IOException, URISyntaxException{
		URL url = new URL("https://bitbucket.org/d7038378/automotive-model-year-data/raw/937bad1cb95d53243d448e340f7dcf07f1220f5e/testData.txt");//sample data from https://github.com/n8barr/automotive-model-year-data
		Object[] array = null;
		
		try (InputStream is = url.openStream();
			     BufferedReader reader = new BufferedReader(new InputStreamReader(is,"UTF-8"));
			     Stream<String> stream = reader.lines()) {
				array = stream.toArray();
			}
		
		return array;
	}
	
	//Packing object for GET
	@GET
	@Path("/getCarData")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cars> renderCarData(){
		Object[] carData;
		List<Cars> listOfCars = new ArrayList<Cars>();
		try {
			carData = loadCarDataFile();
			for (Object carRecord : carData){
				String[] reader = carRecord.toString().split(",");
				listOfCars.add(new Cars(reader[0].trim(),reader[1].trim(),reader[2].trim()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return listOfCars;
	}
	
}
