#include <stdio.h>
int factorial(int);
int main()
{
int num;
int result;
scanf("%d", &num);
if (num < 0)
{
printf("Factorial of negative number not possible\n");
}
else
{
result = factorial(num);
printf("%d\n", result);
}
return 0;
}
int factorial(int num)
{
if (num == 0 || num == 1)
{
return 1;
}
else
{
return(num * factorial(num - 1));
}
}