package me.merinthium.main;


import javax.swing.JOptionPane;

public class References 
{
	
	public static void main (String[] args)
	{
		int input = 0 ;
		if (input == JOptionPane.CANCEL_OPTION)
		{
			
			System.exit(input);
			
		}
		else
		{
		String Author;
		 Author = JOptionPane.showInputDialog("Author Surname and first initial.", "Author surname and first initial");
		
		String Article_Title;
		 Article_Title = JOptionPane.showInputDialog("Article Title");
		
		String Name_Of_Website;
		 Name_Of_Website = JOptionPane.showInputDialog ("Name Of Website");
		 
		String Year_of_publication;
		Year_of_publication = JOptionPane.showInputDialog("Year of Publication");
		
		String Full_URL;
		Full_URL = JOptionPane.showInputDialog("Full URL");
		
		String Date_Last_Visited;
		Date_Last_Visited = JOptionPane.showInputDialog("Date");
		
		String Reference;
		Reference = Author + ". (" + Year_of_publication + "). " + Article_Title + ". "+ Name_Of_Website + "." + " Avalible:" + Full_URL + " Last accessed: " + Date_Last_Visited; 
		
		JOptionPane.showMessageDialog( null, Reference, "Website Reference Please Write down", JOptionPane.INFORMATION_MESSAGE); 
			
		}
	}
}
	

	

