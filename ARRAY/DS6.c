#include <stdio.h>
int main()
{
    char a[5];

    int i;
    for (i = 0; i <5; i++)
        scanf("%c", &a[i]);
    int sum = 0;
    for (i = 0; i < 5; i++)
    {
        if (a[i] >= 65)
            sum += a[i];
        else
            sum += a[i] - 48;
    }
    printf("%d", sum);
}
