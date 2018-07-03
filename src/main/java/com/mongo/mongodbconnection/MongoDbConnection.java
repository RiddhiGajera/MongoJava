package com.mongo.mongodbconnection;


import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoDbConnection {
	
	
	

	public static MongoDatabase getMongoDbConnection(String dbName) {
		MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
		MongoDatabase mongoDatabase = mongoClient.getDatabase(dbName);
		return mongoDatabase;
	}
	
	
	
	

}
