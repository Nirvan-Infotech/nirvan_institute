pc_parts = ["ram", "hdd", "i3p", "ssd", "gpu"]

# positive indexing
print(pc_parts[2])

# negative indexing
print(pc_parts[-2])

# slicing
print(pc_parts[-4:])

pc_parts[2] = "i5p"

print(pc_parts)

for part in pc_parts:
    print(part)

