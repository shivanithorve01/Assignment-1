
# **Kata02: Karate Chop**

## **[Problem Statement](http://codekata.com/kata/kata02-karate-chop/)** 

Write a binary chop method that takes an integer search target and a sorted array of integers. It should return the integer index of the target in the array, or -1 if the target is not in the array. The signature will logically be:

     `chop(int, array_of_int)  -> int`

You can assume that the array has less than 100,000 elements. For the purposes of this Kata, time and memory performance are not issues (assuming the chop terminates before you get bored and kill it, and that you have enough RAM to run it).
***
## **Test Cases**

Given Test Cases :
```
    def test_chop
    assert_equal(-1, chop(3, []))
    assert_equal(-1, chop(3, [1]))
    assert_equal(0,  chop(1, [1]))
    #
    assert_equal(0,  chop(1, [1, 3, 5]))
    assert_equal(1,  chop(3, [1, 3, 5]))
    assert_equal(2,  chop(5, [1, 3, 5]))
    assert_equal(-1, chop(0, [1, 3, 5]))
    assert_equal(-1, chop(2, [1, 3, 5]))
    assert_equal(-1, chop(4, [1, 3, 5]))
    assert_equal(-1, chop(6, [1, 3, 5]))
    #
    assert_equal(0,  chop(1, [1, 3, 5, 7]))
    assert_equal(1,  chop(3, [1, 3, 5, 7]))
    assert_equal(2,  chop(5, [1, 3, 5, 7]))
    assert_equal(3,  chop(7, [1, 3, 5, 7]))
    assert_equal(-1, chop(0, [1, 3, 5, 7]))
    assert_equal(-1, chop(2, [1, 3, 5, 7]))
    assert_equal(-1, chop(4, [1, 3, 5, 7]))
    assert_equal(-1, chop(6, [1, 3, 5, 7]))
    assert_equal(-1, chop(8, [1, 3, 5, 7]))
    end
```


***
## **Implementation**


### **Approach 1 : Iterative Approach**

1. Initially consider a low =0, high = n-1 and mid to middle number of the array.  
 Till low crossovers high repeat the below steps -  
2. If target matches with the mid, we return the mid index.  
3. If the value of the target search is less than the mid,narrow the interval to the lower half.(change high to mid-1). 
5. Otherwise, narrow it to the upper half.(Change low to mid+1). 

Time Complexity = O(n)  

_refer to KarateChopIterative.java_ 

### **Approach 2 : Recursive Approach**


1. Initially consider a low =0, high = n-1 and mid to middle number of the array.
2. If target matches with the mid, we return the mid index.
3. Search by repeatedly dividing the search interval in half.
4. If the value of the target search is less than the mid,narrow the interval to the lower half in a recursive call by changing high to mid-1. 
5. Otherwise, narrow it to the upper half in a recursive call by changing low to mid+1. 
6. Repeatedly check until the value is found or the interval is empty. 

Time Complexity = O(log n)  

_refer to KarateChopRecursive.java_  

***
## **Variations**

If duplicates are present in the given sorted list, we can find an index of particular occurence of the target search element.

1. **Finding first Occurence of a target** 

    In bot iterative and recursive approaches, index of a first occurence of a target search element can be found.


2. **Finding Last Occurence of a target** 

    1. Initially consider the low=0 and the high=n-1 pointers and the result as -1.  
    2. Compare the mid element till start does not crossover end pointer.  
    3. If the mid element is equal to the key value, store the mid-value in the result and move the start pointer to mid+1
    4. Else if the key value is less than the mid element then end= mid-1(move leftward)  
    5. Else do start = mid+1.  

    <br/>

    _refer to KarateChopFindLastOccurence.java_  
<br/>

3. **Finding a target in descending sorted array**

    1. Check if array is sorted in ascending or descending order by comparing first and last element in an array.
    2. If array is in descending order, and target is greater than arr[mid] then it should lie in lower half of an array.So change high to mid-1 otherwise change low to mid+1.

    <br/>

    _refer to KarateChopDescendingSortedArray.java_

***