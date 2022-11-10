# Competition A

Welcome to the first coding += 1 mock competition! Try to solve all the problems below in the allotted time. There are no deductions or extra points for memory or time complexity. 

Run and test all of your code in `main.py` or `main.java`. You can also use different programming language, but we don't have automatic tests supported for languages other than Python or Java yet. Let an officer know when you have finished each problem.

## Way Too Long Words
### Instructions
Sometimes some words like `"localization"` or `"internationalization"` are so long that writing them many times in one text is quite tiresome.

Let's consider a word *too long*, if its length is **strictly more** than 10 characters. All too long words should be replaced with a special abbreviation.

This abbreviation is made like this: we write down the first and the last letter of a word and between them we write the number of letters between the first and the last letters. That number is in decimal system and doesn't contain any leading zeroes.

Thus, `"localization"` will be spelt as `"l10n"`, and `"internationalization"` will be spelt as `"i18n"`.

In the function `too_long` (or `tooLong`), take a string input `word` and return the replaced word. All too long words should be replaced by the abbreviation and the words that are not too long should not undergo any changes.

``` python
def too_long(word):
    # code here
    pass
```

``` java
public static String tooLong(String word) {
    // code here
    return "";
}
```
### Examples

```
Input: word
Output: word
```
```
Input: localization
Output: l10n
```
```
Input: internationalization
Output: i18n
```
```
Input: pneumonoultramicroscopicsilicovolcanoconiosis
Output: p43s
```

## Arrival of the General
### Instructions
The ministry sent a general to inspect the Super Secret Military Squad under the command of the Colonel Super. Having learned the news, the colonel ordered to all `n` squad soldiers to line up on the parade ground.

By the military charter, the soldiers should stand in the order of decreasing height. But as there's virtually no time to do that, the soldiers lined up in the arbitrary order. The general is rather short-sighted, and he thinks that the soldiers lined up correctly if the first soldier in the line has the maximum height and the last soldier has the minimum height. Note that the way other solders are positioned does not matter, including the case when there are several soldiers whose height is maximum or minimum. Only the heights of the first and the last soldier are important.

For example, the general considers the sequence of heights `(4, 3, 4, 2, 1, 1)` correct and the sequence `(4, 3, 1, 2, 2)` wrong.

Within one second, the colonel can swap any two neighboring soldiers. Help him count the minimum time needed to form a line-up which the general will consider correct.

In the function `arrival_general` (or `arrivalGeneral`), take the list input `soldiers`, which represents the values of the soldiers' heights in their original line-up. Return the minimum number of seconds the colonel will need to form a line-up the general will like.

``` python
def arrival_general(soldiers):
    # code here
    pass
```

``` java
public static int arrivalGeneral(int[] soldiers) {
        // code here
        return 99999;
    }
```

### Examples
```
Input: [33, 44, 11, 22]
Output: 2
```
The colonel will need to swap the first and second soldier and then the third and fourth soldier. That will take 2 seconds. The resulting position of the soldiers is (44, 33, 22, 11).

```
Input: [10, 10, 58, 31, 63, 40, 76]
Output: 10
```
The colonel may swap the soldiers in the following sequence:
1. (10, 10, 58, 31, 63, 40, 76)
2. (10, 58, 10, 31, 63, 40, 76)
3. (10, 58, 10, 31, 63, 76, 40)
4. (10, 58, 10, 31, 76, 63, 40)
5. (10, 58, 31, 10, 76, 63, 40)
6. (10, 58, 31, 76, 10, 63, 40)
7. (10, 58, 31, 76, 63, 10, 40)
8. (10, 58, 76, 31, 63, 10, 40)
9. (10, 76, 58, 31, 63, 10, 40)
10. (76, 10, 58, 31, 63, 10, 40)
11. (76, 10, 58, 31, 63, 40, 10)

## Add Odd or Subtract Even
### Instructions
You are given two positive integers *a* and *b*. In one move, you can change *a* in the following way: 

- Choose any positive odd integer and replace a with a + x
- Choose any positive even integer y and replace a with a - y

Your task is to find the minimum number of moves required to obtain b from a. It is guaranteed that this is always possible.

In the function `add_or_subtract` (or `addOrSubtract`), take the integer inputs `a` and `b` and return the minimum number of moves needed to get from `a` to `b`.

``` python
def add_or_subtract(a, b):
    pass
```

``` java
public static int addOrSubtract(int a, int b) {
    // code here
    return 99999;
}
```
### Test Cases
```
Input: 2, 3
Output: 1
```
You can just add 1.
```
Input: 10, 10
Output: 0
```
You don't need to do anything.
```
Input: 2, 4
Output: 2
```
You can add 1 two times.
```
Input: 7, 4
Output: 2
```
You can subtract 4 and add 1.
```
Input: 9, 3
Output: 1
```
You can just subtract 6.