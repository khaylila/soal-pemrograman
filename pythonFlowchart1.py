# Online Python compiler (interpreter) to run Python online.
# Write Python 3 code in this online editor and run it.
print("Hello world")

bilangan = 0;
step = 0;
add = 1;
i=1;
Input = 0;
total = 0;

Input = int(input("Masukkan bilangan: "));


while i <= Input:
    step = step + add;
    # print(step);
    bilangan = bilangan + step;
    # print(bilangan);
    total = total + bilangan;
    # print(total);
    
    if i == Input:
        print("bilangan=");
    else:
        print("bilangan+");
        
    i+=1;
    
print(total);
