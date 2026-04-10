// 2.Write a program where a process waits for all its child processes
// Note: “child has terminated”--- this sentence does not print before “1.Hello from child”because of wait.
#include <stdio.h>
#include <stdlib.h>
#include <sys/wait.h>
#include <unistd.h>

int main() {
    pid_t child_pids[3]; // Assuming 3 child processes
    int i;
    int status;

    for (i = 0; i < 3; i++) {
        child_pids[i] = fork();

        if (child_pids[i] == 0) {
            // Child process
            printf("Child %d (PID: %d) started\n", i + 1, getpid());
            sleep(2); // Simulate some work
            printf("Child %d (PID: %d) finished\n", i + 1, getpid());
            exit(i + 1); // Child exits with a status
        } else if (child_pids[i] < 0) {
            fprintf(stderr, "Fork failed!\n");
            return 1;
        }
    }

    // Parent waits for all children
    for (i = 0; i < 3; i++) {
        wait(&status);
        printf("Parent: Child %d terminated with status %d\n", i + 1, WEXITSTATUS(status));
    }

    return 0;
}