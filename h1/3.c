/*
#school - ����
#class - 11�
#num - 19
#name - ���� �������� ������
#task - �� �� ��������� ��������, ����� ������� �� ����������� �� ������ ��� ����������� �����, x � y, ������ x < y. �� �� ������� � ������� ������ ������ ����� ���������� �� 3 � �������� [x,y].
*/

#include<stdio.h>
#include<stdlib.h>
int main()
{
    int x,y,i,sum=0;
    div_t divresult;
    scanf("%d", &x);
    for(y=0;y<=x;) scanf("%d", &y);
    for(i=x;i<=y;i++)
    {
          divresult = div(i,10);
          if(divresult.rem == 3) sum+=i;
    }
    printf("%d", sum);
    system("pause");
    return 0;
}
