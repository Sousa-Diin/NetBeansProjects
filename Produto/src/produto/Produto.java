package produto;

import java.util.Scanner;

public class Produto {

    public static void main(String[] args) {
        
        Scanner javain = new Scanner(System.in);
        
        int codigo;
        int qtd = 0;
        float preco = 0f;
        float valorBruto = 0f;
        float desconto = 0f;
        
        System.out.print("Entre com um codigo: ");
        codigo = javain.nextInt();
        
        if(codigo > 0 && codigo <= 40){
            System.out.print("Entre com a quantidade: ");
            qtd = javain.nextInt();

            if (codigo >= 1 && codigo <= 10){
                preco = 10f;
            }else if (codigo <= 20){
                preco = 15f;
            }else if (codigo <= 30){
                preco = 20f;
            }else {
                preco = 30f;
            }
        }else {
                System.out.println("Entre com códigos entre 1 a 40");
            }
        
        valorBruto = preco * qtd;
        
        if (valorBruto > 0 && valorBruto < 250f){
            desconto = valorBruto * 0.5f;
        }
        else if (valorBruto <= 250f)
            desconto = valorBruto * 0.10f;
        else if (valorBruto > 500f)
            desconto = valorBruto * 0.15f;
        
        System.out.println("Preço unitario: " + preco);
        System.out.println("Valor bruto: " + valorBruto); 
        System.out.println("Desconto: " + desconto );
        System.out.println("Valor final: %.2f"+  (valorBruto - desconto));
        
    }
    
}
