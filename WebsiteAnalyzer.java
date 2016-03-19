package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebsiteAnalyzer {

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
	private Map<String, Integer> map = new HashMap<String, Integer>();

	/**
	 * API for Report Page Access URL
	 * 
	 * @param pageUrl,
	 *            The String
	 */
	public void reportPageAccess(String pageUrl) {
		// By Passing the pageURL, report for access
		// I can do a mock of this as well.
		// Lets assume I am adding the URL's into this method,
		// and keep incrementing the count in hashmap, based on added URL's
		if (map.containsKey(pageUrl)) {
			int cnt = map.get(pageUrl);
			map.put(pageUrl, ++cnt);
		} else {
			map.put(pageUrl, 1);
		}

	}

	/**
	 * API to get top N pages
	 * 
	 * @param n
	 *            - number of hit counts
	 * @return String
	 */
	public List<String> getTopNPages(int n) {
		List<String> topNPages = new ArrayList<>();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (n == entry.getValue()) {
				topNPages.add(entry.getKey());
			}
		}
		return topNPages;
	}
}
