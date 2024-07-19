package org.example;

public class Response {// גייסון החיצוני
    private boolean success;
    private Integer errorCode;
    private String extra;
    private  List<TaskModel> tasks;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public java.lang.Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(java.lang.Integer errorCode) {
        this.errorCode = errorCode;
    }

    public List<TaskModel> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskModel> tasks) {
        this.tasks = tasks;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}
