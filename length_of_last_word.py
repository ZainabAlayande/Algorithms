the_string = "Hello World"
strip = the_string.strip()
reverse_the_string = strip[::-1]
empty_list = []

for i in reverse_the_string:
    if i == " ":
        break
    empty_list.append(i)

print(len(empty_list))


