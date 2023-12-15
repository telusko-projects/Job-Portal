package com.telusko.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Repository;

import com.telusko.model.JobPost;

@Repository
public class SearchJobPostRepoImpl implements SearchJobPostRepo {
	
//	@Autowired
//	private MongoClient mongoClient;
//	
//	
//	//converter to convert mongo doc into java obj
//	@Autowired
//	MongoConverter mongoConverter;

	@Override
	public List<JobPost> searchJobPostsByText(String query) {
		
		//creating a list named posts

		final List<JobPost> posts=new ArrayList<>();
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		
//		//getting collection and database 
//		MongoDatabase database = mongoClient.getDatabase("jobpostdb");
//		MongoCollection<org.bson.Document> collection = database.getCollection("jobpost");
//		
//		
//		//search query
//		AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search", 
//		  	//i have to use wild card here instead of text
//				new Document("index", "default")
//		            .append("text", 
//		    new Document("query", query)
//		                .append("path", Arrays.asList("postProfile", "postDesc", "postTechStack")))), 
//		    new Document("$sort", 
//		    new Document("reqExperience", 1L)), 
//		    new Document("$limit", 3L)));
//		
//		//result is iterable 
//		//doc is a document format so we have to convert it into java object to add in posts
//		//read method of converter takes two argument.1st is the class into which u
//		//want to convert and 2nd is the document name which needs to be converted
//		result.forEach(doc->posts.add(mongoConverter.read(JobPost.class, doc)));
//		
		return posts;
	}

}
