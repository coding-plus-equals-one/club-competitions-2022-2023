#Test Cases Below/Checkers

numlist = {(1,4,3,6,8,5,9,0,-4,-11,10):[1,9,25,81,121]}

def numlistfunct(funct):
  for a in numlist:
    if funct(a) != numlist[a]:
      print(f'FAILED ON "{a}".')
      return
  print("PASSED!")


factorial_test = {
  5:120,
  9:362880,
  0:1
}

def test_factorial_checker(factor):
  for b in factorial_test:
    if factor(b) != factorial_test[b]:
      print(f"FAILED ON {b}.")
      return
  
  print("PASSED!")




word_num_test = {("hi",5):"hihihihihi",
  ("poo",0):"",
  ("cat",8):"catcatcatcatcatcatcatcat"}

def word_num_funct(words):
  for c,d in word_num_test:
    if words(c,d) != word_num_test[c,d]:
      print(f"FAILED ON {c,d}.")
      return
      
  print("PASSED!")


