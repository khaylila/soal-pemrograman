print("Hello world");

numb = int(input("Masukkan batas nilai maksimal: "));

numbDict = {};
for x in range(numb):
  x += 1;
  numbDict[x] = x**2;
  
print(numbDict);
