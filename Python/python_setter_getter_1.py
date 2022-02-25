class Person:

    def __init__(self, firstname: str = "None", lastname: str = "None", id: int = 0) -> None:
        self.firstname = firstname
        self.lastname = lastname
        
        # Private variable
        self.__id = id
    
    # Setter (Java style)
    def setID(self, id: int) -> None:
        self.__id = id

    # Getter (Java style)
    def getID(self) -> int:
        return self.__id
    
    # String representation
    def __repr__(self) -> str:
        return "{} {}".format(__class__.__name__, repr([self.firstname, self.lastname, self.__id]))

if __name__ == "__main__":

    p1 = Person("Poomrapee", "Wareeboutr", 6388113)
    print(p1)


    # Need to modify the variable via a setter method (Java style).
    p1.setID(6388196)
    # Or modify directly with the "_class__variable"
    # p1._Person__id = 6388196
    print(p1)

    print(p1.getID())

        