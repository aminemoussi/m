package com.mycompany.tp6_part2;

public class Service_Teaching implements Service {

    private String Schedule;

    private String EnrolledStudents;

    private String StartDate;

    private String EndDate;

    public Service_Teaching(String schdl, String enrldstd, String startdate, String enddate) {
        this.Schedule = schdl;
        this.EnrolledStudents = enrldstd;
        this.StartDate = startdate;
        this.EndDate = enddate;
    }

    public void get_Schedule() {
        System.out.print(this.Schedule);
    }

    public void set_Schedule(String S) {
        this.Schedule = S;
    }

    public void get_EnrolledStudents() {
        System.out.print(this.EnrolledStudents);
    }

    public void Set_EnrolledStudents(String ES) {
        this.EnrolledStudents = ES;
    }

    public void get_StartDate() {
        System.out.print(this.StartDate);
    }

    public void set_StartDate(String SD) {
        this.StartDate = SD;
    }

    public void get_EndDate() {
        System.out.print(this.EndDate);
    }

    public void set_EndDate(String ED) {
        this.EndDate = ED;
    }

    @Override
    public String FeedBack() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
