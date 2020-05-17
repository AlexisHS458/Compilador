/* Nombre de los Alumnos: Alexis Herrera Saucedo
                          Juan Pablo Murillo Macias
Nom. de boletas: 2018670471
                 2018670401
Fecha de Entrega: 20/05/2020
Evidencia: Proyecto Compilador: Análisis Sintáctico (Fase 1)
Nombre del maestro: Karina Rodriguez Mejia
Programa Academico: Ingenieria en Sistemas Computacionales
Unidad de Aprendizaje: Compiladores */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Compilador_Leer{
    FileReader f;
    BufferedReader b;
    char x;
    char y;
    int cont;
    ArrayList<String> Semantico = new ArrayList<>();

    public Compilador_Leer(String archivo) throws FileNotFoundException {
        f = new FileReader(archivo);
        b = new BufferedReader(f);
    }

    public char MetodoCar() throws FileNotFoundException, IOException {
        char caracter;
        caracter = (char) b.read();
        return caracter;
    }
    
    public String ExpresionReg() throws IOException{
        ArrayList<String> minusculas = new ArrayList<>();
        minusculas.add("a");
        minusculas.add("b");
        minusculas.add("c");
        minusculas.add("d");
        minusculas.add("e");
        minusculas.add("f");
        minusculas.add("g");
        minusculas.add("h");
        minusculas.add("i");
        minusculas.add("j");
        minusculas.add("k");
        minusculas.add("l");
        minusculas.add("m");
        minusculas.add("n");
        minusculas.add("o");
        minusculas.add("p");
        minusculas.add("q");
        minusculas.add("r");
        minusculas.add("s");
        minusculas.add("t");
        minusculas.add("u");
        minusculas.add("v");
        minusculas.add("w");
        minusculas.add("x");
        minusculas.add("y");
        minusculas.add("z");
        ArrayList<String> mayusculas = new ArrayList<>();
        mayusculas.add("A");
        mayusculas.add("B");
        mayusculas.add("C");
        mayusculas.add("D");
        mayusculas.add("E");
        mayusculas.add("F");
        mayusculas.add("G");
        mayusculas.add("H");
        mayusculas.add("I");
        mayusculas.add("J");
        mayusculas.add("K");
        mayusculas.add("L");
        mayusculas.add("M");
        mayusculas.add("N");
        mayusculas.add("O");
        mayusculas.add("P");
        mayusculas.add("Q");
        mayusculas.add("R");
        mayusculas.add("S");
        mayusculas.add("T");
        mayusculas.add("U");
        mayusculas.add("V");
        mayusculas.add("W");
        mayusculas.add("X");
        mayusculas.add("Y");
        mayusculas.add("Z");
        ArrayList<String> numeros = new ArrayList<>();
        numeros.add("0");
        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
        numeros.add("4");
        numeros.add("5");
        numeros.add("6");
        numeros.add("7");
        numeros.add("8");
        numeros.add("9");
        ArrayList<String> signos = new ArrayList<>();
        signos.add("_");//1
        signos.add(".");//2
        signos.add("+");//3
        signos.add("&");//4
        signos.add("|");//5
        signos.add("<");//6
        signos.add(">");//7
        signos.add("=");//8
        signos.add("!");//9
        signos.add(";");//10
        signos.add(" ");//11
        signos.add("(");//12
        signos.add(")");//13
        signos.add("[");//14
        signos.add("]");//15
        signos.add("{");//16
        signos.add("}");//17
        signos.add("\n");//18
        signos.add("-");//19
        signos.add("/");//20
        signos.add("*");//21
        ArrayList<String> Reservadas = new ArrayList<>();
        Reservadas.add("WHILE");
        Reservadas.add("DATA");
        Reservadas.add("NAME");
        Reservadas.add("ELSE");
        Reservadas.add("IF");
        Reservadas.add("VOID");
        Reservadas.add("VAR");
        Reservadas.add("CONST");
        Reservadas.add("INT");
        Reservadas.add("DOUBLE");
        Reservadas.add("STRING");
        Reservadas.add("CHAR");
        Reservadas.add("(");
        Reservadas.add(")");
        Reservadas.add(";");
        Reservadas.add(",");
        Reservadas.add("{");
        Reservadas.add("}");
        Reservadas.add("&&");
        Reservadas.add("||");
        Reservadas.add(">");
        Reservadas.add("<");
        Reservadas.add(">=");
        Reservadas.add("<=");
        Reservadas.add("==");
        Reservadas.add("START");
        Reservadas.add("END");
        Reservadas.add("IDENTIFICADOR");
        Reservadas.add("AUX");
        String Cad = "";
      
        if(minusculas.contains(String.valueOf(x))||mayusculas.contains(String.valueOf(x))||numeros.contains(String.valueOf(x))||signos.contains(String.valueOf(x))){

        }else{
            
            x = MetodoCar();
        }
        y = x;
        if(signos.get(10).equals(String.valueOf(x))||signos.get(17).equals(String.valueOf(x))){
            x = MetodoCar();
            if(!minusculas.contains(String.valueOf(x))&&!mayusculas.contains(String.valueOf(x))&&!signos.contains(String.valueOf(x))&&!numeros.contains(String.valueOf(x))){
                System.out.println("Apartir del caracter: "+x+" no valido");
                x = MetodoCar();
            }
            Cad = ExpresionReg();
        }else{
            if(signos.get(0).equals(String.valueOf(x))||minusculas.contains(String.valueOf(x))||mayusculas.contains(String.valueOf(x))){
                Cad += x;
                x = MetodoCar();
                while(signos.get(0).equals(String.valueOf(x))||minusculas.contains(String.valueOf(x))||mayusculas.contains(String.valueOf(x))||numeros.contains(String.valueOf(x))){
                    Cad += x;
                    x = MetodoCar();
                }
                
                if(!minusculas.contains(String.valueOf(x))&&!mayusculas.contains(String.valueOf(x))&&!signos.contains(String.valueOf(x))&&!numeros.contains(String.valueOf(x))){
                    System.out.println("Apartir del caracter: "+x+" no valido");
                    x = MetodoCar();
                }
                //return Cad;
            }else{
                if(numeros.contains(String.valueOf(x))){
                    Cad += x;
                    x = MetodoCar();
                    //Analisis sintactico
                    Cad = "DATA";
                    while(numeros.contains(String.valueOf(x))){
                        Cad += x;
                        x = MetodoCar();
                        //Analisis sintactico
                        Cad = "DATA";
                    }
                    y = x;
                    if(signos.get(1).equals(String.valueOf(x))){
                        x = MetodoCar();
                        if(numeros.contains(String.valueOf(x))){
                            Cad += y;
                            Cad += x;
                            x = MetodoCar();
                            //Analisis sintactico
                            Cad = "DATA";
                            Semantico.add(Cad);
                            while(numeros.contains(String.valueOf(x))){
                                Cad += x;
                                x = MetodoCar();
                                //Analisis sintactico
                                Cad = "DATA";
                                Semantico.add(Cad);
                            }       
                        }  
                    }
                   // return Cad;
                }else{
                    if(signos.contains(String.valueOf(x))){
                        if(signos.get(3).equals(String.valueOf(x))){
                            Cad += x;
                            x = MetodoCar();
                            if(signos.get(3).equals(String.valueOf(x))){
                                Cad += x;
                                x = MetodoCar();
                            }
                            if(!minusculas.contains(String.valueOf(x))&&!mayusculas.contains(String.valueOf(x))&&!signos.contains(String.valueOf(x))&&!numeros.contains(String.valueOf(x))){
                                System.out.println("Apartir del caracter: "+x+" no valido");
                                x = MetodoCar();
                                Cad = ExpresionReg();
                            }
                            //return Cad;
                        }else{
                            if(signos.get(4).equals(String.valueOf(x))){
                                Cad += x;
                                x = MetodoCar();
                                if(signos.get(4).equals(String.valueOf(x))){
                                    Cad += x;
                                    x = MetodoCar();
                                }
                                if(!minusculas.contains(String.valueOf(x))&&!mayusculas.contains(String.valueOf(x))&&!signos.contains(String.valueOf(x))&&!numeros.contains(String.valueOf(x))){
                                    System.out.println("Apartir del caracter: "+x+" no valido");
                                    x = MetodoCar();
                                    Cad = ExpresionReg();
                                }
                                //return Cad;
                            }else{
                                if(signos.get(5).equals(String.valueOf(x))){
                                    Cad += x;
                                    x = MetodoCar();
                                    if(signos.get(7).equals(String.valueOf(x))){
                                        Cad += x;
                                        x = MetodoCar();
                                    }
                                    if(!minusculas.contains(String.valueOf(x))&&!mayusculas.contains(String.valueOf(x))&&!signos.contains(String.valueOf(x))&&!numeros.contains(String.valueOf(x))){
                                        System.out.println("Apartir del caracter: "+x+" no valido");
                                        x = MetodoCar();
                                        Cad = ExpresionReg();
                                    }
                                    //return Cad;
                                }else{
                                    if(signos.get(6).equals(String.valueOf(x))){
                                        Cad += x;
                                        x = MetodoCar();
                                        if(signos.get(7).equals(String.valueOf(x))){
                                            Cad += x;
                                            x = MetodoCar();
                                        }
                                        if(!minusculas.contains(String.valueOf(x))&&!mayusculas.contains(String.valueOf(x))&&!signos.contains(String.valueOf(x))&&!numeros.contains(String.valueOf(x))){
                                            System.out.println("Apartir del caracter: "+x+" no valido");
                                            x = MetodoCar();
                                            Cad = ExpresionReg();
                                        }
                                    }else{
                                        if(signos.get(7).equals(String.valueOf(x))){
                                            Cad += x;
                                            x = MetodoCar();
                                            if(signos.get(7).equals(String.valueOf(x))){
                                                Cad += x;
                                                x = MetodoCar();
                                            }
                                            if(!minusculas.contains(String.valueOf(x))&&!mayusculas.contains(String.valueOf(x))&&!signos.contains(String.valueOf(x))&&!numeros.contains(String.valueOf(x))){
                                                System.out.println("Apartir del caracter: "+x+" no valido");
                                                x = MetodoCar();
                                                Cad = ExpresionReg();
                                            }
                                            //return Cad;
                                        }else{
                                            if(signos.get(8).equals(String.valueOf(x))){
                                                Cad += x;
                                                x = MetodoCar();
                                                if(signos.get(7).equals(String.valueOf(x))){
                                                    Cad += x;
                                                    x = MetodoCar();
                                                }
                                                if(!minusculas.contains(String.valueOf(x))&&!mayusculas.contains(String.valueOf(x))&&!signos.contains(String.valueOf(x))&&!numeros.contains(String.valueOf(x))){
                                                    System.out.println("Apartir del caracter: "+x+" no valido");
                                                    x = MetodoCar();
                                                    Cad = ExpresionReg();
                                                }
                                                //return Cad;
                                            }else{
                                                if(signos.contains(String.valueOf(x))){
                                                Cad = String.valueOf(x);
                                                x = MetodoCar();                                                
                                                //return Cad;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }     
            }
        }
        //Analisis Sintactico
        if(Reservadas.contains(Cad) || signos.contains(Cad)){
            Cad = Cad;
        }else{
            Semantico.add(Cad);
            Cad = "IDENTIFICADOR";
        }
        return Cad;
    }
    

    public static void main(String[] args) throws IOException {
        Compilador_Leer comp = new Compilador_Leer("./Prueba.txt");
       
        for(int i=0;i<=24;i++){
            System.out.println(comp.ExpresionReg());
        }
        System.out.print("Se guardaron ");

        System.out.print(comp.Semantico.size());
        System.out.println(" cadenas");
        
    }

}
