package com.itstep.lesson._5;

public class main {
    public static void main(String[] args) {
        Address addressOb = new Address();
        addressOb.street = "Strada Calea Iesilor 8";
        addressOb.houseNumber = 3;
        addressOb.city = "Chisinau";
        addressOb.country = "Moldova";
     addressOb.restAtHome();

        Job job1 = new Job();
        job1.major = "accountant";
        job1.address = "Strada Arborilor 21,Chisinau";
     job1.go_to_job();

        Human human1 =new Human();
        human1.firstName="Adriana";
        human1.secondName="Iurcu";
        human1.age=20;
      //  human1.homeAddress="Strada Calea Iesilor";
        human1.myJob=job1;
        human1.myAddress= addressOb;
      human1.about_me();
    }
}