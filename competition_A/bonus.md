# Bonus! 
For advanced students who want a challenge. Ronan says that you might not be able to solve this in 45 minutes. There are no automatic test cases.

## Water and Jug
### Instructions
You are given two jugs with capacities `jug1` and `jug2`. There is an infinite amount of water supply available. Determine whether it is possible to measure exactly `target` liters using these two jugs. For `target` liters of water to be measurable, you must have `target` liters of water contained within one or both buckets by the end.

Operations allowed:
- Fill any of the jugs completely up to their capacity.
- Empty any of the jugs completely.
- Pour water from one jug into another till the other jug is completely full, or the first jug itself is empty.

``` python
def water_jug(jug1, jug2, target):
    pass
```

``` java
public boolean waterJug(int jug1, int jug2, int target) {
    return false;
}
```

### Test Cases
```
Input: jub1 = 3, jug2 = 5, target = 4
Output: true
```

```
Input: jug1 = 2, jug2 = 6, target = 5
Output: false
```

```
Input: jub1 = 2, jub2 = 6, target = 5
Output: true
```