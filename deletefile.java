import java.io.File;   
class DeleteFile {  
  public static void main(String[] args) {   
    File Filedelete = new File("D:FileOperationExample.txt");   
    if (Filedelete.delete()) {   
      System.out.println(Filedelete.getName()+ " file is deleted successfully.");  
    } else {  
      System.out.println("Unexpected error found in deletion of the file.");  
    }   
  }   
}  
