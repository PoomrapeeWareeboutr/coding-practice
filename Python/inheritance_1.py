class A:

    def __init__(self, var1, var2) -> None:
        self.var1 = var1
        self.var2 = var2
    
    def function(self) -> None:
        print("This text is on Class A")

class B(A):

    def __init__(self, var1, var2, var3, var4) -> None:
        super().__init__(var1, var2)
        self.var3 = var3
        self.var4 = var4

    def function(self) -> None:
        print("This text is in Class B")

class C(B):

    # Overriding
    def __init__(self, var1, var2, var3, var4, var5, var6) -> None:
        super().__init__(var1, var2, var3, var4)
        self.var5 = var5
        self.var6 = var6
    
    # Overriding
    def function(self) -> None:
        super().function()
        A.function(self)
        print("This text is in Class C")

if __name__ == "__main__":

    c = C(1, 2, 3, 4, 5, 6)
    print(c.var1, c.var3)
    c.function()

