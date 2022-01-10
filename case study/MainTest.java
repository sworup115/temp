package org.btm.uiApp;
import java.util.Scanner;

public class MainTest 
{
	public static void main(String[] args) {
			home();
			
	}
	static void home()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Select the option");
		System.out.println("1 . add song");
		System.out.println("2 . delete song");
		System.out.println("3 . Update song");
		System.out.println("4 . Search song");
		System.out.println("5 . play song");
		System.out.println("Type exit to close the application");
		String n = sc.next();
		//sc.close();
		option(n);
	}
	private static void option(String n) {
		if(n.equalsIgnoreCase("1")) {
			Crud.add();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			home();
		}
		else if(n.equalsIgnoreCase("2")) {
			Crud.delete();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			home();
		}
		else if(n.equalsIgnoreCase("3")) 
		{
			Crud.update();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			home();
		}
		else if(n.equalsIgnoreCase("4"))
		{
		Crud.search();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			home();
		}
		else if(n.equalsIgnoreCase("exit"))
		{
			Crud.finalexit();
		}
		else if(n.equalsIgnoreCase("5"))
		{
			Crud.playSong();
			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			home();
		}
		else
		{
			System.out.println("Invalid option");
			home();
		}
	}
}


