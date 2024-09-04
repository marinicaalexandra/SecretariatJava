package org.example;

public class Main {
    public static void main(String[] args) {

        Secretariat secretariat = new Secretariat();
        if( args[0].equals("01-posteaza_medii") ) {
            secretariat.citeste("C:\\\\Users\\\\Hp\\\\Desktop\\\\tema2_poo\\\\tema-2-alexandraraluca\\\\src\\\\main\\\\resources\\\\01-posteaza_medii\\\\01-posteaza_medii.in");
        }
        else if( args[0].equals("02-posteaza_medii_contestatii") ){
            secretariat.citeste("C:\\\\Users\\\\Hp\\\\Desktop\\\\tema2_poo\\\\tema-2-alexandraraluca\\\\src\\\\main\\\\resources\\\\02-posteaza_medii_contestatii\\\\02-posteaza_medii_contestatii.in");
        }
        else if( args[0].equals("03-posteaza_medii_contestatii") ){
            secretariat.citeste("C:\\\\Users\\\\Hp\\\\Desktop\\\\tema2_poo\\\\tema-2-alexandraraluca\\\\src\\\\main\\\\resources\\\\03-posteaza_medii_contestatii\\\\03-posteaza_medii_contestatii.in");
        }
        else if( args[0].equals("04-posteaza_medii_contestatii") ){
            secretariat.citeste("C:\\\\Users\\\\Hp\\\\Desktop\\\\tema2_poo\\\\tema-2-alexandraraluca\\\\src\\\\main\\\\resources\\\\04-posteaza_medii_contestatii\\\\04-posteaza_medii_contestatii.in");
        }
        else if( args[0].equals("05-inroleaza_simplu") ){
            secretariat.citeste("C:\\\\Users\\\\Hp\\\\Desktop\\\\tema2_poo\\\\tema-2-alexandraraluca\\\\src\\\\main\\\\resources\\\\05-inroleaza_simplu\\\\05-inroleaza_simplu.in");
        }
        else if( args[0].equals("06-inroleaza_ciclu_studii") ){
            secretariat.citeste("C:\\\\Users\\\\Hp\\\\Desktop\\\\tema2_poo\\\\tema-2-alexandraraluca\\\\src\\\\main\\\\resources\\\\06-inroleaza_ciclu_studii\\\\06-inroleaza_ciclu_studii.in");
        }
        else if( args[0].equals("07-inroleaza_ciclu_studii_contestatii") ){
            secretariat.citeste("C:\\\\Users\\\\Hp\\\\Desktop\\\\tema2_poo\\\\tema-2-alexandraraluca\\\\src\\\\main\\\\resources\\\\07-inroleaza_ciclu_studii_contestatii\\\\07-inroleaza_ciclu_studii_contestatii.in");
        }
        else if( args[0].equals("08-coliziuni_medie") ){
            secretariat.citeste("C:\\\\Users\\\\Hp\\\\Desktop\\\\tema2_poo\\\\tema-2-alexandraraluca\\\\src\\\\main\\\\resources\\\\08-coliziuni_medie\\\\08-coliziuni_medie.in");
        }
        else if( args[0].equals("09-coliziuni_ciclu_studii") ){
            secretariat.citeste("C:\\\\Users\\\\Hp\\\\Desktop\\\\tema2_poo\\\\tema-2-alexandraraluca\\\\src\\\\main\\\\resources\\\\09-coliziuni_ciclu_studii\\\\09-coliziuni_ciclu_studii.in");
        }
        else if( args[0].equals("10-coliziuni_ciclu_studii_contestatii") ){
            secretariat.citeste("C:\\\\Users\\\\Hp\\\\Desktop\\\\tema2_poo\\\\tema-2-alexandraraluca\\\\src\\\\main\\\\resources\\\\10-coliziuni_ciclu_studii_contestatii\\\\10-coliziuni_ciclu_studii_contestatii.in");
        }
        else if( args[0].equals("11-exceptie_simplu") ){
            secretariat.citeste("C:\\\\Users\\\\Hp\\\\Desktop\\\\tema2_poo\\\\tema-2-alexandraraluca\\\\src\\\\main\\\\resources\\\\11-exceptie_simplu\\\\11-exceptie_simplu.in");
        }
        else if( args[0].equals("12-toate_functionalitatile") ){
            secretariat.citeste("C:\\\\Users\\\\Hp\\\\Desktop\\\\tema2_poo\\\\tema-2-alexandraraluca\\\\src\\\\main\\\\resources\\\\12-toate_functionalitatile\\\\12-toate_functionalitatile.in");
        }

    }

}
