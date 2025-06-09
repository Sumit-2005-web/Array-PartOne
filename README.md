# Java Array Operations 🧮

This repository contains a basic Java program that demonstrates fundamental array operations. The operations covered include:

- Linear Search
- Binary Search
- Reversing an Array
- Printing All Pairs in an Array
- Printing All Subarrays

## 📁 File Structure

- `PartOne.java` – Contains all the implementations for array operations.

## 🧠 Concepts Covered

### 1. Linear Search
Finds the index of a target element by checking each element sequentially.

### 2. Binary Search
Efficiently finds the index of a target element in a **sorted** array using a divide-and-conquer approach.

### 3. Reverse Array
Reverses the order of elements in an array.

### 4. Print All Pairs
Prints all possible pairs of elements in the array.

### 5. Print All Subarrays
Prints all contiguous subarrays that can be formed from the array.

## 🧠 Topics Covered

- Duplicate detection
- Binary search in rotated arrays
- Stock profit optimization
- Trapping rain water

---

## ✅ Solved Questions

### 1. **Contains Duplicate**
**Problem**: Given an integer array, determine if it contains any duplicates.

- ✅ *File*: `PartOne.java`
- ✅ *Approach*: Brute force approach.
- ✅ *Time Complexity*: O(n * n)

---

### 2. **Search in Rotated Sorted Array**
**Problem**: Given a rotated sorted array and a target value, return its index or -1 if not found.

- ✅ *File*: `PartOne.java`
- ✅ *Approach*: Modified Binary Search.
- ✅ *Time Complexity*: O(log n)

---

### 3. **Best Time to Buy and Sell Stock**
**Problem**: Find the best day to buy and sell a stock for maximum profit.

- ✅ *File*: `PartTwo.java`
- ✅ *Approach*: Track minimum price and max profit while iterating.
- ✅ *Time Complexity*: O(n)

---

### 4. **Trapping Rain Water**
**Problem**: Given an elevation map, compute how much water it can trap.

- ✅ *File*: `ImpQuestion.java`
- ✅ *Approach*: Two-pointer technique to compute water from both sides.
- ✅ *Time Complexity*: O(n)

---

## 🚀 How to Run

Make sure you have Java installed on your system.

```bash
javac PartOne.java
java PartOne
