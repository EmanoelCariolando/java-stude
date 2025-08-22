package Application;

import Application.entities.TaskService;

import java.io.*;
import java.util.*;


public class MainApp {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
        TaskService taskservice = new TaskService();

        int n = 0;
        String path = "";
        String choseOption = "Escolha uma Opção: " ;
        String otherOption = "Digite uma opção válida: ";

        while (n != 4){
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Remover tarefa");
            System.out.println("4 - sair");

            System.out.print(choseOption);
            n = sc.nextInt();

            sc.nextLine();

            if (n == 1){
                System.out.print("Digite o caminho do arquivo e o nome do arquivo .txt: ");
                path = sc.nextLine();
                System.out.print("digite sua tarefa: ");
                String task = sc.nextLine();
                taskservice.addTask(path,task.trim());
            }
            else if (n == 2){
                System.out.print("Escolha o caminho do seu arquivo: ");
                path = sc.next();
                taskservice.seeTasks(path);
            }
            else if (n == 3){
                System.out.print("Escolha o arquivo para remover: ");
                path = sc.next();
                System.out.println("Digite a task que vc quer remover: ");
                String taskToRemove = sc.next();
            }
            else if(n == 4){
                System.out.println("Encerrando");
            }
            else {
                System.out.println("Opção Invalida!");
                choseOption = otherOption;
            }
        }







         }
    }
