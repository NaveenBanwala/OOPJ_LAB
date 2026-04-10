#include <stdio.h>
#include <stdlib.h>
typedef struct Process {
    int pid, arrival_time, burst_time, remaining_time, waiting_time, turnaround_time, completion_time;
    struct Process *next;
} Process;
Process* createProcess(int pid, int arrival, int burst) {
    Process* newProcess = (Process*)malloc(sizeof(Process));
    newProcess->pid = pid;
    newProcess->arrival_time = arrival;
    newProcess->burst_time = burst;
    newProcess->remaining_time = burst;
    newProcess->waiting_time = 0;
    newProcess->turnaround_time = 0;
    newProcess->completion_time = 0;
    newProcess->next = NULL;
    return newProcess;
}
void insertProcess(Process** head, Process* newProcess) {
    if (*head == NULL || (*head)->arrival_time > newProcess->arrival_time) {
        newProcess->next = *head;
        *head = newProcess;
    } else {
        Process* temp = *head;
        while (temp->next != NULL && temp->next->arrival_time <= newProcess->arrival_time) {
            temp = temp->next;
        }
        newProcess->next = temp->next;
        temp->next = newProcess;
    }
}
Process* getShortestJob(Process* head, int current_time) {
    Process* shortest = NULL;
    while (head != NULL) {
        if (head->arrival_time <= current_time && head->remaining_time > 0) {
            if (shortest == NULL || head->remaining_time < shortest->remaining_time) {
                shortest = head;
            }
        }
        head = head->next;
    }
    return shortest;
}
void preemptiveSJF(Process* head, int n) {
    int current_time = 0, completed = 0;
    Process* current_process = NULL;

    while (completed < n) {
        current_process = getShortestJob(head, current_time);

        if (current_process == NULL) {
            current_time++;
            continue;
        }
        current_process->remaining_time--;
        current_time++;

        if (current_process->remaining_time == 0) {
            completed++;
            current_process->completion_time = current_time;
            current_process->turnaround_time = current_process->completion_time - current_process->arrival_time;
            current_process->waiting_time = current_process->turnaround_time - current_process->burst_time;
        }
    }
}
void displayProcesses(Process* head) {
    printf("\nPID\tAT\tBT\tCT\tTAT\tWT\n");
    while (head != NULL) {
        printf("%d\t%d\t%d\t%d\t%d\t%d\n", head->pid, head->arrival_time, head->burst_time, 
            head->completion_time, head->turnaround_time, head->waiting_time);
        head = head->next;
    }
}
int main() {
    Process* head = NULL;
    int n, i, arrival, burst;

    printf("Enter the number of processes: ");
    scanf("%d", &n);

    for (i = 0; i < n; i++) {
        printf("Enter arrival time and burst time for process %d: ", i + 1);
        scanf("%d %d", &arrival, &burst);
        insertProcess(&head, createProcess(i + 1, arrival, burst));
    }
    preemptiveSJF(head, n);
    displayProcesses(head);
    return 0;
}
