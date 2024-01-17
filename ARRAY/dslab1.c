#include <stdio.h>
#include <stdlib.h>
#define SIZE 100
void deleteAtBeg(int *a, int x, int size);
void deleteAtLast(int *a, int x, int size);
void deleteAtpos(int *a, int pos, int x, int size);
void display(int *a, int n)
{
    printf("Your Array is =>  ");
    printf("[ ");
    for (int i = 0; i < n; i++)
        printf("%d ", a[i]);
    printf("]");
}

int main()
{
    int arr[SIZE];
    int i, x, pos, n = 10;
    int choice;

    for (i = 1; i < 11; i++)
        arr[i - 1] = 5 * i;
    while (1)
    {
        printf("\nEnter Choice \n 1-> for insert at beg  \n 2-> for insert at last \n 3-> for insert at specific position\n 4-> to exit\n");
        scanf("%d", &choice);
        if (choice == 1)
        {
            printf("Enter value to be added at beginning");
            scanf("%d", &x);
            insertAtBeg(arr, x, n);
            n++;
        }
        else if (choice == 2)
        {
            printf("Enter value to be added at Last");
            scanf("%d", &x);
            insertAtLast(arr, x, n);
            n++;
        }

        else if (choice == 3)
        {
            printf("\nEnter position :");
            int pos;
            scanf("%d", &pos);
            if (pos > n)
                printf("Invalid pos");
            else
            {
                printf("Enter value to be added ");
                scanf("%d", &x);
                insertAtpos(arr, pos, x, n);
                printf("\n");
                n++;
            }
        }
        else if (choice == 4)
            break;
        else
            printf("not a valid choice");
    }

    display(arr, n);

    return 0;
}
void insertAtBeg(int *a, int x, int size)
{
    for (int i = size; i >= 0; i--)
    {
        a[i + 1] = a[i];
    }

    a[0] = x;
}
void insertAtpos(int *a, int pos, int x, int size)
{

    for (int i = size; i > pos + 1; i--)
    {
        a[i + 1] = a[i];
    }
    a[pos] = x;
}
void insertAtLast(int *a, int x, int size)
{

    if (size > SIZE)
        printf("Not ENough Size");
    else
        a[size] = x;
}