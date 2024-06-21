todo = ["call", "repair","payment"]

# todo.sort(reverse=False)
temp = [10,20,30]
# adds single item at end of list
todo.append(temp)

# adds multiple items at end of list
todo.extend(temp)

# removes first instance of specific item(value) from list and if not found gives value error
todo.remove(10)

# removes specific item(index) from list and if not found gives out of range error
# and by default it removes last item of list
todo.pop()

todo.insert(2,"yash")

todo.reverse()

other_list = todo.copy()

print(todo)
print(other_list)
print(todo.count(20))

print(todo.index("yash"))

other_list.clear()
print(other_list)

del todo
# print(todo)