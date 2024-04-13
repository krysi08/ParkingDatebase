package com.example.parkingcardatabase;


import java.util.Calendar;
import java.util.Date;


public class StopTime{

    public void getTicket() throws InterruptedException {
        Date startDate = Calendar.getInstance().getTime();
        //long d_StartTime = new Date().getTime();

        System.out.print("Parking started" + " " + startDate.toString());
    }
    public void returnTicket() throws InterruptedException
    {
        Date endDate = Calendar.getInstance().getTime();
       //long d_endTime = new Date().getTime();

        System.out.print("Parking ended" + " " + endDate.toString());
    }

    public static void main(String[] args) throws InterruptedException {

        StopTime time = new StopTime();

        time.getTicket();
        time.returnTicket();
    }
}
