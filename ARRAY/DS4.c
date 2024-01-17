#include <stdio.h>
#define size 10
void delete(int *, int);
void display(int *a, int s)
{
    printf("[ ");
    for (int i = 0; i < s; i++)
        printf("%d ", a[i]);
    printf(" ]\n");
}
void main()
{
    int a[size];
    int i, j, duplicate = 0;
    printf("Enter Array\n");
    for (i = 0; i < size; i++)
        scanf("%d", &a[i]);
    display(a, size);
    for (i = 0; i < size; i++)
    {
        for (j = i + 1; j < size; j++)
        {
            if (a[i] == a[j])
            {
                delete (a, j);
                duplicate++;
            }
        }
    }
    display(a, size - duplicate);
}
void delete(int *a, int pos)
{
    for (int i = pos; i < size; i++)
    {
        a[i] = a[i + 1];
    }
}