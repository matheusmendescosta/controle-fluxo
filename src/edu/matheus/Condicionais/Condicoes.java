package edu.matheus.Condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Condicoes {
    public void MaiorIdade () {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite sua idade: ");
        int idadeUsuario = sc.nextInt();

        if(idadeUsuario >= 18){
            System.out.println("maior de idade");
        } else {
            System.out.println("menor de idade");
        }
    }
}
