package com.company.chainOfResponsibility;

/**
 * Test chain of responsibility
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("*** Chain of responsibility ***");
        IReceiver emailHandler = new EmailErrorHandler(null);
        IReceiver faxHandler = new FaxErrorHandler(emailHandler);

        IssueRaiser raiser = new IssueRaiser(faxHandler);
        Message m1 = new Message("Fax is reaching late to the destination!", MessagePriority.NORMAL);
        Message m2 = new Message("Email is not going", MessagePriority.HIGH);
        Message m3 = new Message("Email is lost some data", MessagePriority.NORMAL);
        Message m4 = new Message("Fax is not reached destination", MessagePriority.HIGH);

        raiser.raiseMessage(m1);
        raiser.raiseMessage(m2);
        raiser.raiseMessage(m3);
        raiser.raiseMessage(m4);
    }
}
