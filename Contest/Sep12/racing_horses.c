#include<stdio.h>
#include<stdlib.h>
#include<limits.h>

typedef unsigned long long ull;

struct node {
  ull data;
  struct node* next;
};

// Uses special case code for the head end
void SortedInsert(struct node** headRef, struct node* newNode) {
  // Special case for the head end
  if (*headRef == NULL || (*headRef)->data >= newNode->data) {
    newNode->next = *headRef;
    *headRef = newNode;
  }
  else {
    // Locate the node before the point of insertion
    struct node* current = *headRef;
    while (current->next!=NULL && current->next->data<newNode->data) {
      current = current->next;
    }
    newNode->next = current->next;
    current->next = newNode;
  }
}

int main()
{
  ull num_tests, num_elems;
  scanf("%llu",&num_tests);
  while(num_tests--)
  {
    scanf("%llu",&num_elems);
    struct node **headRef = NULL;
    while(num_elems--)
    {
      struct node *tmp = (struct node *) malloc(sizeof(struct node));
      tmp->next = NULL;
      scanf("%llu",&tmp->data);
      SortedInsert(headRef,tmp);
    }
    struct node* current = *headRef, *next = (*headRef)->next;
    ull min_diff = INT_MAX;
    while (next != NULL) {
      if(next->data - current->data < min_diff)
      {
        min_diff = next->data - current->data;
      }
      current = next;
      next = next->next;
    }
    printf("%llu",min_diff);
  }
return 0;
}
