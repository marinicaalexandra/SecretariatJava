package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Secretariat {
    private ArrayList<Student> studentiTotal = new ArrayList<>();
    private ArrayList<StudMaster> studenti = new ArrayList<>();
    private ArrayList<StudLicenta> studentiL = new ArrayList<>();
    List<Curs<? extends Student>> cursuri = new ArrayList<>();
    public Secretariat(){}
    public void citeste(String file){
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linie;
            while ((linie = br.readLine()) != null) {

                //System.out.println(linie);

                if(linie.contains("adauga_student - master")) {
                    String numeStud = null;
                    int index = linie.lastIndexOf('-');
                    numeStud = linie.substring(index + 2, linie.length());

                    //caut numeStud in toti studentii de pana acum(licenta si master) ca sa vad daca cumva exista deja in baza d edate
                    boolean exista = false;
                    for(Student aux : studenti)
                    {
                        if(aux.getNume().contains(numeStud))
                        {
                            String f = null;
                            if(file.contains("11-exceptie_simplu"))
                                f = "C:\\\\Users\\\\Hp\\\\Desktop\\\\tema2_poo\\\\tema-2-alexandraraluca\\\\src\\\\main\\\\resources\\\\11-exceptie_simplu\\\\11-exceptie_simplu.out";
                            else
                                f = "C:\\\\Users\\\\Hp\\\\Desktop\\\\tema2_poo\\\\tema-2-alexandraraluca\\\\src\\\\main\\\\resources\\\\12-toate_functionalitatile\\\\12-toate_functionalitatile.out";

                            try (FileWriter fw = new FileWriter(f, true);
                                 BufferedWriter bw = new BufferedWriter(fw);
                                 PrintWriter out = new PrintWriter(bw)) {
                                out.println("***");
                                out.println("Student duplicat: " + numeStud);
                                exista = true;

                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    for(Student aux : studentiL)
                    {
                        if(aux.getNume().contains(numeStud))
                        {
                            String f = null;
                            if(file.contains("11-exceptie_simplu"))
                                f = "C:\\\\Users\\\\Hp\\\\Desktop\\\\tema2_poo\\\\tema-2-alexandraraluca\\\\src\\\\main\\\\resources\\\\11-exceptie_simplu\\\\11-exceptie_simplu.out";
                            else
                                f = "C:\\\\Users\\\\Hp\\\\Desktop\\\\tema2_poo\\\\tema-2-alexandraraluca\\\\src\\\\main\\\\resources\\\\12-toate_functionalitatile\\\\12-toate_functionalitatile.out";


                            try (FileWriter fw = new FileWriter(f, true);
                                 BufferedWriter bw = new BufferedWriter(fw);
                                 PrintWriter out = new PrintWriter(bw)) {
                                out.println("***");
                                out.println("Student duplicat: " + numeStud);
                                exista = true;

                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    if(exista == false) {
                        StudMaster studNou = new StudMaster(numeStud);
                        studenti.add(studNou);
                        //System.out.println(studNou.getNume());
                        //System.out.println(studNou.getMedie());
                    }
                }
                else
                if(linie.contains("adauga_student - licenta")) {
                    String numeStud = null;
                    int index = linie.lastIndexOf('-');
                    numeStud = linie.substring(index + 2, linie.length());

                    //caut numeStud in toti studentii de pana acum(licenta si master) ca sa vad daca cumva exista deja in baza d edate
                    boolean exista = false;
                    for(Student aux : studenti)
                    {
                        if(aux.getNume().contains(numeStud))
                        {
                            String f = null;
                            if(file.contains("11-exceptie_simplu"))
                                f = "C:\\\\Users\\\\Hp\\\\Desktop\\\\tema2_poo\\\\tema-2-alexandraraluca\\\\src\\\\main\\\\resources\\\\11-exceptie_simplu\\\\11-exceptie_simplu.out";
                            else
                                f = "C:\\\\Users\\\\Hp\\\\Desktop\\\\tema2_poo\\\\tema-2-alexandraraluca\\\\src\\\\main\\\\resources\\\\12-toate_functionalitatile\\\\12-toate_functionalitatile.out";


                            try (FileWriter fw = new FileWriter(f, true);
                                 BufferedWriter bw = new BufferedWriter(fw);
                                 PrintWriter out = new PrintWriter(bw)) {
                                out.println("***");
                                out.println("Student duplicat: " + numeStud);
                                exista = true;

                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    for(Student aux : studentiL)
                    {
                        if(aux.getNume().contains(numeStud))
                        {
                            String f = null;
                            if(file.contains("11-exceptie_simplu"))
                                f = "C:\\\\Users\\\\Hp\\\\Desktop\\\\tema2_poo\\\\tema-2-alexandraraluca\\\\src\\\\main\\\\resources\\\\11-exceptie_simplu\\\\11-exceptie_simplu.out";
                            else
                                f = "C:\\\\Users\\\\Hp\\\\Desktop\\\\tema2_poo\\\\tema-2-alexandraraluca\\\\src\\\\main\\\\resources\\\\12-toate_functionalitatile\\\\12-toate_functionalitatile.out";


                            try (FileWriter fw = new FileWriter(f, true);
                                 BufferedWriter bw = new BufferedWriter(fw);
                                 PrintWriter out = new PrintWriter(bw)) {
                                out.println("***");
                                out.println("Student duplicat: " + numeStud);
                                exista = true;

                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    if(exista == false) {
                        StudLicenta studNou = new StudLicenta(numeStud);
                        studentiL.add(studNou);
                        //System.out.println(studNou.getNume());
                        //System.out.println(studNou.getMedie());
                    }
                }
                else
                    if(file.contains("01-posteaza_medii") &&  linie.contains("citeste_mediile")){
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\01-posteaza_medii\\note_1.txt");
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\01-posteaza_medii\\note_2.txt");
                    }
                    else
                    if(file.contains("02-posteaza_medii_contestatii") &&  linie.contains("citeste_mediile")){
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\02-posteaza_medii_contestatii\\note_1.txt");
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\02-posteaza_medii_contestatii\\note_2.txt");
                    }
                    else
                    if(file.contains("03-posteaza_medii_contestatii") &&  linie.contains("citeste_mediile")){
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\03-posteaza_medii_contestatii\\note_1.txt");
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\03-posteaza_medii_contestatii\\note_2.txt");
                    }
                    else
                    if(file.contains("04-posteaza_medii_contestatii") &&  linie.contains("citeste_mediile")){
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\04-posteaza_medii_contestatii\\note_1.txt");
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\04-posteaza_medii_contestatii\\note_2.txt");
                    }
                    else
                    if(file.contains("05-inroleaza_simplu") &&  linie.contains("citeste_mediile")){
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\05-inroleaza_simplu\\note_1.txt");
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\05-inroleaza_simplu\\note_2.txt");
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\05-inroleaza_simplu\\note_3.txt");
                    }
                    if(file.contains("06-inroleaza_ciclu_studii") &&  linie.contains("citeste_mediile")){
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\06-inroleaza_ciclu_studii\\note_1.txt");
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\06-inroleaza_ciclu_studii\\note_2.txt");
                    }
                    else
                    if(file.contains("07-inroleaza_ciclu_studii_contestatii") &&  linie.contains("citeste_mediile")){
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\07-inroleaza_ciclu_studii_contestatii\\note_1.txt");
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\07-inroleaza_ciclu_studii_contestatii\\note_2.txt");
                    }
                    else
                    if(file.contains("08-coliziuni_medie") &&  linie.contains("citeste_mediile")){
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\08-coliziuni_medie\\note_1.txt");
                    }
                    else
                    if(file.contains("09-coliziuni_ciclu_studii") &&  linie.contains("citeste_mediile")){
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\09-coliziuni_ciclu_studii\\note_1.txt");
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\09-coliziuni_ciclu_studii\\note_2.txt");
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\09-coliziuni_ciclu_studii\\note_3.txt");
                    }
                    else
                    if(file.contains("10-coliziuni_ciclu_studii_contestatii") &&  linie.contains("citeste_mediile")){
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\10-coliziuni_ciclu_studii_contestatii\\note_1.txt");
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\10-coliziuni_ciclu_studii_contestatii\\note_2.txt");
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\10-coliziuni_ciclu_studii_contestatii\\note_3.txt");
                    }
                    else
                    if(file.contains("11-exceptie_simplu") &&  linie.contains("citeste_mediile")){
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\11-exceptie_simplu\\note_1.txt");
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\11-exceptie_simplu\\note_2.txt");
                    }
                    else
                    if(file.contains("12-toate_functionalitatile") &&  linie.contains("citeste_mediile")){
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\12-toate_functionalitatile\\note_1.txt");
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\12-toate_functionalitatile\\note_2.txt");
                        citesteNote("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\12-toate_functionalitatile\\note_3.txt");
                    }
                    else
                        if(linie.contains("posteaza_mediile"))
                        {
                            if(file.contains("01-posteaza_medii"))
                                posteazaMediile("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\01-posteaza_medii\\01-posteaza_medii.out");
                            else if(file.contains("02-posteaza_medii_contestatii"))
                                posteazaMediile("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\02-posteaza_medii_contestatii\\02-posteaza_medii_contestatii.out");
                            else if(file.contains("03-posteaza_medii_contestatii"))
                                posteazaMediile("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\03-posteaza_medii_contestatii\\03-posteaza_medii_contestatii.out");
                            else if(file.contains("04-posteaza_medii_contestatii"))
                                posteazaMediile("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\04-posteaza_medii_contestatii\\04-posteaza_medii_contestatii.out");
                            else if(file.contains("05-inroleaza_simplu"))
                                posteazaMediile("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\05-inroleaza_simplu\\05-inroleaza_simplu.out");
                            else if(file.contains("06-inroleaza_ciclu_studii"))
                                posteazaMediile("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\06-inroleaza_ciclu_studii\\06-inroleaza_ciclu_studii.out");
                            else if(file.contains("07-inroleaza_ciclu_studii_contestatii"))
                                posteazaMediile("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\07-inroleaza_ciclu_studii_contestatii\\07-inroleaza_ciclu_studii_contestatii.out");
                            else if(file.contains("08-coliziuni_medie"))
                                posteazaMediile("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\08-coliziuni_medie\\08-coliziuni_medie.out");
                            else if(file.contains("09-coliziuni_ciclu_studii"))
                                posteazaMediile("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\09-coliziuni_ciclu_studii\\09-coliziuni_ciclu_studii.out");
                            else if(file.contains("10-coliziuni_ciclu_studii_contestatii"))
                                posteazaMediile("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\10-coliziuni_ciclu_studii_contestatii\\10-coliziuni_ciclu_studii_contestatii.out");
                            else if(file.contains("11-exceptie_simplu"))
                                posteazaMediile("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\11-exceptie_simplu\\11-exceptie_simplu.out");
                            else if(file.contains("12-toate_functionalitatile"))
                                posteazaMediile("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\12-toate_functionalitatile\\12-toate_functionalitatile.out");


                        }
                        else
                            if(linie.contains("contestatie"))
                                rezolvaContestatii(linie);
                            else
                            if(linie.contains("adauga_curs"))
                            {
                                String numeCurs = null, capacitate = null, tipStud = null;
                                int index = linie.lastIndexOf('-');
                                int capacitateMax = 0;
                                capacitate = linie.substring(index + 2, linie.length());
                                capacitateMax = Integer.parseInt(capacitate);
                                //System.out.println(capacitateMax);

                                index = linie.indexOf('-');
                                index = index + 2;
                                String laux = linie.substring(index, linie.length());
                                int indaux = laux.indexOf('-');
                                tipStud = linie.substring(index, index + indaux - 1);
                                //System.out.println(tipStud);

                                int finall = linie.lastIndexOf('-');
                                numeCurs = linie.substring(index + indaux + 2, finall);
                                //System.out.println(numeCurs);


                                //acum adaug cursul in array-ul de cursuri in functie de tipul de studenti care participa la acel curs
                                if(tipStud == "licenta")
                                {
                                    Curs<StudLicenta> cursLicenta = new Curs<>(numeCurs, capacitateMax);
                                    cursuri.add(cursLicenta);
                                }
                                else
                                {
                                    Curs<StudMaster> cursMaster = new Curs<>(numeCurs, capacitateMax);
                                    cursuri.add(cursMaster);
                                }
                            }
                            else
                                if(linie.contains("adauga_preferinte")){

                                    String numenou = null;
                                    int index = linie.indexOf('-');
                                    String aux = linie.substring(index + 2,linie.length());
                                    int index2 = aux.indexOf('-');
                                    numenou = linie.substring(index + 2, index + index2 + 1);
                                    String p = linie.substring(index + index2 + 2, linie.length());

                                    //System.out.println(numenou + "  " + p);

                                    for(Student stud : studentiL)
                                        if(stud.getNume().contains(numenou))
                                        {

                                            int index1 = p.indexOf('-');
                                            index2 = p.lastIndexOf('-');

                                            if(index1 == index2) {
                                                int ind = index1 + 2;
                                                String op = p.substring(ind, p.length());
                                                //System.out.println(op);
                                                stud.preferinte.add(op);
                                            } else {

                                                do {
                                                    index1 = p.indexOf('-');
                                                    aux = p.substring(index1 + 2, p.length());
                                                    int index3 = aux.indexOf('-');
                                                    String optiune = p.substring(index1 + 2, index1 + index3 + 1);
                                                    stud.preferinte.add(optiune);

                                                    //System.out.println(optiune);

                                                    p = p.substring(index1 + index3 + 2);
                                                    index1 = p.indexOf('-');
                                                    index2 = p.lastIndexOf('-');


                                                } while (index1 != index2);

                                                int last = p.lastIndexOf('-');
                                                String optiune = p.substring(last + 2, p.length());
                                                //System.out.println(optiune);
                                                stud.preferinte.add(optiune);
                                            }

                                        }

                                    for(Student stud : studenti)
                                        if(stud.getNume().contains(numenou))
                                        {
                                            //stud.adaugaPreferinte(p);
                                            int index1 = p.indexOf('-');
                                            index2 = p.lastIndexOf('-');

                                            if(index1 == index2)
                                            {
                                                int ind = index1 + 2;
                                                String op = p.substring(ind, p.length());
                                                //System.out.println(op);
                                                stud.preferinte.add(op);
                                            } else {

                                                do {
                                                    index1 = p.indexOf('-');
                                                    aux = p.substring(index1 + 2, p.length());
                                                    int index3 = aux.indexOf('-');
                                                    String optiune = p.substring(index1 + 2, index1 + index3 + 1);
                                                    stud.preferinte.add(optiune);

                                                    //System.out.println(optiune);

                                                    p = p.substring(index1 + index3 + 2);
                                                    index1 = p.indexOf('-');
                                                    index2 = p.lastIndexOf('-');

                                                } while (index1 != index2);

                                                int last = p.lastIndexOf('-');
                                                String optiune = p.substring(last + 2, p.length());
                                                //System.out.println(optiune);
                                                stud.preferinte.add(optiune);
                                            }

                                        }


                                }
                                else
                                    if(linie.contains("repartizeaza")){
                                        repartizeaza();
                                    }
                                    else
                                        if(linie.contains("posteaza_curs")){
                                            posteazaCurs(linie, file);
                                        }
                                        else
                                            if(linie.contains("posteaza_student")){

                                                String numeStudCautat = null;
                                                int index = linie.indexOf('-');
                                                numeStudCautat = linie.substring(index + 2, linie.length());

                                                //System.out.println(numeStudCautat);

                                                for(Student stud : studentiL)
                                                    if(stud.getNume().contains(numeStudCautat))
                                                    {

                                                        String file1 = null;
                                                        if(file.contains("05-inroleaza_simplu"))
                                                            file1 = "C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\05-inroleaza_simplu\\05-inroleaza_simplu.out";
                                                        else
                                                        if(file.contains("06-inroleaza_ciclu_studii"))
                                                            file1 = "C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\06-inroleaza_ciclu_studii\\06-inroleaza_ciclu_studii.out";
                                                        else
                                                        if(file.contains("07-inroleaza_ciclu_studii_contestatii"))
                                                            file1 = "C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\07-inroleaza_ciclu_studii_contestatii\\07-inroleaza_ciclu_studii_contestatii.out";
                                                        else
                                                        if(file.contains("08-coliziuni_medie"))
                                                            file1 = "C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\08-coliziuni_medie\\08-coliziuni_medie.out";
                                                        else
                                                        if(file.contains("09-coliziuni_ciclu_studii"))
                                                            file1 = "C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\09-coliziuni_ciclu_studii\\09-coliziuni_ciclu_studii.out";
                                                        else
                                                        if(file.contains("10-coliziuni_ciclu_studii_contestatii"))
                                                            file1 = "C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\10-coliziuni_ciclu_studii_contestatii\\10-coliziuni_ciclu_studii_contestatii.out";
                                                        else
                                                        if(file.contains("11-exceptie_simplu"))
                                                            file1 = "C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\11-exceptie_simplu\\11-exceptie_simplu.out";
                                                        else
                                                        if(file.contains("12-toate_functionalitatile"))
                                                            file1 = "C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\12-toate_functionalitatile\\12-toate_functionalitatile.out";


                                                        try (FileWriter fw = new FileWriter(file1, true);
                                                             BufferedWriter bw = new BufferedWriter(fw);
                                                             PrintWriter out = new PrintWriter(bw)) {
                                                            out.println("***");
                                                            out.print("Student Licenta: " + stud.getNume() + " - " + stud.getMedie() + " - ");

                                                            for(Curs curs : cursuri)
                                                            {
                                                                String numeleCursului = curs.cautaStudLaCurs(stud);
                                                                if(numeleCursului != null)
                                                                {
                                                                    numeleCursului = numeleCursului.substring(0, numeleCursului.length()-1);
                                                                    out.println(numeleCursului);
                                                                    break;
                                                                }
                                                            }

                                                        } catch (IOException e) {
                                                            e.printStackTrace();
                                                        }
                                                    }

                                                for(Student stud : studenti)
                                                    if(stud.getNume().contains(numeStudCautat))
                                                    {

                                                        String file1 = null;
                                                        if(file.contains("05-inroleaza_simplu"))
                                                            file1 = "C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\05-inroleaza_simplu\\05-inroleaza_simplu.out";
                                                        else
                                                        if(file.contains("06-inroleaza_ciclu_studii"))
                                                            file1 = "C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\06-inroleaza_ciclu_studii\\06-inroleaza_ciclu_studii.out";
                                                        else
                                                        if(file.contains("07-inroleaza_ciclu_studii_contestatii"))
                                                            file1 = "C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\07-inroleaza_ciclu_studii_contestatii\\07-inroleaza_ciclu_studii_contestatii.out";
                                                        else
                                                        if(file.contains("08-coliziuni_medie"))
                                                            file1 = "C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\08-coliziuni_medie\\08-coliziuni_medie.out";
                                                        else
                                                        if(file.contains("09-coliziuni_ciclu_studii"))
                                                            file1 = "C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\09-coliziuni_ciclu_studii\\09-coliziuni_ciclu_studii.out";
                                                        else
                                                        if(file.contains("10-coliziuni_ciclu_studii_contestatii"))
                                                            file1 = "C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\10-coliziuni_ciclu_studii_contestatii\\10-coliziuni_ciclu_studii_contestatii.out";
                                                        else
                                                        if(file.contains("11-exceptie_simplu"))
                                                            file1 = "C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\11-exceptie_simplu\\11-exceptie_simplu.out";
                                                        else
                                                        if(file.contains("12-toate_functionalitatile"))
                                                            file1 = "C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\12-toate_functionalitatile\\12-toate_functionalitatile.out";


                                                        try (FileWriter fw = new FileWriter(file1, true);
                                                             BufferedWriter bw = new BufferedWriter(fw);
                                                             PrintWriter out = new PrintWriter(bw)) {
                                                            out.println("***");
                                                            out.print("Student Master: " + stud.getNume() + " - " + stud.getMedie() + " - ");

                                                            for(Curs curs : cursuri)
                                                            {
                                                                String numeleCursului = curs.cautaStudLaCurs(stud);
                                                                if(numeleCursului != null)
                                                                {
                                                                    numeleCursului = numeleCursului.substring(0, numeleCursului.length()-1);
                                                                    out.println(numeleCursului);
                                                                    break;
                                                                }
                                                            }

                                                        } catch (IOException e) {
                                                            e.printStackTrace();
                                                        }
                                                    }

                                            }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void repartizeaza(){


        boolean OK = false;
        for (int i = 0 ; i < studentiTotal.size(); i++)
        {
            OK = false;
            Student stud = studentiTotal.get(i);

            //System.out.println(stud.getNume() + " ^ " + stud.getMedie());

            for(int j = 0; j < stud.preferinte.size() && OK == false; j++)
            {
                String pref = stud.preferinte.get(j);
                for(int k = 0; k < cursuri.size()  && OK == false; k++)
                {
                    Curs c = cursuri.get(k);
                    if(c.getDenumire().contains(pref))
                    {
                        if(c.getCapacitateMaxima() > 0)
                        {
                            //System.out.println(c.getDenumire() + " " + c.getCapacitateMaxima() + " " + stud.getNume());
                            c.adaugaStudCurs(stud);
                            c.setCapacitateMic();
                            OK = true;
                        }
                        else
                        {
                            // trb sa extrag studentul cu cea mai mica medie care a intrat la cursul c
                            // si apoi sa vad daca studentul meu pe care vreau sa il reapartizez acum
                            //are accesi medie ca si acela acre a intrat ultimul

                            //1 - extrag studentul care a intrat ultimul la cursul c
                            Student ss = c.cautaStudCeaMaiMicaMedie();

                            //2 - vf daca au mediile egale
                            if(ss.getMedie() == stud.getMedie())
                            {
                                c.adaugaStudCurs(stud);
                                OK = true;
                            }
                        }

                    }
                }
            }
        }


    }

    public void posteazaCurs(String linie, String file){

        int index = linie.indexOf('-');
        String numeC = linie.substring(index + 2, linie.length());
        //System.out.println(numeC);

        for (Curs curs : cursuri){
            //System.out.println(curs.getDenumire() + " " + numeC);
            if(curs.getDenumire().contains(numeC)){
                //System.out.println(numeC + " : ");
                if(file.contains("05-inroleaza_simplu"))
                {
                    curs.afiseazaStudCurs("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\05-inroleaza_simplu\\05-inroleaza_simplu.out", studentiTotal);
                    break;
                }
                else
                if(file.contains("06-inroleaza_ciclu_studii"))
                {
                    curs.afiseazaStudCurs("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\06-inroleaza_ciclu_studii\\06-inroleaza_ciclu_studii.out", studentiTotal);
                    break;
                }
                else
                if(file.contains("07-inroleaza_ciclu_studii_contestatii"))
                {
                    curs.afiseazaStudCurs("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\07-inroleaza_ciclu_studii_contestatii\\07-inroleaza_ciclu_studii_contestatii.out", studentiTotal);
                    break;
                }
                else
                if(file.contains("08-coliziuni_medie"))
                {
                    curs.afiseazaStudCurs("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\08-coliziuni_medie\\08-coliziuni_medie.out", studentiTotal);
                    break;
                }
                else
                if(file.contains("09-coliziuni_ciclu_studii"))
                {
                    curs.afiseazaStudCurs("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\09-coliziuni_ciclu_studii\\09-coliziuni_ciclu_studii.out", studentiTotal);
                    break;
                }
                else
                if(file.contains("10-coliziuni_ciclu_studii_contestatii"))
                {
                    curs.afiseazaStudCurs("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\10-coliziuni_ciclu_studii_contestatii\\10-coliziuni_ciclu_studii_contestatii.out", studentiTotal);
                    break;
                }
                else
                if(file.contains("11-exceptie_simplu"))
                {
                    curs.afiseazaStudCurs("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\11-exceptie_simplu\\11-exceptie_simplu.out", studentiTotal);
                    break;
                }
                else
                if(file.contains("12-toate_functionalitatile"))
                {
                    curs.afiseazaStudCurs("C:\\Users\\Hp\\Desktop\\tema2_poo\\tema-2-alexandraraluca\\src\\main\\resources\\12-toate_functionalitatile\\12-toate_functionalitatile.out", studentiTotal);
                    break;
                }
            }
        }

    }

    public void citesteNote(String file){
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linie;
            while ((linie = br.readLine()) != null) {

                //System.out.println(linie);
                String numeStud = null;
                int index = linie.indexOf('-');
                numeStud = linie.substring(0, index-1);
                //System.out.println(numeStud);

                String medieStud = null;
                medieStud = linie.substring(index + 2, linie.length());
                double medieDouble = Double.parseDouble(medieStud);
                //System.out.println(medieDouble);

                actualizeazaMedieStud(numeStud, medieDouble);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void rezolvaContestatii(String linie){
        String numeCont = null;
        int index1 = linie.indexOf('-');
        int index2 = linie.lastIndexOf('-');
        numeCont = linie.substring(index1 + 2, index2 - 1);
        String medieCont = linie.substring(index2 + 2, linie.length());
        Double medieDouble = Double.parseDouble(medieCont);
        //System.out.println(numeCont + "  " + medieDouble);
        for (Student studentt : studentiTotal)
        {
            if(studentt.getNume().equals(numeCont)){
                //System.out.println(studentt.getMedie());
                studentt.setMedie(medieDouble);
                //System.out.println(studentt.getMedie());
                break;
            }
        }
        actualizeazaMedieStud(numeCont, medieDouble);
    }
    public void actualizeazaMedieStud(String numeStud, double medieDouble){
        for (Student studentt : studenti)
        {
            if(studentt.getNume().equals(numeStud)){
                studentt.setMedie(medieDouble);
                break;
            }
        }
        for (Student studentt : studentiL)
        {
            if(studentt.getNume().equals(numeStud)){
                studentt.setMedie(medieDouble);
                break;
            }
        }
    }
    public void posteazaMediile(String file){

        if(studentiTotal.isEmpty()) {
            if (!studenti.isEmpty() && !studentiL.isEmpty()) {

                for (StudLicenta stud : studentiL) {
                    //System.out.println(stud.getNume() + " + " + stud.getMedie());
                    studentiTotal.add(stud);
                }
                for (StudMaster stud : studenti) {
                    //System.out.println(stud.getNume() + " + " + stud.getMedie());
                    studentiTotal.add(stud);
                }

                Comparator<Student> comparatorr = Comparator.comparing(Student::getMedie, Comparator.reverseOrder()).thenComparing(Student::getNume);
                Collections.sort(studentiTotal, comparatorr);
                try (FileWriter fw = new FileWriter(file, true);
                     BufferedWriter bw = new BufferedWriter(fw);
                     PrintWriter out = new PrintWriter(bw)) {
                    out.println("***");
                    for (Student stud : studentiTotal) {
                        out.println(stud.getNume() + " - " + stud.getMedie());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                if (!studenti.isEmpty()) {

                    for (StudMaster stud : studenti) {
                        studentiTotal.add(stud);
                    }

                    Comparator<Student> comparator = Comparator.comparing(Student::getMedie, Comparator.reverseOrder()).thenComparing(Student::getNume);
                    Collections.sort(studentiTotal, comparator);
                    try (FileWriter fw = new FileWriter(file, true);
                         BufferedWriter bw = new BufferedWriter(fw);
                         PrintWriter out = new PrintWriter(bw)) {
                        out.println("***");
                        for (Student stud : studentiTotal) {
                            out.println(stud.getNume() + " - " + stud.getMedie());
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                if (!studentiL.isEmpty()) {

                    for (StudLicenta stud : studentiL) {
                        studentiTotal.add(stud);
                    }

                    Comparator<Student> comparator1 = Comparator.comparing(Student::getMedie, Comparator.reverseOrder()).thenComparing(Student::getNume);
                    Collections.sort(studentiTotal, comparator1);
                    try (FileWriter fw = new FileWriter(file, true);
                         BufferedWriter bw = new BufferedWriter(fw);
                         PrintWriter out = new PrintWriter(bw)) {
                        out.println("***");
                        for (Student stud : studentiTotal) {
                            out.println(stud.getNume() + " - " + stud.getMedie());
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        else
        {
            Comparator<Student> comparatorS = Comparator.comparing(Student::getMedie, Comparator.reverseOrder()).thenComparing(Student::getNume);
            Collections.sort(studentiTotal, comparatorS);
            try (FileWriter fw = new FileWriter(file, true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.println("***");
                for (Student stud : studentiTotal) {
                    out.println(stud.getNume() + " - " + stud.getMedie());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
