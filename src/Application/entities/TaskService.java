package Application.entities;

import java.io.*;

public class TaskService {

    public void addTask(String path,String task){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
            bw.write(task);
            bw.newLine();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void seeTasks(String path){
       try(BufferedReader br = new BufferedReader(new FileReader(path))) {
           String line;
           System.out.println("\n--- Lista de Tarefas ---");
           while ((line = br.readLine()) != null){
               System.out.println(line);
           }

       }
       catch (IOException e) {
           throw new RuntimeException(e);
       }

    }
    public void removeTasks(String path, String taskToRemove) throws IOException {
        File filePath = new File(path);
        File tempFile = new File("temp.txt");

        try(BufferedReader br = new BufferedReader(new FileReader(filePath));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile))){

            String line;

            while ((line = br.readLine()) != null){
                
            }

        }
    }

}
