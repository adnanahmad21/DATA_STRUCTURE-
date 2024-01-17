#include <stdio.h>
#include <string.h>
void main()
{
    char s1[50], s2[50];
    int x, i;
    fgets(s1, 50, stdin);
    x = strlen(s1);
    printf("%d\n", x - 1);
    for (i = 0; i < x - 1; i++)
        s2[i] = s1[x - 2 - i];
    s2[i] = '\0';
    puts(s2);
}