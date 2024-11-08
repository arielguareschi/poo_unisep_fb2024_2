package br.edu.unisep.cidade.util;

import br.edu.unisep.cidade.model.Cidade;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Funcoes {

    public static List<Cidade> lerArquivoCidade(){
        File arq = new File("C:\\cidade", "cidades.txt");
        List<Cidade> lista = new ArrayList();
        try{
            if (arq.exists()) {
                FileReader ledor = new FileReader(arq);
                BufferedReader reader = new BufferedReader(ledor);
                String linha = "";
                while ((linha = reader.readLine()) != null) {
                    Cidade cidade = new Cidade();
                    cidade.toObject(linha);
                    lista.add(cidade);
                }
                reader.close();
                ledor.close();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return lista;
    }

    public static boolean salvarArquivoCidade(List<Cidade> lista){
        try{
            File arquivo = new File("C:\\cidade", "cidades.txt");
            arquivo.createNewFile();
            FileWriter escrever = new FileWriter(arquivo, false);
            PrintWriter printer = new PrintWriter(escrever);
            for(Cidade cidade : lista){
                printer.println(cidade.toFileString());
            }
            printer.flush();
            printer.close();
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
