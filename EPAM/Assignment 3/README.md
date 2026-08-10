# Assignment 3 - Greedy & Dynamic Programming

## Overview
This folder contains two algorithm problems and their Java solutions.

- `ScholarshipDistribution.java` solves the Scholarship Distribution problem using a greedy approach.
- `MaximumLearningPoints.java` solves the Maximum Learning Points problem using a simple dynamic programming approach.

## Problem 1: Scholarship Distribution (Greedy)

### Description
A college has a limited scholarship budget. Each student has a minimum scholarship amount they will accept.

The college wants to award scholarships to as many students as possible without exceeding the total budget. Each student can receive at most one scholarship.

### Input Format
- First line: `N B` (number of students and total budget)
- Second line: `N` integers representing the minimum scholarship required by each student.

### Output Format
- Print the maximum number of students who can receive scholarships.

### Constraints
- `1 ≤ N ≤ 100000`
- `1 ≤ B ≤ 10^9`
- `1 ≤ Scholarship ≤ 10^6`

### Example
Input:
```
5 20
4 8 2 6 5
```
Output:
```
4
```

### Solution
- `ScholarshipDistribution.java`

---

## Problem 2: Maximum Learning Points (Dynamic Programming)

### Description
A student prepares for a contest and solves one topic per day. Each topic gives learning points, but the student cannot solve two consecutive topics.

Given topic points in order, determine the maximum total learning points without choosing consecutive topics.

### Input Format
- First line: `N` (number of topics)
- Second line: `N` integers representing learning points.

### Output Format
- Print the maximum learning points.

### Constraints
- `1 ≤ N ≤ 100000`
- `1 ≤ Points ≤ 10000`

### Example
Input:
```
6
5 1 2 10 6 2
```
Output:
```
17
```

### Solution
- `MaximumLearningPoints.java`

---

## How to Run
From the `Assignment - 3` folder, use Java:

```bash
javac ScholarshipDistribution.java
java ScholarshipDistribution < input.txt

javac MaximumLearningPoints.java
java MaximumLearningPoints < input.txt
```

## Notes
- Both programs read input using `Scanner(System.in)`.
- `ScholarshipDistribution.java` uses a greedy sort-based approach.
- `MaximumLearningPoints.java` uses a basic dynamic programming recurrence.
