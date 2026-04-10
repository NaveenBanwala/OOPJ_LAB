//SJF (non-preemptive) algorithm implementation in C
#include <stdio.h>
#include <stdlib.h>
typedef struct Process {
    int processID;
    int burstTime;
    struct Process *next;
} Process;
Process* createProcess(int processID, int burstTime) {
    Process *newProcess = (Process *)malloc(sizeof(Process));
    newProcess->processID = processID;
    newProcess->burstTime = burstTime;
    newProcess->next = NULL;
    return newProcess;
}
// Function to add a process to the linked list in sorted order of burst time
void addProcess(Process **head, int processID, int burstTime) {
    Process *newProcess = createProcess(processID, burstTime);
    if (*head == NULL || (*head)->burstTime > burstTime) {
        newProcess->next = *head;
        *head = newProcess;
    } else {
        Process *temp = *head;
        while (temp->next != NULL && temp->next->burstTime <= burstTime) {
            temp = temp->next;
        }
        newProcess->next = temp->next;
        temp->next = newProcess;
    }
}
void printProcesses(Process *head) {
    Process *temp = head;
    while (temp != NULL) {
        printf("Process ID: %d, Burst Time: %d\n", temp->processID, temp->burstTime);
        temp = temp->next;
    }
}
void sjfScheduling(Process *head) {
    Process *temp = head;
    int totalWaitingTime = 0, totalTurnaroundTime = 0, currentTime = 0;
    while (temp != NULL) {
        int waitingTime = currentTime;
        int turnaroundTime = waitingTime + temp->burstTime;
        printf("Process ID: %d, Waiting Time: %d, Turnaround Time: %d\n",
            temp->processID, waitingTime, turnaroundTime);
        totalWaitingTime += waitingTime;
        totalTurnaroundTime += turnaroundTime;
        currentTime += temp->burstTime;
        temp = temp->next;
    }
    printf("Average Waiting Time: %.2f\n", (float)totalWaitingTime / 5);
    printf("Average Turnaround Time: %.2f\n", (float)totalTurnaroundTime / 5);
}
int main() {
    Process *head = NULL;
    // Add processes with process ID and burst time
    addProcess(&head, 1, 10);
    addProcess(&head, 2, 5);
    addProcess(&head, 3, 8);
    addProcess(&head, 4, 6);
    addProcess(&head, 5, 3);
    printf("Process List:\n");
    printProcesses(head);
    printf("\nSJF (Non-Preemptive) Scheduling:\n");
    sjfScheduling(head);
    return 0;
}
