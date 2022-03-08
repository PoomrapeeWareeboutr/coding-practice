// 1 - fork() function tutorial

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

void fork_tutorial_1() {
    // the number of times to print 'Hello World!' is 2^n 
    // 2^3 = 8 times;
    fork();
    fork();
    fork();
    printf("Hello World!\n");
}

void fork_tutorial_2() {
    int pid_1 = fork();

    // pid 2 is calculated with the same concept of the pid 1
    int pid_2 = fork();
    printf("[%05d, %05d] Hello World!\n", pid_1, pid_2);
}

int main(int argc, char* argv[]) {

    fork_tutorial_1();
    // fork_tutorial_2();
    return 0;
}

