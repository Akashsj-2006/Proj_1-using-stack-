#include<iostream>
#include<cstring>
using namespace std;
class Stack
{
    public:
    int top;
    int capacity;
    char *arr;
};

Stack *create_Stack(int c)
{
    Stack *stack = new Stack();
    stack->capacity = c;
    stack->top = 0;
    stack->arr = new char[(stack->capacity) * sizeof(char)];
    return stack;
}

int isFull(Stack *stack)
{
    return (stack->capacity == stack->top);
}
int isEmpty(Stack *stack)
{
    return stack->top==0;
}
void push(Stack *stack , int data)
{
    if(isFull(stack))
        return;
    else
        stack->arr[++stack->top] = data;
}
int pop(Stack *stack)
{
    if(isEmpty(stack))
        return -1;
    else
        return stack->arr[stack->top--];
}
//Function to reverse the string
void Reverse(char str[])
{
    int n=strlen(str);
    Stack *stack = create_Stack(n);
    for(int i=0;i<n;i++)
    {
        push(stack,str[i]);
    }
    for(int i=0;i<n;i++)
    {
        str[i]=pop(stack);
    }
}
int main()
{
    char str[]= "Hello World";
    Reverse(str);
    cout<<"\nThe reversed string is:"<<str;
    return 0;
}
