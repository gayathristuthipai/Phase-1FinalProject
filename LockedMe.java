import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LockedMe 
{
	static final String projectFilesPath = "C:\\SimpliLearn\\LockedMeFiles";
	static String errorMessage="Some Error Ocuurred. Please contact customer care";
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
        createFiles();
	}
	
	// Displaying menus, developer name to the users.
	public static void displayMenu()
	{
		System.out.println("***********************************************************************");
		System.out.println("\t\t\tWelcome to Lockedme.com");
		System.out.println("***********************************************************************");
		System.out.println("\t\t\t\t\t\t\t By: Gayathri Stuthi Pai");
		System.out.println("\t\t1. To display all the Files");
		System.out.println("\t\t2. Add a new file");
		System.out.println("\t\t3. Delete a file");
		System.out.println("\t\t4. Search a file");
		System.out.println("\t\t5. Exit");
	}
	
	// To display all the file present in a directory
	public static void displayAllFiles()
	{
		File folder=new File(projectFilesPath);
		File[] listOfFiles = folder.listFiles();
		for(var l:listOfFiles) 
		{
			System.out.println(l.getName());
		}
	}
	
	// To delete a particular File from Directory
	public static void deleteFiles() 
	{
		Scanner obj=new Scanner(System.in);
		try
		{
			String fileName;
			System.out.println("Enter a file name to be deleted: ");
			fileName=obj.nextLine();
			File file=new File(projectFilesPath+"\\"+fileName);
			if(file.exists())
			{
				file.delete();
				System.out.println("File Deleted Successfully");
			}
			else
			{
			    System.out.println("File do not Exists");   
			}
		}catch(Exception ex) {
			System.out.println(errorMessage);
		}
		finally
		{ 
			obj.close();
		}
		
	}
	
	// To add a particular File to a Directory.
	public static void createFiles() throws IOException
	{
		Scanner obj=new Scanner(System.in);
		try {
			String fileName;
			System.out.println("Enter Filename:");
			fileName=obj.nextLine();
			int linesCount;
			System.out.println("Please enter how many lines required in file?");
			linesCount=Integer.parseInt(obj.nextLine());
			FileWriter myWriter=new FileWriter(projectFilesPath+"\\"+fileName);
			for(int i=1;i<=linesCount;i++)
			{
				System.out.println("Enter the "+i+"of the file");
				myWriter.write(obj.nextLine()+"\n");
			}	
			myWriter.close();
			obj.close();
		}
		catch(Exception ex) {
			System.out.println(errorMessage);
		}

	}
	
	//To search a file from a Directory
	public static void searchFiles()
	{
		
	}
	
	

}