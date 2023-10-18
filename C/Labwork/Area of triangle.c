#include<stdio.h>
#include<math.h>
void main() {
    double a, b, c;
    double area, circumference;

    printf("Enter first side (a): ");
    scanf("%lf", &a);

    printf("Enter second side (b): ");
    scanf("%lf", &b);

    printf("Enter third side (c): ");
    scanf("%lf", &c);

    circumference = a + b + c;

    double s = circumference / 2.0;

    area = sqrt(s * (s - a) * (s - b) * (s - c));

    printf("Circumference: %.2lf\n", circumference);
    printf("Area: %.2lf\n", area);

}