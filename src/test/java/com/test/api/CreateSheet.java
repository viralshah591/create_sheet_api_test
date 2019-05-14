package com.test.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.frame.api.APIBase;
import com.frame.api.APIContext;
import com.frame.api.APIResponseBuilder;
import com.frame.api.URI;
import com.jayway.restassured.path.json.JsonPath;

public class CreateSheet extends APIBase {

	@Test
	public void createSheetInSheetsFolder() {
		createSheet(URI.CREATE_SHEET_IN_SHEETS_FLODER);
	}

	private void createSheet(String url) {
		APIContext apiContext = new APIContext();
		Map<String, Object> requestBody = new HashMap<String, Object>();
		List<Columns> cloumns = new ArrayList<Columns>();

		// first set of column values
		Columns columnValues = new Columns();
		columnValues.setTitle("Primary Column");
		columnValues.setPrimary("true");
		columnValues.setType("TEXT_NUMBER");

		// second set of column values
		Columns columnValues1 = new Columns();
		columnValues1.setTitle("Favorite");
		columnValues1.setPrimary("false");
		columnValues1.setType("CHECKBOX");
		columnValues1.setSymbol("STAR");

		// Adding column values to column parameter
		cloumns.add(columnValues);
		cloumns.add(columnValues1);

		// Original request body
		requestBody.put("name", "newssheet");
		requestBody.put("columns", cloumns);

		// Request execution
		String jsonResponse = APIResponseBuilder.createSheet(apiContext, requestBody, url);
		System.out.println("jsonResponse-------" + jsonResponse);

		String statusCode = JsonPath.with(jsonResponse).get("message");
		Assert.assertEquals(statusCode, "SUCCESS");
	}
}