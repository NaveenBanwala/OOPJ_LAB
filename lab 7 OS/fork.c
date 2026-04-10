// 1.Create different process tree using fork system call
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

int main() {
    pid_t pid1, pid2;

    pid1 = fork();

    if (pid1 == 0) {
        // Child 1
        printf("Child 1 (PID: %d, Parent PID: %d)\n", getpid(), getppid());
        pid2 = fork();
        if(pid2 == 0){
            //Grand child.
            printf("Grand Child (PID: %d, Parent PID: %d)\n", getpid(), getppid());
        } else if(pid2 > 0){
            wait(NULL);
        }
    } else if (pid1 > 0) {
        // Parent
        printf("Parent (PID: %d)\n", getpid());
        wait(NULL);
    } else {
        fprintf(stderr, "Fork failed!\n");
        return 1;
    }

    return 0;
}