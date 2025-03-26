/******************************************************************
 *
 *   YOUR NAME / SECTION NUMBER
 *
 *   This java file contains the problem solutions of isSubSet, findKthLargest,
 *   and sort2Arrays methods. You should utilize the Java Collection Framework for
 *   these methods.
 *
 ********************************************************************/

import java.lang.reflect.Array;
import java.util.*;

class ProblemSolutions {

    /**
     * Method: isSubset()
     *
     * Given two arrays of integers, A and B, return whether
     * array B is a subset if array A. Example:
     *      Input: [1,50,55,80,90], [55,90]
     *      Output: true
     *      Input: [1,50,55,80,90], [55,90, 99]
     *      Output: false
     *
     * The solution time complexity must NOT be worse than O(n).
     * For the solution, use a Hash Table.
     *
     * @param list1 - Input array A
     * @param list2 - input array B
     * @return      - returns boolean value B is a subset of A.
     */

    public boolean isSubset(int list1[], int list2[]) {

        boolean isSubset = false;
        HashSet<Integer> newHashSetA = new HashSet<>();
        //For each Loop
        for(int set1: list1){
            //Adds the values in the hashset
            newHashSetA.add(set1);

        }
        //For eachloop
        for(int set1: list2){
            //Checks if the the heshset dosent contain the values in set1
            if(!newHashSetA.contains(set1)){
                //Returns false
                return isSubset;
            }

        }

        // ADD YOU CODE HERE -- DON'T FORGET TO ADD YOR NAME AT TOP OF FILE

        return true;
    }


    /**
     * Method: findKthLargest
     *
     * Given an Array A and integer K, return the k-th maximum element in the array.
     * Example:
     *      Input: [1,7,3,10,34,5,8], 4
     *      Output: 7
     *
     * @param array - Array of integers
     * @param k     - the kth maximum element
     * @return      - the value in the array which is the kth maximum value
     */

    public int findKthLargest(int[] array, int k) {
        //New Priority Queue
        PriorityQueue<Integer> newQueue = new PriorityQueue<>();
        int newRoot = 0;
        //For each loop
        for(int nums: array){
            //Gets added in the newQueue
                newQueue.add(nums);
            }
            //Then it checks while the queue size is greater greater or equal to k
            while(newQueue.size() >= k){
                //Then we pull the element out of the queue and outs it in variable.
                    newRoot = newQueue.poll();
                
            }
            
        return newRoot; 
    }


    /**
     * Method: sort2Arrays
     *
     * Given two arrays A and B with n and m integers respectively, return
     * a single array of all the elements in A and B in sorted order. Example:
     *      Input: [4,1,5], [3,2]
     *      Output: 1 2 3 4 5
     *
     * @param array1    - Input array 1
     * @param array2    - Input array 2
     * @return          - Sorted array with all elements in A and B.
     */

    public int[] sort2Arrays(int[] array1, int[] array2) {
        // New Hashset
       HashSet<Integer> tempArray = new HashSet<>();
       //For each loop that adds in the hashset
       for(int nums: array1){
        tempArray.add(nums);
       }
       //Same thing but for the second array
       for(int nums2: array2){
        tempArray.add(nums2);
       }
       //Then we make and array list and add the hashset in array 
       ArrayList<Integer> array = new ArrayList<>(tempArray);
       //We call the Java Collection 
       Collections.sort(array);
       //Then we make a new array
       int[] finalArray = new int[array.size()];
       //We go through the loop
       for(int i = 0; i < array.size(); i++){
        //And we add the inputs in the final array
        finalArray[i] = array.get(i);
       }
        
        return finalArray;
    }

}