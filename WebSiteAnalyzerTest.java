package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebSiteAnalyzerTest {

	public static void main(String[] args) {

		// Below is Mock Implementation
		WebsiteAnalyzer websiteAnalyzer = new WebsiteAnalyzer();
		// For now I am using 5
		List<String> myWebsites = getTopNPagesMockMethod(5);
		for (String webSite : myWebsites) {
			System.out.println("Mocked - Website with COunt--------" + 5 + "-------" + webSite);
		}

		websiteAnalyzer.reportPageAccess("www.xyz.com");
		websiteAnalyzer.reportPageAccess("www.xyz.com");
		websiteAnalyzer.reportPageAccess("www.abc.com");
		websiteAnalyzer.reportPageAccess("www.abc.com");
		websiteAnalyzer.reportPageAccess("www.abc.com");
		// For now I am using 5
		List<String> websites = websiteAnalyzer.getTopNPages(3);
		for (String webSite : websites) {
			System.out.println("Real - Website with COunt--------" + 3 + "-------" + webSite);
		}

		// for 2
		List<String> websites2 = websiteAnalyzer.getTopNPages(2);
		for (String webSite : websites2) {
			System.out.println("Real - Website with COunt--------" + 2 + "-------" + webSite);
		}

	}

	// the size of the list returned must be n// Mocked implementation
	/**
	 * Mock Implementation
	 * @param n
	 * @return String value
	 */
	public static List<String> getTopNPagesMockMethod(int n) {
		// Top N pages.
		// Web-site has been visited N number of times. web-site has N number of
		// URL's
		// whenever a URL is hit, its put in a Map as key/value pair, URL and
		// Hit Counts as Integer
		// Simplest Way(HashMap):
		// Declaring a Map of type String, Integer - "URL" and Count
		// Then use Map.Entry Interface to the job of retrieving website with
		// highest Counts since it provides utility
		// methods
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		List<String> topNPages = new ArrayList<>();
		myMap.put("www.xyz.com", 5);
		myMap.put("www.abc.com", 4);
		myMap.put("www.def.com", 3);
		myMap.put("www.hij.com", 5);
		myMap.put("www.klm.com", 3);
		for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
			if (n == entry.getValue()) {
				topNPages.add(entry.getKey());
			}
		}
		return topNPages;
	}
}
