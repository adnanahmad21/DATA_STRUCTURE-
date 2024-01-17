#include <stdio.h>
#define size1 6
#define size2 6
int *input(int *, int);
int *sort(int *, int);
void display(int *a, int size)
{
    printf("[ ");
    for (int i = 0; i < size; i++)
        printf("%d ", a[i]);
    printf("]");
}
int *merge(int *, int, int *, int *);

int main()
{
    int a[size1];
    int b[size2];
    int mrg[size1 + size2];
    printf("Enter array a\n");
    input(a, size1);
    printf("Enter array b\n");
    input(b, size2);
    sort(a, size1);
    sort(b, size2);
    printf("your array  a is :\n");
    display(a, size1);
    printf("\n");
    printf("your array  b is :\n");
    display(b, size2);
    printf("\nMERGE ARRAY : :\n");
    merge(mrg, size1 + size2, a, b);
    display(mrg, size1 + size2);
}
int *input(int *a, int size)
{
    for (int i = 0; i < size; i++)
        scanf("%d", &a[i]);
    return a;
}

int *sort(int *a, int size)
{
    int i, j;
    for (i = 0; i < size; i++)
    {
        for (j = i + 1; j < size; j++)
        {
            if (a[i] > a[j])
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    return a;
}
int *merge(int *mrg, int size, int *a, int *b)
{
    int j = 0;
    for (int i = 0; i < size; i++)
    {
        if (i < size1)
            mrg[i] = a[i];
        else if (i >= size1)
        {
            mrg[i] = b[j];
            j++;
        }
    }

    sort(mrg, size1 + size2);
    return mrg;
}