#include <stdio.h>
void display(int a[], int);
void reverse(int a[], int);
void rotate(int a[], int, int);
int main()
{
    int a[50];
    int size, i, k;
    printf("Enter Size : ");
    scanf("%d", &size);
    printf("Enter how many turn  to rotate : ");
    scanf("%d", &k);
    printf("Enter Array :\n ");
    for (i = 0; i < size; i++)
        scanf("%d", &a[i]);
    printf("\n");
    display(a, size);
    printf("\n");
    reverse(a, size);
    display(a, size);
    printf("\n");
    k = k % size;
    
    rotate(a, size, k);
    display(a, size);
}

void display(int a[], int size)
{
    int i;
    for (i = 0; i < size; i++)
        printf("%d ", a[i]);
    return;
}
void reverse(int a[], int size)
{
    int i, temp;
    for (i = 0; i < size/2; i++)
    {
        temp = a[i];
        a[i] = a[size - 1 - i];
        a[size - i - 1] = temp;
    }
    return;
}
void rotate(int a[], int size,int k)
{
    int i,j=size-1, temp;
    for (i = k ; i<j; i++,j--)
    {
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    return;
}