// 3 - exec() function tutorial

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

int main(int argc, char* argv[]) {
    
    int pid = fork();
    
    if(pid == 0) {
        printf("print from child\n");
        char* myargs[2];
        myargs[0] = "./hello_world";
        myargs[1] = NULL;
        // move the process to another program (another process)
        execvp(myargs[0], myargs);
        // after moving the process to another program the rest of the instruction will not execute anymore
        printf("this shouldn't print");
    } else {
        wait(NULL);
        printf("print from main\n");
    }
    
    return 0;
}