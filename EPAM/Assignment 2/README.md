# Assignment 2 - Tree & Graph Problems

## Overview
This folder contains two algorithm problems and their Java solutions.

- `TreeTrustedServers.java` solves the "Tree of Trusted Servers" problem.
- `EmergencyRouteValidation.java` solves the "Emergency Route Validation" problem.

## Problem 1: Tree of Trusted Servers

### Description
A network of servers is represented as a tree with `N` nodes. Each server stores a security key.

A server is trusted if the XOR of security keys along the path from the root server (`1`) to that server is greater than or equal to threshold `K`.

### Input Format
- First line: `N K`
- Second line: `N` integers (security keys)
- Next `N-1` lines: `u v` (tree edges)

### Output Format
- Print the number of trusted servers.

### Constraints
- `1 ≤ N ≤ 10^5`
- `0 ≤ K ≤ 10^9`
- `0 ≤ Key ≤ 10^9`
- Input graph is a tree

### Example
Input:
```
7 5
3 6 2 7 1 4 5
1 2
1 3
2 4
2 5
3 6
3 7
```
Output:
```
4
```

### Solution
- `TreeTrustedServers.java`

---

## Problem 2: Emergency Route Validation

### Description
A road network is modeled as a connected undirected graph. City `1` is the capital.

A city is efficiently reachable if the shortest path from city `1` to that city uses at most `D` roads.

### Input Format
- First line: `N M D`
- Next `M` lines: `u v` (roads)

### Output Format
- Print the number of efficiently reachable cities.

### Constraints
- `1 ≤ N ≤ 10^5`
- `0 ≤ M ≤ 2×10^5`
- `0 ≤ D ≤ N`
- No self-loops

### Example
Input:
```
7 8 2
1 2
1 3
2 4
2 5
3 6
6 7
5 7
4 6
```
Output:
```
6
```

### Solution
- `EmergencyRouteValidation.java`

---

## How to Run
From the `Assignment - 2` folder, use Java:

```bash
javac TreeTrustedServers.java
java TreeTrustedServers < input.txt

javac EmergencyRouteValidation.java
java EmergencyRouteValidation < input.txt
```

## Notes
- `TreeTrustedServers.java` uses a basic DFS stack traversal to compute XOR values.
- `EmergencyRouteValidation.java` uses a simple BFS traversal to compute shortest distances.
