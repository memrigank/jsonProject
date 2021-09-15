package jsonProject_New;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class readJsonFile {

	public static void main(String[] args) throws IOException, ParseException {

		JSONParser jsparser = new JSONParser();
		FileReader reader = new FileReader("./dataFiles/employee.json");
		Object obj = jsparser.parse(reader);
		JSONObject jsObject = (JSONObject)obj;
		JSONArray array= (JSONArray)jsObject.get("employee1");

		for(int i=0;i<array.size();i++) {
			JSONObject employee = (JSONObject) array.get(i);

			String name=(String) employee.get("name");
			String salary=(String) employee.get("salary");
			String isMarried=(String) employee.get("married");	



		}
	}

}
