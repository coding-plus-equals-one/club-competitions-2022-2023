too_long_tests = {
    "word": "word",
    "localization": "l10n",
    "internationalization": "i18n",
    "pneumonoultramicroscopicsilicovolcanoconiosis": "p43s",
}


def test_too_long():
    for i in too_long_tests:
        if too_long(i) != too_long_tests[i]:
            print(f"FAILED ON {i}.")
            return

    print("PASSED!")
