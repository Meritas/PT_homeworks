/*
#school - ����
#class - 11�
#num - 19
#name - ���� �������� ������
#task - �� �� ��������� ��������, ����� ������� �� ����������� �� ������ ��� ����������� �����, x � y, ������ x < y.
�� �� ������ ������ �� ������ ������� ����� � ��������� [x,y].
*/

#include<stdio.h>
int main()
{
    int x, y, i, sum;
    scanf("%d", &x);
    for(y = 0; y <= x;) scanf("%d", &y);
    sum=0;
    for(i=x; i<=y; i++)
    if(i%2!=0) sum+=i;
    printf("%d\n", sum);
    system("pause");
    return 0;
}
