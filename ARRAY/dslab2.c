
#include <stdio.h>
#include <malloc.h>
struct node
{
    int data;
    struct node *next;
} *head = NULL, *newnode, *temp;
void insert(int);
void insertAtbeg(int);
void insertAtLast(int);
void insertAtpos(int);
void Traverse();
int main()
{
    int i = 0, value = 5, count = 0, v1;
    int choice;
    while (i < 11)
    {
        i++;
        insert(5 * i);
        count++;
    }
    Traverse();
    while (1)
    {
        printf("\nEnter Choice \n 1-> for insert at beg  \n 2-> for insert at last \n 3-> for insert at specific position\n 4-> to exit\n");
        scanf("%d", &choice);
        if (choice == 1)
        {
            printf("Enter value to be added at beginning");
            scanf("%d", &value);
            insertAtbeg(value);
        }
        else if (choice == 2)
        {
            printf("Enter value to be added at Last");
            scanf("%d", &v1);
            insertAtLast(v1);
        }

        else if (choice == 3)
        {
            printf("\nEnter position :");
            int pos;
            scanf("%d", &pos);
            if (pos > count)
                printf("Invalid pos");
            else
                insertAtpos(pos);
            printf("\n");
        }
        else if (choice == 4)
            break;
        else
            printf("not a valid choice");
    }
    Traverse();
}
void insert(int i)
{
    newnode = (struct node *)malloc(sizeof(struct node));
    newnode->data = i;
    newnode->next = NULL;
    if (head == 0)
    {
        head = newnode;
        temp = newnode;
    }
    else
    {
        temp->next = newnode;
        temp = newnode;
    }
}

void insertAtbeg(int value)
{
    newnode = (struct node *)malloc(sizeof(struct node));
    newnode->data = value;
    newnode->next = head;
    head = newnode;
}
void insertAtLast(int value)
{
    temp = head;
    while (temp->next != 0)
        temp = temp->next;
    newnode = (struct node *)malloc(sizeof(struct node));
    temp->next = newnode;
    newnode->data = value;
    newnode->next = 0;
}
void insertAtpos(int pos)
{
    int i = 1;
    temp = head;
    newnode = (struct node *)malloc(sizeof(struct node));
    printf("Enter data  :");
    scanf("%d", &newnode->data);
    newnode->next = 0;
    while (i < pos)
    {
        temp = temp->next;
        i++;
    }
    newnode->next = temp->next;
    temp->next = newnode;
}
void Traverse()
{
    temp = head;
    while (temp != 0)
    {
        printf("%d ", temp->data);
        temp = temp->next;
    }
}
