package com.example.StudentGrade.domin;

public class Student {
	private int s1;
    private int s2;
    private int s3;
    private int s4;
    private int s5;

    public int getS1() {
        return s1;
    }

    public void setS1(int s1) {
        this.s1 = s1;
    }

    public int getS2() {
        return s2;
    }

    public void setS2(int s2) {
        this.s2 = s2;
    }

    public int getS3() {
        return s3;
    }

    public void setS3(int s3) {
        this.s3 = s3;
    }

    public int getS4() {
        return s4;
    }

    public void setS4(int s4) {
        this.s4 = s4;
    }

    public int getS5() {
        return s5;
    }

    public void setS5(int s5) {
        this.s5 = s5;
    }

    public int getTotal() {
        return s1 + s2 + s3 + s4 + s5;
    }

    public double getAvg() {
    	int total=s1 + s2 + s3 + s4 + s5;
        double avg=(total) / 5;
        return avg;
    }

    public String getGrade() {
        String grade;
        int total=s1 + s2 + s3 + s4 + s5;
        double avg = total / 5;

        
            if (avg >= 40 && avg <= 60) {
                grade = "C";
            } else if (avg >= 61 && avg <= 75) {
                grade = "B";
            } else if (avg >= 76 && avg <= 100) {
                grade = "A";
            } else {
                grade = "Please recalculate marks";
            }
       
        return grade;
    }

}
