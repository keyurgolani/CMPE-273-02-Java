package assignment1.collections;

import java.util.HashSet;
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

}
