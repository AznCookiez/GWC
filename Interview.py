array = [5, 30, 90, 70, 60, 12, 9, 7, 1, 0]

'''
for i in array:
   for j in array:
      if (i+j==100):

         print ("%d + %d = 100!" %(i,j))
'''

for i in range (0, 10):
   for j in range (i, 10):

      iVal = hash(array[i])
      jVal = hash(array[j])

      if (iVal+jVal==100):
         print ("%d + %d = 100!" %(iVal, jVal))

