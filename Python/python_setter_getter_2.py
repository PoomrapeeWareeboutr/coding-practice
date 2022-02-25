class Person:

    def __init__(self, firstname: str = "None", lastname: str = "None", id: int = 0) -> None:
        self.firstname = firstname
        self.lastname = lastname
        
        # Private variable
        self.id = id
    
    # Getter (Pythonic style)
    @property
    def id(self) -> int:
        return self.__id
    
    # Setter (Pythonic style)
    @id.setter
    def id(self, id: int) -> None:
        self.__id = id
    
    # String representation
    def __repr__(self) -> str:
        return "{} {}".format(__class__.__name__, repr([self.firstname, self.lastname, self.id]))

        
if __name__ == "__main__":

    p1 = Person("Poomrapee", "Wareeboutr", 6388113)
    print(p1)
    print(vars(p1))
    # Not need to modify the variable via setter method like a Java style.
    # You can direct modify like a normal of Python style.
    p1.id = 6388196
    print(p1)
    print(vars(p1))
    
        