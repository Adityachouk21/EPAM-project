Assignment 3

Medium Level Problem Statements - Greedy & Dynamic Programming
Problem 1: Scholarship Distribution (Greedy)
A college has received a limited number of scholarships for students who participated in a coding competition. Every student has a minimum scholarship amount they are willing to accept. The college wants to award scholarships to as many students as possible without exceeding the available budget.

Each student can receive at most one scholarship, and the college can decide the order in which scholarships are awarded. Your task is to determine the maximum number of students who can receive scholarships while staying within the total budget.
Input Format
• First line: N B (number of students and total budget)
• Second line: N integers representing the minimum scholarship required by each student.
Output Format
Print the maximum number of students who can receive scholarships.
Constraints
1 ≤ N ≤ 100000
1 ≤ B ≤ 10^9
1 ≤ Scholarship ≤ 10^6
Sample Input
5 20
4 8 2 6 5
Sample Output
4
Explanation
Sort the scholarship requirements in increasing order and award scholarships starting from the smallest amount. Students requiring 2, 4, 5, and 6 can be selected within the budget of 20.
Example
Input:
4 10
3 5 7 2

Output:
3

Problem 2: Maximum Learning Points (Dynamic Programming)
A student is preparing for a programming contest. Every day, the student can solve one topic, and each topic provides a certain number of learning points. However, the student cannot solve two consecutive difficult topics because of fatigue.

Given the learning points of each topic arranged in order, determine the maximum learning points the student can earn without selecting two consecutive topics.
Input Format
• First line: N (number of topics)
• Second line: N integers representing learning points.
Output Format
Print the maximum learning points.
Constraints
1 ≤ N ≤ 100000
1 ≤ Points ≤ 10000
Sample Input
6
5 1 2 10 6 2
Sample Output
17
Explanation
Choose topics with points 5, 10, and 2. The total learning points are 17. This is the maximum possible without choosing two consecutive topics.
Example
Input:
5
3 2 7 10 12

Output:
22
