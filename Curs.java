package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Curs<T extends Student>{
    private String denumire;
    private int capacitate;
    private int copieCapacitate;
    private String tipCurs;
    private ArrayList<Student> studentiCurs = new ArrayList<>();

    public void adaugaStudCurs(Student student){
        studentiCurs.add(student);
    }

    public String cautaStudLaCurs(Student student){
        for (Student st : studentiCurs){
            if(st.getNume().contains(student.getNume()))
            {
                return this.denumire;
            }
        }
        return null;
    }

    public Student cautaStudCeaMaiMicaMedie(){
        List<Student> copieStudentiCurs = new ArrayList<>(studentiCurs);
        Collections.sort(copieStudentiCurs, Comparator.comparingDouble(Student::getMedie));
        return copieStudentiCurs.get(0);
    }
    public void afiseazaStudCurs(String file, ArrayList<Student> studentiTotal){
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println("***");
            out.println(this.denumire + "(" + this.capacitateReala() + ")");
            //Collections.sort(studentiCurs, Comparator.comparingDouble(Student::getMedie));
            Collections.sort(studentiCurs, Comparator.comparing(Student::getNume)); //ordine lexicografica pt nume
            for (Student stud : studentiCurs) {
                out.println(stud.getNume() + " - " + stud.getMedie());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Curs(String denumire, int capacitateMaxima) {
        this.denumire = denumire;
        this.capacitate = capacitateMaxima;
        this.copieCapacitate = capacitateMaxima;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getCapacitateMaxima() {
        return capacitate;
    }
    public int capacitateReala() {
        return copieCapacitate;
    }

    public void setCapacitateMic() {
        this.capacitate = this.capacitate - 1;
    }
}
