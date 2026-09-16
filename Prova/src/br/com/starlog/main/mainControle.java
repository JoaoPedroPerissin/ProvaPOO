package br.com.starlog.main;

import br.com.starlog.model;
import br.com.starlog.model.BaseLancamento;
import br.com.starlog.model.Carga;
import br.com.starlog.exception;
import java.util;
import java.util.HashSet;
import java.util.Set;
import ModuloCarga;


public class mainControle {
    public static void main (@SuppressWarnings("unchecked");
    String [] args()){
        Carga c1 = new Carga("ORB-101-SP", "CRIOGENICA", 2.5, 450.00);
        Carga c2 = new Carga("ORB-102-RJ", "PADRAO", 8.0, 120.00);
        Carga c3 = new Carga("ORB-103-MG", "CRIOGENICA", 12.0, 850.00);
        Carga c4 = new Carga("ORB-104-PR", "BIOLOGICA", 15.0, 300.00);
    }

    System.out.println(c1);
    System.out.println(c4);

    HashSet<Object> ModuloCarga = new HashSet<>();
    HashSet<Object> base;
    base.add(c1);
    base.add( new BaseLancamento(c4, null));

    System.out.println("");

    try{
        new BaseLancamento(null, null);
    } catch (IllegalArgumentException e){

    }
}
    private Set newModuloCarga(String string, int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'newModuloCarga'");
    }
