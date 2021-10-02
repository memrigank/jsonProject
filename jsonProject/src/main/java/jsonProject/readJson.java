package jsonProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class readJson {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

//		creating a json parser Object
		JSONParser jsonP = new JSONParser();
		
//		passing the data using json parser object or parsing the content of the json file
		JSONObject jsonOb = (JSONObject) jsonP.parse(new FileReader("jsonFile\\employee.json"));
		
		String id = jsonOb.get("employeeId").toString();
		String fName = jsonOb.get("firstName").toString();
		String lName = jsonOb.get("lastName").toString();
		String country = jsonOb.get("country").toString();
		String age = (String) jsonOb.get("age");
		
		System.out.println(fName+ " "+ lName + " has the employee id of :"+id+" he is from "+ country +" of age "+ age);

	}

}
