# Fundamentals of Programming grade calculator #
# This is the first desktop application by Python #

import tkinter

def grade_calculator():
    name = name_input.get()
    lab_score = float(lab_score_input.get())
    quiz_score = float(quiz_score_input.get())
    midterm_score = float(midterm_score_input.get())
    final_score = float(final_score_input.get())
    score = ((15*lab_score) + (25*quiz_score) + (25*midterm_score) + (35*final_score))/100
    total_score = round(score, 2)
    your_grade = grade(total_score)
    
    output = ""
    output += name + "'s final score: " + str(total_score) + "\n"
    output += "Your grade: " + your_grade + "\n"
    if your_grade == "F" or your_grade == "D":
        output += "It's okay. See you next semester!"
    else:
        output += "PASS"
    output_label.configure(text = output)

def grade(total_score):
    grade = ""
    if total_score <= 55:
        grade = "F"
        return grade
    elif total_score > 55 and total_score <= 65:
        grade = "D"
        return grade
    elif total_score > 65 and total_score <= 75:
        grade = "C"
        return grade
    elif total_score > 75 and total_score <= 85:
        grade = "B"
        return grade
    elif total_score > 85:
        grade = "A"
        return grade

window = tkinter.Tk()
window.title("Fundamentals of Programming")
window.minsize(width = 600, height = 400)

name_text = tkinter.Label(master = window, text = "What is your name?")
name_text.pack()

name_input = tkinter.Entry(master = window)
name_input.pack()

intro_text = ""
intro_text += "Please, do follow below this...\n"
intro_text += "This is a program that calculates your Fundamentals of Programming grade.\n"
intro_text += "The first box, input your Lab score. (Lab 15%)\n"
intro_text += "The second box, input your Quiz score. (Quiz 25%)\n"
intro_text += "The third box, input your Midterm score. (Midterm 25%)\n"
intro_text += "The forth box, input your Final score. (Final 35%)\n"

intro_label = tkinter.Label(master = window, text = intro_text)
intro_label.pack()

lab_score_input = tkinter.Entry(master = window)
lab_score_input.pack()

quiz_score_input = tkinter.Entry(master = window)
quiz_score_input.pack()

midterm_score_input = tkinter.Entry(master = window)
midterm_score_input.pack()

final_score_input = tkinter.Entry(master = window)
final_score_input.pack()

enter_button = tkinter.Button(master = window, text = "Enter", command = grade_calculator)
enter_button.pack()

output_label = tkinter.Label(master = window)
output_label.pack()

window.mainloop()
