package br.com.app;

import br.com.classes.Apartamento;
import br.com.classes.Cargo;
import br.com.classes.Condominio;
import br.com.classes.Documento;
import br.com.classes.Espaco;
import br.com.classes.Funcionario;
import br.com.classes.Morador;
import br.com.classes.PessoaFisica;
import br.com.classes.Secretaria;
import br.com.classes.Veiculo;
import br.com.classes.Visitante;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    
    

    public static void main(String[] args) 
    {
        float vlQuarto,salarioFuncionario; byte op,nApartamento,qtdQuarto,andar;int id=1,idCond=001; 
        char sexoMorador,sexoSecretaria,sexoVisita,sexoFuncionario; LocalDate dataAdd,dataDem,horaInic,horaTerm;
        //morador
        String nomeMorador,rgMorador,cpfMorador,
        //secretaria
        nomeSecretaria,rgSecretaria,cpfSecretaria,
        //visita
        nomeVisita,rgVisita,cpfVisita,
        //funcionario
        nomeFuncionario,rgFuncionario,cpfFuncionario,Funcao,
        //Veiculo
        tipoVeiculo,modeloVeiculo,placaVeiculo,corVeiculo;
        Apartamento apartamento;Cargo cargo;Condominio condominio; Documento documento;
        Espaco espaco; Funcionario funcionario;Secretaria secretaria;Veiculo veiculo;
        Visitante visita; ArrayList<PessoaFisica> moradores = new ArrayList();
        String espacosInternos[] = new String[4];
        ArrayList<Espaco> espacos = new ArrayList();
        
     //AGENDAMENTO E CONSULTA DE ESPACOS
     //AGENDAMENTO DE SERVICOS
        
       do{
           op=mostrarMenu();
           switch(op){
               case 1://CADASTRO MORADOR;
                   //morador
                   nomeMorador=informarNome(); sexoMorador=informarSexo(); 
                   rgMorador=informarRg();       cpfMorador=informarCpf();
                   //veiculo
                   tipoVeiculo=informarTipo(); modeloVeiculo=informarModelo();
                   placaVeiculo=informarPlaca(); corVeiculo=informarCor();
                    veiculo = new Veiculo(id,tipoVeiculo, modeloVeiculo, placaVeiculo, corVeiculo);
                   //secretaria
                   nomeSecretaria=informarNome();   sexoSecretaria=informarSexo();
                   rgSecretaria=informarRg();       cpfSecretaria=informarCpf();
                     secretaria = new Secretaria(id,"autorida",nomeSecretaria,sexoSecretaria,rgSecretaria,cpfSecretaria);
                   //apartamento
                   nApartamento=informeNumeroApartamento(); qtdQuarto=informeNumeroApartamento();
                   andar=informeAndar();vlQuarto=informeValor();
                    apartamento= new Apartamento(id,nApartamento,qtdQuarto,andar,vlQuarto,null);
                   //visita
                   nomeVisita=informarNome(); sexoVisita=informarSexo();
                   rgVisita=informarRg(); cpfVisita=informarCpf();
                     visita = new Visitante(id,nomeVisita, sexoVisita, rgVisita, cpfVisita);
                   
                   Morador morador = new Morador(id,"proprietario",apartamento,veiculo,visita,secretaria,null,null,null,nomeMorador, sexoMorador,rgMorador,cpfMorador);
                   moradores.add(morador);
                     condominio = new Condominio(moradores,"vilage","131510000-13");
                        condominio.mostrarListaMoradores();
                   break;
               case 2://cadastro de funcionario
                   nomeFuncionario=informarNome();sexoFuncionario=informarSexo();
                   rgFuncionario=informarRg();   cpfFuncionario=informarCpf();
                   Funcao=informarProfissao();  salarioFuncionario=informeValor();
                   //dataAdd=informeData();       dataDem=informeData();
                        cargo =new Cargo(id,Funcao,salarioFuncionario, null, null);
                            funcionario = new Funcionario(cargo,null, Funcao, sexoFuncionario,rgFuncionario,cpfFuncionario);
                                funcionario.mostrarDadosPessoa();
                   break;
               case 3:
                   System.out.println("modulo em fase de implementacao");
                   break;
               case 4:
                   System.out.println("modulo em fase de implementacao");
                   break;
               default:
                   System.out.println("informe uma opcao valida!");
           }
           id++;
       }while(op!=5);
    }
    
    public static byte mostrarMenu(){
        byte op; Scanner sc = new Scanner(System.in);
        System.out.println("[1] - cadastrar morador");
        System.out.println("[2] - cadastrar funcionario");
        System.out.println("[3] - reservar espaco");
        System.out.println("[4] - agendar servico");
        System.out.println("[5] - sair do sistema");
        System.out.print("informe opcao:..");
        op=sc.nextByte();
        return op;
    }
    public static byte informeNumeroApartamento(){
        byte nQuarto; Scanner sc = new Scanner(System.in);
        System.out.println("numero do apartamento:..");
        nQuarto=sc.nextByte();
        return nQuarto;
    }
    public static byte informeQtdQuarto(){
        byte qtdQuarto; Scanner sc = new Scanner(System.in);
        System.out.println("quantidade de quartos:..");
        qtdQuarto=sc.nextByte();
        return qtdQuarto;
    }
    public static byte informeAndar(){
        byte andar; Scanner sc = new Scanner(System.in);
        System.out.println("informe andar:..");
        andar=sc.nextByte();
        return andar;
    }
    public static String informarNome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe nome:..");
        sc.nextLine();
        String nome=sc.nextLine();
        return nome;
    }
    public static String informarProfissao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe funcao:..");
        sc.nextLine();
        String profissao=sc.nextLine();
        return profissao;
    }
    public static LocalDate informeData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("informe o dia:..");
        int dia=sc.nextInt();
        System.out.print("informe o mes:..");
        int mes = sc.nextInt();
        System.out.println("informe o ano:..");
        int ano=sc.nextInt();
        LocalDate data = LocalDate.of(ano, mes, dia);
        return data;
    }
    public static char informarSexo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Sexo [m]masculino [f]femenino:..");
        sc.nextLine();
        char sexo=sc.next().charAt(0);
        return sexo;
    }
    public static String informarRg(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe Rg:..");
        sc.nextLine();
        String rg=sc.nextLine();
        return rg;
    }
    public static String informarCpf(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe Cpf:..");
        sc.nextLine();
        String cpf=sc.nextLine();
        return cpf;
    }
    public static String informarTipo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe tipo:..");
        sc.nextLine();
        String tipo=sc.nextLine();
        return tipo;
    }
    public static String informarModelo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe modelo:..");
        sc.nextLine();
        String modelo=sc.nextLine();
        return modelo;
    }
    public static String informarPlaca(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe placa:..");
        sc.nextLine();
        String placa=sc.nextLine();
        return placa;
    }
    public static String informarCor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe cor:..");
        sc.nextLine();
        String cor=sc.nextLine();
        return cor;
    }
    public static float informeValor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe valor..");
        sc.nextLine();
        float salario=sc.nextFloat();
        return salario;
    }
}
