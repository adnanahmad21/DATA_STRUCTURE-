#include <stdio.h>
#include <limits.h>
#include <stdlib.h>
#include <string.h>
int main()
{
    int a[10], i;
    for (i = 0; i < 10; i++)
        scanf("%d", &a[i]);
    int max;
    max = a[0];
    for (int i = 0; i < 10; i++)
    {
        if (max < a[i])
            max = a[i];
    }
        printf("First Maximum = %d\n", max);
    for (int i = 0; i < 10; i++)
    {
        if(a[i]==max)
        a[i]=INT_MIN;
    }


    max = INT_MIN;
    for (i = 0; i < 10; i++)
    {
        if (a[i] > max)
            max = a[i];
    }
    printf("Second Maximum = %d",max);
}