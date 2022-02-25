# Python function test # 

def get_area_box(width, length, height):
    if width < 0 or length < 0 or height < 0:
        return 0
    box_area = width * length * height
    return box_area

x = int(input())
y = int(input())
z = int(input())
box_1 = get_area_box(width = 4, length = -2, height = 9)
box_2 = get_area_box(width = x, length = y, height = z)

print(box_1)
print(box_2)

