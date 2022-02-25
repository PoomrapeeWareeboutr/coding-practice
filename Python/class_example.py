class House:
    # The Constructor
    def __init__(self, house_type=None, house_area="0 m x m", house_price=0):
        self.type = house_type
        self.area = house_area
        self.price = house_price

    def showDetail(self):
        print(self.type)
        print(self.area)
        print(self.price)

    # def __str__(self):
        # return "House type: {:15} Area: {:15} Price: {:15}".format(self.type, self.area, self.price)

    def __repr__(self):
        # return "({!r}, {!r}, {!r})".format(self.type, self.area, self.price)
        # return repr((self.type, self.area, self.price))
        return "{} {}".format(__class__.__name__, repr((self.type, self.area, self.price)))

if __name__ == "__main__":
    print(__name__)
    list_house = [
        # House("Single", 180, 5700),
        House("Single", "30 x 30 m", "28 Million"),
        House("Condo", "50 x 50 m", "39 Million"),
        House("Dormity","40 x 40 m", "6500 Baht/Month")
    ]
    for i in list_house:
        print(i)
