package Lecture_27_Recursion_Assignment_6;
import java.util.*;
public class Dictionary_Order_Small {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str = { 'C', 'A', 'B' };
		sortedPermutations(str);
	}
	static int findCeil(char[] str, char first, int l,
            int h)
{
// initialize index of ceiling element
int ceilIndex = l;

// Now iterate through rest of the elements and find
// the smallest character greater than 'first'
for (int i = l; i <= h; i++)
if (str[i] > first && str[i] < str[ceilIndex])
ceilIndex = i;

return ceilIndex;
}

// Print all permutations of str in sorted order
static void sortedPermutations(char[] str)
{
// Get size of string
int size = str.length;


Arrays.sort(str);

// Print permutations one by one
boolean isFinished = false;
while (!isFinished) {
// print this permutation
System.out.println(String.valueOf(str));


int i;
for (i = size - 2; i >= 0; --i)
if (str[i] < str[i + 1])
break;


if (i == -1)
isFinished = true;
else {

int ceilIndex = findCeil(str, str[i], i+1, size-1);

// Swap first and second characters
char temp = str[i];
str[i] = str[ceilIndex];
str[ceilIndex] = temp;

// Sort the string on right of 'first char'
Arrays.sort(str, i+1, size);
}
}
}


}

