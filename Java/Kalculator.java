//Name: Poomrapee Wareeboutr
//ID: 6388113
//Section: 3

import java.util.ArrayList;

public class Kalculator {
	//******INSERT YOUR CODE HERE***********
	//Class attributes go here
	private ArrayList<Double> tempData = new ArrayList<>();
	private ArrayList<Double> dataList = new ArrayList<>();
	private ArrayList<Double> maxSet = new ArrayList<>();
	private ArrayList<Double> minSet = new ArrayList<>();
	//**************************************
	/**
	 * Constructor is the fist method to be call at instantiation of a Kalculator object.
	 * If you need to initialize your object, do so here. 
	 */
	Kalculator()
	{
		//******INSERT YOUR CODE HERE***********
		
		//**************************************
	}
	
	/**
	 * Add number to the list of numbers. 
	 * @param number
	 */
	public void addNumber(double number)
	{	//******INSERT YOUR CODE HERE***********
		dataList.add(number);
		tempData.add(number);
		for(int i = 0; i < dataList.size()-1; i++) {
			for(int j = 0; j < dataList.size()-i-1; j++) {
				if(dataList.get(j) > dataList.get(j+1)) {
					Double temp1 = dataList.get(j);
					Double temp2 = dataList.get(j+1);
					dataList.set(j, temp2);
					dataList.set(j+1, temp1);
				}
			}
		 }
		//**************************************
	}
	
	/**
	 * Remove the least recently added number from the list. If the list is empty, do nothing.
	 */
	public void deleteFirstNumber()
	{
		//******INSERT YOUR CODE HERE***********
		if(tempData.size() > 0) {
			tempData.remove(0);
		}
		//**************************************
	}
	
	/**
	 * Remove the most recently added number from the list. If the list is empty, do nothing.
	 */
	public void deleteLastNumber()
	{
		//******INSERT YOUR CODE HERE***********
		if(tempData.size() > 0) {
			tempData.remove(tempData.size() - 1);
		}
		//**************************************
	}
	
	/**
	 * Calculate the summation of all the numbers in the list, then returns the sum. 
	 * If the list is empty, return 0.
	 * @return
	 */
	public double getSum()
	{
		//******INSERT YOUR CODE HERE***********
		double sum = 0.0;
		if(dataList.size() > 0) {
			for(double i : dataList) {
				sum += i;
			}
			return sum;
		}
		return 0;
		//**************************************
	}
	
	/**
	 * Calculate and return the average of all the numbers in the list.
	 * If the list is empty, return 0.
	 * @return
	 */
	public double getAvg()
	{
		//******INSERT YOUR CODE HERE***********
		double avg = 0.0;
		if(dataList.size() > 0) {
			for(double i : dataList) {
				avg += i;
			}
			return avg/dataList.size();
		}
		return 0;
		//**************************************
	}
	
	/**
	 * Calculate and return the sample standard deviation of all the numbers in the list.
	 * If the list has fewer than 2 numbers, return 0.
	 * @return
	 */
	public double getStd()
	{
		//******INSERT YOUR CODE HERE***********
		double std;
		double avg = 0.0;
		double sumSigma = 0.0;
		if(dataList.size() > 1) {
			for(Double i : dataList) {
				avg += i;
			}
			avg /= dataList.size();

			for(Double i : dataList) {
				sumSigma += Math.pow(i - avg, 2);
			}
			std = Math.sqrt(sumSigma/(dataList.size()-1));

			return std;
		}
		return 0;
		//**************************************
	}
	
	/**
	 * Find and return the maximum of all the numbers in the list.
	 * If the list is empty, return 0.
	 * @return
	 */
	public double getMax()
	{
		//******INSERT YOUR CODE HERE***********
		if(dataList.size() > 0) {
			double max = dataList.get(0);
			for(Double i : dataList) {
				if(i > max) {
					max = i;
				}
			}
			return max;
		}
		return 0;
		//**************************************
	}
	
	/**
	 * Find and return the minimum of all the numbers in the list.
	 * If the list is empty, return 0.
	 */
	public double getMin()
	{
		//******INSERT YOUR CODE HERE***********
		if(dataList.size() > 0) {
			double min = dataList.get(0);
			for(Double i : dataList) {
				if(i < min) {
					min = i;
				}
			}
			return min;
		}
		return 0;
		//**************************************
	}
	
	/**
	 * Find and return the maximum k numbers of all the numbers in the list as an array of k double number.
	 * The order of the returned k numbers does not matter. (We only care if you can get the max k elements)
	 * If the list has fewer than k numbers, return null.
	 */
	public double[] getMaxK(int k)
	{
		//******INSERT YOUR CODE HERE***********
		if(dataList.size() >= k) {
			int i = 1;
			while(i <= 3) {
				int temp = dataList.size()-i;
				maxSet.add(dataList.get(temp));
				i++;
			}
			double[] arr = new double[maxSet.size()];
			for(i = 0; i < maxSet.size(); i++) {
				arr[i] = maxSet.get(i);
			}
			return arr;
		}
		return null;
		//**************************************
	}
	
	/**
	 * Find and return the minimum k numbers of all the numbers in the list as an array of k double number.
	 * The order of the returned k numbers does not matter. (We only care if you can get the min k elements)
	 * If the list has fewer than k numbers, return null.
	 */
	public double[] getMinK(int k)
	{
		//******INSERT YOUR CODE HERE***********
		if(dataList.size() >= k) {
			int i = 0;
			while(i < 3) {
				minSet.add(dataList.get(i));
				i++;
			}

			double[] arr = new double[minSet.size()];
			for(i = 0; i < minSet.size(); i++) {
				arr[i] = minSet.get(i);
			}
			return arr;
		}
		return null;
		//**************************************
	}
	
	/**
	 * Print (via System.out.println()) the numbers in the list in format of:
	 * DATA[<N>]:[<n1>, <n2>, <n3>, ...]
	 * Where N is the size of the list. <ni> is the ith number in the list.
	 * E.g., "DATA[4]:[1.0, 2.0, 3.0, 4.0]"
	 */
	public void printData()
	{
		//******INSERT YOUR CODE HERE***********
		System.out.println("DATA" + "[" + tempData.size() + "]" + ": " + tempData.toString());
		//**************************************
	}
}
