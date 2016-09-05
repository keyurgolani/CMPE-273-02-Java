package assignment1.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class MaliciousDataCollection {
	
	private Set<Vector<Double>> trainingData = new HashSet<Vector<Double>>();
	
	public Set<Vector<Double>> getTrainingData() {
		return trainingData;
	}

	public void setTrainingData(Set<Vector<Double>> trainingData) {
		this.trainingData = trainingData;
	}

	public boolean addData(Vector<Double> dataRecord) {
		boolean dataAdded = false;
		if(!this.exists(dataRecord)) {
			trainingData.add(dataRecord);
			dataAdded = true;
		}
		return dataAdded;
	}
	
	public boolean exists(Vector<Double> dataRecord) {
		return trainingData.contains(dataRecord);
	}
	
	public boolean duplicateExists() {
		boolean duplicateExists = false;
		Object[] trainingDataArray = trainingData.toArray();
		for (int i = 0; i < trainingDataArray.length - 1; i++) {
			for (int j = i + 1; j < trainingDataArray.length; j++) {
				if(trainingDataArray[i].equals(trainingDataArray[j])) {
					duplicateExists = true;
					break;
				}
			}
		}
		return duplicateExists;
	}
	
	public static void main(String[] args) {
		/*
		 * Topic: Collections in Java
		 * Problem: When we collect some data set for any data analytics task - for an example 
		 * 		Malicious Data Detection using machine learning - we need to ensure that there is no
		 * 		redundant data being processed that is giving overhead to the machine learning algorithm
		 * 		in processing power and execution time.
		 * Solution: Here we can use Set class or any of it's implementation to ensure the unique data
		 * 		inside the data set. I have used HashSet which ensures the uniqueness of the data added
		 * 		even if duplicate data is entered.
		 */
		MaliciousDataCollection maliciousDataCollection = new MaliciousDataCollection();
		int totalIterations = 20;
		for(int i = 0; i < totalIterations; i++) {
			Vector<Double> dataRecord = new Vector<Double>();
			for(int j = 0; j < 5; j++) {
				dataRecord.add(Math.random() * 50);
			}
			maliciousDataCollection.addData(dataRecord);
			maliciousDataCollection.addData(dataRecord);
		}
		for (Iterator iterator = maliciousDataCollection.trainingData.iterator(); iterator.hasNext();) {
			Vector<Double> dataRecord = (Vector<Double>) iterator.next();
			System.out.println(dataRecord);
			
		}
	}

}
