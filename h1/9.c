/*
#school - ����
#class - 11�
#num - 19
#name - ���� �������� ������
#task - �� �� ��������� ��������, ����� ������� �� ����������� �� ������ ����� x, ������ 0<x<1. �� �� ������ ������� �� ���� �������� �������� � ���:
4-4/3+4/5-4/7+4/9-4/11+...4/N. ���������� � ��� ����� ��� 4/N<x. ���������� �������� �� �� �� �� ������ �� ������.
*/

#include<stdio.h>

float pi(float value, int inc, int swtch, float x2);

int main()
{   
    float x;
    for(x=0; (x<=0)||(x>=1);) scanf("%f", &x);
    printf("%f", pi(4, 3, 0, x));    
    system("pause");
    return 0;

}
    
float pi(float value, int inc, int swtch, float x2)
{
      float var=(float)4/inc;
      if(var < x2) return value; //proverka za uslovie izlizane ot rekursiqta i vrushtane na subranata stoinost
      else
      if(swtch==1) return(pi(value+var, inc+2, 0, x2));//sluchay sus plus
      else
      return(pi(value-var, inc+2, 1, x2));//sluchay sus minus
}

