testcases=int(input())
set = set()
for x in range(0, testcases):
    s, t = [int(x) for x in input().split()]
    for x in range(s, t+1):
        set.add(x)
print(len(set))
