// QuestionNO 1. FCFS SCHEDULING IN C
#include<stdio.h>
#include<stdlib.h>
typedef struct Process{
    int processID;
    int burstTime;
    struct Process *next;
} P;
P* createProcess(int processID, int burstTime) {
    P * newProcess = (P *)malloc(sizeof(P));
    newProcess->processID = processID;
    newProcess->burstTime = burstTime;
    newProcess->next = NULL;
    return newProcess;
}
void addProcess(P **head,int processID,int burstTime) {
    P *newProcess = createProcess(processID, burstTime);
    if (*head == NULL) {
        *head = newProcess;
    } else {
        P *temp=*head;
        while(temp->next!=NULL) {
            temp=temp->next;
        }
        temp->next=newProcess;
    }
}
void printProcesses(P *head){
    P *temp=head;
    while(temp != NULL) {
        printf("Process ID: %d, Burst Time: %d\n", temp->processID, temp->burstTime);
        temp=temp->next;
    }
}
void fcfsScheduling(P *head){
    P *temp=head;
    int totalWaitingTime=0,totalTurnaroundTime=0,currentTime=0;

    while(temp!=NULL){
        int waitingTime=currentTime;
        int turnaroundTime= waitingTime + temp->burstTime;
        printf("Process ID: %d,Waiting Time: %d,Turnaround Time:%d\n",
            temp->processID, waitingTime, turnaroundTime);
        totalWaitingTime += waitingTime;
        totalTurnaroundTime+=turnaroundTime;
        currentTime+=temp->burstTime;
        temp=temp->next;
    }
    printf("Average Waiting Time: %.2f\n",(float)totalWaitingTime/3);
    printf("Average Turnaround time: %.2f\n",(float)totalTurnaroundTime/3);
}
int main() {
    P *head = NULL;
    addProcess(&head,1,10);
    addProcess(&head,2,5);
    addProcess(&head,3,8);
    printf("Process List:\n");
    printProcesses(head);
    printf("\nFCFS Scheduling:\n");
    fcfsScheduling(head);
    return 0;
}