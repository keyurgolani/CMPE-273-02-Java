package assignment1.collections;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

public class MaliciousDataCollectionTest {

	@Test
	public void addOneRecord() {
		MaliciousDataCollection maliciousDataCollection = new MaliciousDataCollection();
		Vector<Double> dataRecord1 = new Vector<Double>();
		dataRecord1.add(5.0); dataRecord1.add(3.2); dataRecord1.add(8.0); dataRecord1.add(10.0); dataRecord1.add(5.5);
		assertTrue(maliciousDataCollection.addData(dataRecord1) && !maliciousDataCollection.duplicateExists());
	}
	
	@Test
	public void addMultipleRecords() {
		MaliciousDataCollection maliciousDataCollection = new MaliciousDataCollection();
		Vector<Double> dataRecord1 = new Vector<Double>();
		dataRecord1.add(5.0); dataRecord1.add(3.2); dataRecord1.add(8.0); dataRecord1.add(10.0); dataRecord1.add(5.5);
		Vector<Double> dataRecord2 = new Vector<Double>();
		dataRecord2.add(4.3); dataRecord2.add(5.2); dataRecord2.add(7.7); dataRecord2.add(1.2); dataRecord2.add(9.3);
		Vector<Double> dataRecord3 = new Vector<Double>();
		dataRecord3.add(12.1); dataRecord3.add(9.9); dataRecord3.add(9.4); dataRecord3.add(3.3); dataRecord3.add(3.2);
		assertTrue((maliciousDataCollection.addData(dataRecord1)) && (maliciousDataCollection.addData(dataRecord2)) && (maliciousDataCollection.addData(dataRecord3)) && !maliciousDataCollection.duplicateExists());
	}
	
	@Test
	public void addDuplicateRecords() {
		MaliciousDataCollection maliciousDataCollection = new MaliciousDataCollection();
		Vector<Double> dataRecord1 = new Vector<Double>();
		dataRecord1.add(5.0); dataRecord1.add(3.2); dataRecord1.add(8.0); dataRecord1.add(10.0); dataRecord1.add(5.5);
		Vector<Double> dataRecord2 = new Vector<Double>();
		dataRecord2.add(5.0); dataRecord2.add(3.2); dataRecord2.add(8.0); dataRecord2.add(10.0); dataRecord2.add(5.5);
		assertTrue((maliciousDataCollection.addData(dataRecord1)) && (!maliciousDataCollection.addData(dataRecord2)) && !maliciousDataCollection.duplicateExists());
	}
	
	@Test
	public void addNoRecord() {
		MaliciousDataCollection maliciousDataCollection = new MaliciousDataCollection();
		maliciousDataCollection.duplicateExists();
	}
	
	@Test
	public void addLargeAmountOfRecords() {
		MaliciousDataCollection maliciousDataCollection = new MaliciousDataCollection();
		int totalIterations = 9999;
		for(int i = 0; i < totalIterations; i++) {
			Vector<Double> dataRecord = new Vector<Double>();
			for(int j = 0; j < 5; j++) {
				dataRecord.add(Math.random() * 50);
			}
			maliciousDataCollection.addData(dataRecord);
		}
		assertTrue((maliciousDataCollection.getTrainingData().size() <= totalIterations) && !maliciousDataCollection.duplicateExists());
	}

}
