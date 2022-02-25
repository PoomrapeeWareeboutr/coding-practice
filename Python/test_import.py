# This file is imported file for test a special variables #

def rectangle_area(width, height):
    return width * height

def triangle_area(base, height):
    return 0.5 * base * height

print("Import file from:", __name__ + ".py")
if __name__ == "__main__":
    print(__name__)
    width = int(input())
    height = int(input())
    print(rectangle_area(width, height))

