// 2 - wait() function tutorial

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <wait.h>

// this first tutorial show how wait() function work
void wait_tutorial_1() {
    int pid = fork();
    int n;

    if(pid != 0) {
        n = 5;
    } else {
        n = 0;
    }

    if(pid != 0) wait(NULL);

    for(int i = n; i < n + 5; i++) {
        printf("%d ", i);
    }

    if(pid != 0) printf("\n");
}

void wait_tutorial_2() {
    int pid_1 = fork();
    int pid_2 = fork();

    if(pid_1 != 0) {
        if(pid_2 != 0) {
            // he main process waits until all child done first then print
            wait(NULL);
            printf("print from main\n");
        } else {
            printf("print from child\n");
        }
    } else {
        printf("print from child\n");
    }
}

int main(int argc, char* argv[]) {
    
    // wait_tutorial_1();
    wait_tutorial_2();

    return 0;
}