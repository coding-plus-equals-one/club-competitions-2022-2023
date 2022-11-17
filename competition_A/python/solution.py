def too_long(word):
    return word if len(word) <= 10 else (word[0] + str(len(word) - 2) + word[-1])


def arrival_general(soldiers):
    ind_min = 0
    ind_max = 0
    for i in range(len(soldiers)):
        if soldiers[i] <= soldiers[ind_min]:
            ind_min = i
        elif soldiers[i] > soldiers[ind_max]:
            ind_max = i
    ret = ind_max + len(soldiers) - 1 - ind_min
    if ind_max > ind_min:
        ret -= 1
    return ret


def add_or_subtract(a, b):
    if a % 2 != b % 2:
        if a < b:
            return 1
        else:
            return 2
    else:
        if a < b:
            return 2
        elif a > b:
            return 1
        else:
            return 0


def canMeasureWater(jug1Capacity, jug2Capacity, targetCapacity):
    if jug1Capacity + jug2Capacity < targetCapacity:
        return False

    divisors = list(set([jug1Capacity, jug2Capacity]))

    def get_mod(a, b):
        value = a % b if a > b else b % a

        if value != 0 and value not in divisors:
            divisors.append(value)
            get_mod(value, a)
            get_mod(value, b)

    get_mod(jug1Capacity, jug2Capacity)

    for i in divisors:
        if targetCapacity % i == 0:
            return True

    return False
