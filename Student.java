package org.example;

import java.util.ArrayList;

public class Student {
    private String nume;
    private double medie;
    ArrayList<String> preferinte = new ArrayList<>();

    public void adaugaPreferinte(String p){

        int index1 = p.indexOf('-');
        int index2 = p.lastIndexOf('-');
        //while (index1 != index2)
        do
        {
            index1 = p.indexOf('-');
            String aux = p.substring(index1 + 2, p.length());
            int index3 = aux.indexOf('-');
            String optiune = p.substring(index1 + 2, index1 + index3 + 1);
            preferinte.add(optiune);
            //System.out.println(optiune);
            p = p.substring(index1 + index3 + 2);

        }while (index1 == index2);

        int last = p.lastIndexOf('-');
        String optiune = p.substring(last + 2, p.length());
        preferinte.add(optiune);
        //System.out.println(optiune);


    }
    public Student() {}
    public Student(String nume) {
        this.nume = nume;
        this.medie = 0.0;
    }
    public Student(String nume, double medie) {
        this.nume = nume;
        this.medie = medie;
    }

    public String getNume() {
        return nume;
    }

    public double getMedie() {
        return medie;
    }

    public void setMedie(double medie) {
        this.medie = medie;
    }

    public void actualizeazaMedieStud(ArrayList<Student> studenti, String numeCautat, double media){
        for (Student student : studenti)
        {
            if(student.getNume().equals(numeCautat)){
                student.setMedie(media);
                break;
            }
        }
    }

}

class StudMaster extends Student{
    private String nume;
    private double medie;
    ArrayList<String> preferinte = new ArrayList<>();

    public void adaugaPreferinte(String p){

        int index1 = p.indexOf('-');
        int index2 = p.lastIndexOf('-');
        //while (index1 != index2)
        do
        {
            index1 = p.indexOf('-');
            String aux = p.substring(index1 + 2, p.length());
            int index3 = aux.indexOf('-');
            String optiune = p.substring(index1 + 2, index1 + index3 + 1);
            preferinte.add(optiune);
            //System.out.println(optiune);
            p = p.substring(index1 + index3 + 2);

        }while (index1 == index2);

        int last = p.lastIndexOf('-');
        String optiune = p.substring(last + 2, p.length());
        preferinte.add(optiune);
        //System.out.println(optiune);


    }
    public StudMaster() {}
    public StudMaster(String nume) {
        this.nume = nume;
        this.medie = 0.0;
    }
    public StudMaster(String nume, double medie) {
        this.nume = nume;
        this.medie = medie;
    }

    public String getNume() {
        return nume;
    }

    public double getMedie() {
        return medie;
    }

    public void setMedie(double medie) {
        this.medie = medie;
    }
}
class StudLicenta extends Student{
    private String nume;
    private double medie;
    ArrayList<String> preferinte = new ArrayList<>();
    public StudLicenta() {}
    public StudLicenta(String nume) {
        this.nume = nume;
    }
    public StudLicenta(String nume, double medie) {
        this.nume = nume;
        this.medie = medie;
    }

    public void adaugaPreferinte(String p){

        int index1 = p.indexOf('-');
        int index2 = p.lastIndexOf('-');
        //while (index1 != index2)
        do
        {
            index1 = p.indexOf('-');
            String aux = p.substring(index1 + 2, p.length());
            int index3 = aux.indexOf('-');
            String optiune = p.substring(index1 + 2, index1 + index3 + 1);
            preferinte.add(optiune);
            //System.out.println(optiune);
            p = p.substring(index1 + index3 + 2);

        }while (index1 == index2);

        int last = p.lastIndexOf('-');
        String optiune = p.substring(last + 2, p.length());
        preferinte.add(optiune);
        //System.out.println(optiune);


    }
    public String getNume() {
        return nume;
    }

    public double getMedie() {
        return medie;
    }

    public void setMedie(double medie) {
        this.medie = medie;
    }
}
