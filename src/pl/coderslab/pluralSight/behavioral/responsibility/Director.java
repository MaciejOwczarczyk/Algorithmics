package pl.coderslab.pluralSight.behavioral.responsibility;

public class Director extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Director can approve conferences");
        } else {
            successor.handleRequest(request);
        }
    }
}
