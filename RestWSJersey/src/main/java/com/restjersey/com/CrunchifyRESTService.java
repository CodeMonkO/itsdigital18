package main.java.com.restjersey.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

@Path("/")
public class CrunchifyRESTService {
	@POST
	@Path("/crunchifyService")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response crunchifyREST(InputStream incomingData) {
		StringBuilder crunchifyBuilder = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(
					incomingData));
			String line = null;
			while ((line = in.readLine()) != null) {
				crunchifyBuilder.append(line);
			}
		} catch (Exception e) {
			System.out.println("Error Parsing: - ");
		}
		System.out.println("Data Received: "
				+ javaToJson(crunchifyBuilder).getTutorials().getDescription());

		// return HTTP response 200 in case of success
		return Response.status(200).entity(crunchifyBuilder.toString()).build();
	}

	public JsonToPojo javaToJson(StringBuilder jsonString) {
		JsonToPojo jsonToPojo = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			jsonToPojo = mapper.readValue(jsonString.toString(),
					JsonToPojo.class);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonToPojo;
	}
	
	
	
	

	@POST
	@Path("/service")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response crunchifyRESTTest(InputStream incomingData) {
		StringBuilder crunchifyBuilder = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(
					incomingData));
			String line = null;
			while ((line = in.readLine()) != null) {
				crunchifyBuilder.append(line);
			}
		} catch (Exception e) {
			System.out.println("Error Parsing: - ");
		}
		System.out.println("Data Received: "
				+ javaToJson(crunchifyBuilder).getTutorials().getDescription());

		// return HTTP response 200 in case of success
		return Response.status(200).entity(crunchifyBuilder.toString()).build();
	}

	public JsonToPojo javaToJsonTest(StringBuilder jsonString) {
		JsonToPojo jsonToPojo = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			jsonToPojo = mapper.readValue(jsonString.toString(),
					JsonToPojo.class);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonToPojo;
	}

}
