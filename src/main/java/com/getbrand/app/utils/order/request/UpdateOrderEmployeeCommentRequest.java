package com.getbrand.app.utils.order.request;

public class UpdateOrderEmployeeCommentRequest {
    private String employeeComment;

    public UpdateOrderEmployeeCommentRequest() {};

    public UpdateOrderEmployeeCommentRequest(String employeeComment) {
        this.employeeComment = employeeComment;
    }

    public String getEmployeeComment() {
        return employeeComment;
    }

    public void setEmployeeComment(String employeeComment) {
        this.employeeComment = employeeComment;
    }
}
