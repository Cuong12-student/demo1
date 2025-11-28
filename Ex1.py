def inThapNguoc(n):
    if not isinstance(n,int) or n<0:
        print("Vui long nhap lai.")
        return
    for i in range(n,0,-1):
        print(" "*(n-i),end="")
        print("*"*(2*i-1))
try:
    N=int(input("Nhap so chieu cao thap:"))
    inThapNguoc(N)
except ValueError:
    print("Vui long nhap lai.")