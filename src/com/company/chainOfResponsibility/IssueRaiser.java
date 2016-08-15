package com.company.chainOfResponsibility;


public class IssueRaiser {
    public IReceiver setFirstReceiver;

    public IssueRaiser(IReceiver setFirstReceiver) {
        this.setFirstReceiver = setFirstReceiver;
    }

    public void raiseMessage(Message message) {
        if (setFirstReceiver != null) {
            setFirstReceiver.processMessage(message);
        }
    }
}
