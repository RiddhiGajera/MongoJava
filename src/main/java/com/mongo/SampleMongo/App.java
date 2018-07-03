package com.mongo.SampleMongo;

import java.util.Arrays;

import org.bson.Document;

import com.mongo.mongodbconnection.MongoDbConnection;
import com.mongodb.DBCursor;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

/**
 * Hello world!
 *
 */
public class App 
{
     

	public static void main( String[] args )
    {
		MongoDatabase db = MongoDbConnection.getMongoDbConnection("TestDb");
		MongoCollection<Document> collection = db.getCollection("user");
		
		/*Document doc = new Document("name", "MongoDB")
                .append("type", "database")
                .append("count", 1)
                .append("versions", Arrays.asList("v3.2", "v3.0", "v2.6"))
                .append("info", new Document("x", 203).append("y", 102));
		
		collection.insertOne(doc);*/
		
		// Find All entry in table
		/*MongoCursor<Document> dbCursor = collection.find().iterator();
		while (dbCursor.hasNext()) {
			System.out.println(dbCursor.next().toJson());
		}*/
		
		//Find specific entry in table
		/*Document findDoc = new Document("name","mkyong")
							.append("age", 30);
		MongoCursor<Document> dbCursor = collection.find(findDoc).iterator();
		while (dbCursor.hasNext()) {
			System.out.println(dbCursor.next().toJson());
		}*/
		
		//Insert record
		//collection.insertOne(new Document("name","Test").append("age", 20).append("username", "testtest"));
		
		//Update record 
		/*collection.updateOne( new Document("age", 30), new Document("$set", new Document("age", 110)));
		
		MongoCursor<Document> dbCursor = collection.find(new Document("age", 110)).iterator();
		while (dbCursor.hasNext()) {
		System.out.println(dbCursor.next().toJson());
		}*/
		
		// Delete record
		//collection.deleteOne(new Document("name","MongoDB"));
		//collection.deleteMany(new Document("name","MongoDB"));
		
		
		
		MongoCursor<Document> dbCursor = collection.find().iterator();
		while (dbCursor.hasNext()) {
			System.out.println(dbCursor.next().toJson());
		}
		
		
    }
}
