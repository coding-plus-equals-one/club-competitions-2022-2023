too_long_tests = {
    "word": "word",
    "localization": "l10n",
    "internationalization": "i18n",
    "pneumonoultramicroscopicsilicovolcanoconiosis": "p43s",
}

arrival_general_tests = {
    (2, 2, 1): 0,
    (33, 44, 11, 22): 2,
    (1, 1): 0,
    (1, 2, 1): 1,
    (2, 1): 0,
    (2, 1, 1): 0,
    (10, 10, 58, 31, 63, 40, 76): 10,
    (1, 1, 2): 2,
    (10, 10, 58, 31, 63, 76, 40): 9,
    (1, 2): 1,
    (10, 10, 58, 1, 90, 40, 76): 6,
    (1, 1, 1): 0,
    (90, 10, 58, 31, 63, 40, 76): 5,
}

add_or_subtract_tests = {
    (7, 26): 1,
    (2, 8): 2,
    (42, 42): 0,
    (31, 25): 1,
    (90, 4): 1,
    (15, 23): 2,
    (51, 51): 0,
    (28, 9): 2,
    (20, 5): 2,
    (3, 24): 1,
}

water_jug_tests = {(34, 5, 6): True, (2, 6, 5): False, (1, 1, 12): False}


def test_too_long(funct):
    for i in too_long_tests:
        if funct(i) != too_long_tests[i]:
            print(f'FAILED ON "{i}".')
            return

    print("PASSED!")


def test_arrival_general(funct):
    for i in arrival_general_tests:
        if funct(list(i)) != arrival_general_tests[i]:
            print(f"FAILED ON {list(i)}.")
            return

    print("PASSED!")


def test_add_or_subtract(funct):
    for a, b in add_or_subtract_tests:
        if funct(a, b) != add_or_subtract_tests[(a, b)]:
            print(f"FAILED ON a = {a}, b = {b}.")
            return

    print("PASSED!")
