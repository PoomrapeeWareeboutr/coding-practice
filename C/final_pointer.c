/*  -----  Please fill in your information in this comment block -----  
   Student ID: 6388113
   Fullname: Poomrapee Wareeboutr
   Section: 3
---------------------------------------------------------------------- */

#include <stdio.h>

void func_max(int *arr, int n){
  int temp;
  int *p_max, *p_last;
  p_max = &arr[0];
  p_last = &arr[n-1];
  for(int i=0; i<n; i++){
    if(*p_max < arr[i]){
      p_max = &arr[i];
    }
  }
  temp = *p_last;
  *p_last = *p_max;
  *p_max = temp;
}

void func_min(int *arr, int n){
  int temp;
  int *p_min, *p_first;
  p_min = &arr[0];
  p_first = &arr[0];
  for(int i=0; i<n; i++){
    if(*p_min > arr[i]){
      p_min = &arr[i];
    }
  }
  temp = *p_first;
  *p_first = *p_min;
  *p_min = temp;
}
  
void print_output(int *arr, int n){
  for (int i=0 ; i<n ; i++) {
        printf("%d ", arr[i]);
    }
}

void input_array(int *arr, int n){
  for (int i=0 ; i<n ; i++) {
        scanf("%d", &arr[i]);
    }
}

int main() {
    /*
        Ask a user to input 2 integer arrays
    */
    int n1;
    scanf("%d", &n1);
    int arr1[n1];
    input_array(arr1, n1);
    
    int n2;
    scanf("%d", &n2);
    int arr2[n2];
    input_array(arr2, n2);

    /*
        Print the values of the arrays
    */
    printf("Before swap min and max\n");
    printf("arr1: ");
    print_output(arr1, n1);
    printf("\n");

    printf("arr2: ");
    print_output(arr2, n2);
    printf("\n");

    /*
        For each array:
          - Swap the maximum value with the last element using a pointer
          - Swap the minimum value with the first element using a pointer
    */
    
    // Arrar 1
    func_max(arr1, n1);
    func_min(arr1, n1);
    
    // Arrar 2
    func_max(arr2, n2);
    func_min(arr2, n2);

    /*
        Print the values of the arrays
    */
    printf("After swap min and max\n");
    printf("arr1: ");
    // Print Array 1
    print_output(arr1, n1);
    printf("\n");
    printf("arr2: ");
    // Print Array 2
    print_output(arr2, n2);
    printf("\n");

    return 0;
}