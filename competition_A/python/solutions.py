def canMeasureWater(jug1Capacity: int, jug2Capacity: int, targetCapacity: int) -> bool:
    if jug1Capacity + jug2Capacity < targetCapacity:
        return False

    divisors = list(set([jug1Capacity, jug2Capacity]))

    def get_mod(a, b):
        value = a % b if a > b else b % a
        print(value)

        if value != 0 and value not in divisors:
            divisors.append(value)
            get_mod(value, a)
            get_mod(value, b)

    get_mod(jug1Capacity, jug2Capacity)

    for i in divisors:
        if targetCapacity % i == 0:
            return True

    return False


print(canMeasureWater(1, 1, 12))
