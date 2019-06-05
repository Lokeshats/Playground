#include<stdio.h>
int main()
{
int dividend=365,divisor=4,Quotient,Remainder;
  Quotient= dividend/divisor;
  Remainder= dividend%divisor;
  printf("Quotient: %d\nRemainder: %d",Quotient,Remainder);
  return 0;
}