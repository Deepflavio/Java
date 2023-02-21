
package _projetoConsulta;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {


//menu

//contador para mostrar o índice do dentista    
static int contador_dentistas;
static int contador_pacientes;
static int contador_consultas;

public static void menu()
{
    System.out.println("Bem- vindo ao sistema de cadastro de consultas! O que deseja fazer? ");
    System.out.println("1: Cadastrar consulta/Cliente: ");
    System.out.println("2: Cadastrar consulta/Pet: ");
    System.out.println("3: Venda de pet: ");
    System.out.println("4: relatorio de provisões: ");
    // e ate o 04 a segunda me\\
    System.out.println("5: Relatório de consultas: ");
    System.out.println("6: Relatório financeiro: ");
}

//metodo de cadastro dos pacientes
public static void CadastraPaciente()
{
    System.out.println("CADASTRO DE PACIENTE: ");
}

//metodo de cadastro dos dentistas
public static void CadastraDentista()
{
    System.out.println("CADASTRO DE DENTISTA:");
}

//metodo de cadastro da consulta
public static void CadastraConsulta()
{
    System.out.println("MARCAR CONSULTA: ");
}

    //Main
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Paciente> listapacientes = new ArrayList<Paciente>(); //ArrayList para armazenar os pacientes
        ArrayList<Dentista> listadentistas = new ArrayList<Dentista>(); //ArrayList para armazenar os dentistas
        ArrayList<Consulta> listaconsultas = new ArrayList<Consulta>(); //ArrayList para armazenar as consultas
        
        while(true)
        {
            menu();
        int opcao = entrada.nextInt(); 
        
        //switch para controlar o menu
        switch(opcao)
        {
            //case 1: cadastro de paciente
            case 1:
               CadastraPaciente();//chamando o método CadastraPaciente();

               //solicitando os dados:
               System.out.println("Nome completo do paciente: ");
               
               String nome = entrada.next();

               System.out.println("Cpf: ");

               String cpf = entrada.next();

               System.out.println("telefone: ");

               String tele = entrada.next();
               //|||||||||||||||||||||||||||||||||||||||||||\\
               // parte do cod antigo 
              // System.out.println("Data do cadastro: ");

              // String dataCadastro = entrada.next();
               
               //System.out.println("Endereço: ");

              // String endereco = entrada.next();
              //|||||||||||||||||||||||||||||||||||||||||||||||\\
                //Criando o objeto paciente
               Paciente Novopaciente = new Paciente();

               //setando os dados do paciente
               Novopaciente.setNome(nome);
               Novopaciente.setCpf(cpf);
               Novopaciente.setTele(tele);
               

               //adicionando o paciente na lista.
               listapacientes.add(Novopaciente);
                break;


            //case 2: cadastro de dentistas, mesmo processo do cadastro de pacientes;
            case 2:
                CadastraDentista();
                System.out.println("Nome do pet: ");
               
               String nomePet = entrada.next();

               System.out.println("sexo do Pet: ");

               String sexoA = entrada.next();

               System.out.println("Apelido do pet: ");

               String apelido = entrada.next();
               
                System.out.println("codigo do pet:");
               
               String codigo = entrada.next();

               System.out.println("Data de entrada: ");

               String dataEntrada = entrada.next();

               Dentista cadastroAnimal = new Dentista();

               cadastroAnimal.setNome(nomePet);
               cadastroAnimal.setSexo(sexoA);
               cadastroAnimal.setApelido(apelido);
               cadastroAnimal.setDataEntrada(dataEntrada);
               cadastroAnimal.setCodigo(codigo);
               listadentistas.add(cadastroAnimal);
                break;
                
            //case 3: cadastro de consultas:
            case 3:
                CadastraConsulta();
                System.out.println("Dentistas cadastrados:");
                for(Dentista i: listadentistas)
                {
                    contador_dentistas = 1;
                    System.out.println( "("+ contador_dentistas + ")" + i.getNome());
                    
                    break;
                    
                }
                
                System.out.println("Para qual dentista quer marcar a consulta? ");
                
                int escolha_dentista = entrada.nextInt();
                
                if(escolha_dentista == contador_dentistas)//verifica o índice do dentista
                {
                    System.out.println("Quem é o paciente? ");
                    
                    for(Paciente i: listapacientes)
                    {
                        contador_pacientes = 1;
                        System.out.println( "("+ contador_pacientes + ")" + i.getNome());      
                    }
                    
                    int escolhepaciente = entrada.nextInt();
                    
                    
                    
                   
                }
               
            
            case 4:
                System.out.println("CANCELAR CONSULTA: ");
                
                
                
                
                break;
                
            case 5:
                System.out.println("RELATÓRIO DE CONSULTAS: ");
                
                
                
                break;
               
                
               
        }
                        
                
       }
    
    }
}


   
   
