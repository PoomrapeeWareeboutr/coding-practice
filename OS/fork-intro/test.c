#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main(int argc, char* argv[]) {
    
    int pid = fork();
    for(int i = 0; i < 2; i++) {
        if(pid > 0) {
            pid = fork();
        }
    }
    
    printf("[%d] Hello World!\n", pid);
    return 0;
}
