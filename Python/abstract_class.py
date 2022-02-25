from abc import ABC, abstractmethod

class A(ABC):
    
    def function1(self) -> None:
        print("Hello, Python!")

    def function2(self) -> None:
        print("Hello, Java!")

    @abstractmethod
    def function3(self) -> None:
        pass

class B(A):
    
    # Overriding
    def function3(self) -> None:
        print("Hello, C!")

if __name__ == "__main__":
    b = B()
    b.function1()
    b.function2()
    b.function3()
