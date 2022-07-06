package sigcloneproject;

import java.util.Scanner;

/** * @author wildes*/
public class SigCloneProject {
    /** @param args the command line arguments*/
    public static void main(String[] args) {
       
        Scanner scanner =new Scanner(System.in);

        //Pessoa p = new Pessoa();//Construtor padrão
        Endereco end = new Endereco();//Construtor padrão
        Discente d, d1;
        d = new Discente("ECA","112233","Wildes",27,'M',"11170277733"
                        ,"11222077","35999001122","wildes@gmail.com");//Construtor padrão
      
        System.out.println("Digite o pais: ");
        end.setPais(scanner.nextLine());
        System.out.println("Digite o estado: ");
        end.setEstado(scanner.nextLine());
        System.out.println("Digite o municipio: ");
        end.setMunicipio(scanner.nextLine());
        System.out.println("Digite o bairro: ");
        end.setBairro(scanner.nextLine());
        System.out.println("Digite o longradouro: ");
        end.setLongradouro(scanner.nextLine());
        System.out.println("Digite o cep: ");
        end.setCep(scanner.nextLine());
        System.out.println("Digite o numero: ");
        end.setNumero(scanner.nextInt());
        
        d1 = new Discente("ABI","114433","Alex",37,'M',"11170244433"
                        ,"11333077","35988001132","alex@gmail.com");
        d1.setEndereco(end);//Associação
        
        System.out.println("\n");
        System.out.println(d.imprimirDadosPessoais());
        System.out.println(d.dadosDoDiscente());
        System.out.println(d1.imprimirDadosPessoais());  
        
        
    }
    
}
