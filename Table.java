# 1. Print all odd numbers from 1 to n
def print_odds(n):
    for i in range(1, n+1, 2):
        print(i, end=' ')
    print()

# 2. Convert days into years, months, and days
def convert_days(total_days):
    years = total_days // 365
    months = (total_days % 365) // 30
    days = (total_days % 365) % 30
    print(f"{years} years, {months} months, {days} days")

# 3. Check Harshad number
def is_harshad(n):
    return n % sum(int(d) for d in str(n)) == 0

# 4. Count number of words in a string
def count_words(s):
    return len(s.split())

# 5. Calculate compound interest
def compound_interest(p, r, t):
    return p * (1 + r / 100) ** t

# 6. Check palindrome prime
def is_palindrome_prime(n):
    return str(n) == str(n)[::-1] and all(n % i != 0 for i in range(2, int(n**0.5) + 1)) and n > 1

# 7. Swap two numbers (with temp variable)
def swap_with_temp(a, b):
    temp = a
    a = b
    b = temp
    return a, b

# 8. Swap two numbers (without temp)
def swap_without_temp(a, b):
    a = a + b
    b = a - b
    a = a - b
    return a, b

# 9. Sum of first n natural numbers
def sum_natural(n):
    return n * (n + 1) // 2

# 10. Print all factors of a number
def print_factors(n):
    for i in range(1, n + 1):
        if n % i == 0:
            print(i, end=' ')
    print()

# 11. Cube of a number
def cube(n):
    return n ** 3

# 12. Check Duck number
def is_duck(n):
    return '0' in str(n)[1:]

# 13. Print multiplication tables from 1 to 10
def multiplication_tables():
    for i in range(1, 11):
        for j in range(1, 11):
            print(f"{i} x {j} = {i*j}")
        print()

# 14. Sum of squares of digits
def sum_of_squares(n):
    return sum(int(d) ** 2 for d in str(n))

# 15. Count uppercase and lowercase characters
def count_case(s):
    upper = sum(1 for c in s if c.isupper())
    lower = sum(1 for c in s if c.islower())
    return upper, lower

# 16. Check Kaprekar number
def is_kaprekar(n):
    sq = str(n ** 2)
    left = sq[:-len(str(n))] or "0"
    right = sq[-len(str(n)):]
    return n == int(left) + int(right)

# 17. Reverse an integer without string
def reverse_int(n):
    rev = 0
    while n > 0:
        rev = rev * 10 + n % 10
        n //= 10
    return rev

# 18. Generate Fibonacci series up to n terms
def fibonacci(n):
    a, b = 0, 1
    for _ in range(n):
        print(a, end=' ')
        a, b = b, a + b
    print()

# 19. Return ASCII value of a character
def char_to_ascii(ch):
    return ord(ch)
