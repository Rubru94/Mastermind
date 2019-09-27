import java.io.*;
import java.util.*;



public class Mastermind{
	
	public enum Color{
		r,b,y,g,o,p
	}
	
	public  static char[] disorder (String chain){
		
		int limit=5, i=0, j=0;
		
		int vector[] = new int[4];
		char[] arrayMess = new char[4];
		
		vector[i]=(int)(Math.random()*limit);
		
		for(i=1;i<vector.length;i++)			 
		{
			vector[i]=(int)(Math.random()*limit);
			
			for (j=0;j<i;j++)
			{
				if (vector[i]==vector[j]) 
				{	
					i--;
				}
					
			}
		}
		
		for(int x=0;x<vector.length;x++){
			
			arrayMess[x] = chain.charAt(vector[x]);
		}
		
		/*
		System.out.println("\n Vector generado: \n");			
		for(i=0;i<arrayMess.length;i++)
		{
			System.out.print(arrayMess[i]);
			
		}
		*/
		
		return arrayMess;
		
	}
	
	public  static int[] checkDieHurt (String chain, char[] result){
		
		int dies=0, hurts=0;
		int [] score = new int[2];
		char [] opt = chain.toCharArray();
		
			for(int i=0; i<opt.length;i++) 
			{
			
				if(opt[i]==result[i])
				{
					dies++;

				}
				else
				{
					for(int j=0;j<opt.length;j++)
					{
						if(result[i]==opt[j])
						{
							hurts++;
						}
					
					}
				}		
	
			}
		
		score[0]=dies;
		score[1]=hurts;
		
		return score;
		
	}
	
	public static void main (String [] args)  throws java.io.IOException{
		
		Scanner entrada = new Scanner(System.in);
		String option =  "", move="", enumString = "", character="", record="";
		boolean incorrect=false, repeated=false;
		
		int attempts=0, maxAttempts=10, dies=0, hurts=0, length=4;
		
		Color red = Color.r;
		
		
		for(Color c: Color.values()){	
			enumString += c.toString();
		}
		
		char [] result = disorder(enumString);
		
		do{
			
			System.out.println("\t----- MASTERMIND -----");
			
			do{
				
				incorrect=false;repeated=false;
			
				System.out.print("\n Propose a combination (" + attempts +" attempts): ");
				move = entrada.nextLine();
				
				
				for (char x: move.toCharArray()){
					if (!enumString.contains(Character.toString(x))){
							incorrect=true;
					}
					
					if (Character.toString(x).equals(character)){
							repeated=true;
					}
					
					character = Character.toString(x);	
				}
				
				
				if (incorrect){
					System.out.println("\n Wrong colors, they must be: rbygop");
				}
				
				if (repeated){
					System.out.println("\n Repeated colors");
				}
				
				if (Color.values().length<move.toCharArray().length || move.toCharArray().length!=length){
					System.out.println("\n Wrong proposed combination length");
				}
				
				
				
				if (!incorrect && !repeated && !(Color.values().length<move.toCharArray().length || move.toCharArray().length!=length)){
					
					System.out.println("\n"+(attempts+1)+" attempt(s): \n****");
					attempts++;
					
					
					dies = checkDieHurt(move, result)[0]; 
					hurts = checkDieHurt(move, result)[1]; 
					
					record += "\n " + move + " --> " + dies +" blacks and " + hurts + " whites";
					System.out.print(record);

				}
				
			}while(dies != length && attempts!=maxAttempts);
				
			if(dies == length || attempts==maxAttempts){
					if(dies == length)
						System.out.print("\n You've won!!! ;-)");
					if(attempts==maxAttempts)
						System.out.print("\n You've lost!!! :-(");
					
					attempts = 0;
					result = disorder(enumString);
					record = "";
				}
			
			System.out.println("\n\t Do you want to continue? (s/n):");
			option = entrada.nextLine();
			
		}while(!option.equals("n"));
			
		
	}

}
