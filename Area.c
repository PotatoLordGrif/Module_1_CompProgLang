#include <stdio.h>
int main(){
    float pi = 3.14;
    float radius = 3.5;
    float result;
    result = pi * radius * radius;
    printf("The area of a circle with a radius of %.2f is %.3f",radius,result);
}