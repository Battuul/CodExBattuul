package com.example.breeds;

import com.example.breeds.model.Breed;
import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

@SpringBootApplication
@RestController
public class BreedsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BreedsApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	//myData is provided JSON in problem 1.
	@PostMapping("/create")
	public String create(@RequestBody Map<String, String[]> myData) {
		String result = "";

		TreeMap<String, String[]> sorted = new TreeMap<>();
		sorted.putAll(myData);
		for (Map.Entry<String, String[]> entry : sorted.entrySet()) {
			result += "\"" + entry.getKey() + "\"" + ":";
			result += Arrays.toString(myData.get(entry.getKey())) + ", ";

//			int size = myData.get(entry.getKey()).length;
//			for (int i = 0; i < size - 1; i++) {
//				for (int j = i + 1; j < size; j++) {
//					if (myData.get(entry.getKey())[i].compareTo(myData.get(entry.getKey())[j]) > 0) {
//						String temp = myData.get(entry.getKey())[i];
//						myData.get(entry.getKey())[i] = myData.get(entry.getKey())[j];
//						myData.get(entry.getKey())[j] = temp;
//					}
//				}
//
//				result += Arrays.toString(myData.get(entry.getKey()));
//				result += "\n";
//			for(String s:myData.get(entry.getKey())) {
//				result += s + ", ";
//			}
//			}

//			}

		}
		return result;
	}
}
