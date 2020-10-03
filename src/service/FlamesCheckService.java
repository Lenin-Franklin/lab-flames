package service;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

public class FlamesCheckService
{
	public static  char findFlames(String name1, String name2)
	{
		name1 = name1.toLowerCase();
		name2 = name2.toLowerCase();
		
		StringBuilder sb1 = new StringBuilder(name1);
		StringBuilder sb2 = new StringBuilder(name2);
		StringBuilder sb3 = new StringBuilder("flames");
		
		int m=sb1.length();
        int n=sb2.length();
        for(int i=0; i<m;i++)
        {
            for(int j=0; j<n;j++)
            {
                if(sb1.charAt(i) == sb2.charAt(j))
                {
                    sb1.replace(i, i+1, "0"); 
                    sb2.replace(j,j+1,"0");
                }
            }
        }
        int x1=0;
        int y1=0;
        String s1="";
        String s2="";
        s1 = sb1.toString();
        s2 = sb2.toString();
            for(int i=0;i<s1.length();i++){ 
            	if(s1.charAt(i)!='0'){
                    x1 +=1;
                    
                 }
            }
            for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)!='0'){
                y1 +=1;
                
                }
            }
        int x = x1+y1; 
        char flameResult = '\0';
        while(sb3.length()!=1)
        {
            int y = x%sb3.length(); 
            String temp;
            
            if(y!=0)
            {
                temp = sb3.substring(y)+sb3.substring(0, y-1); 
            }
            else
            {
                temp = sb3.substring(0, sb3.length()-1);
                
            }
            sb3 = new StringBuilder(temp);
            flameResult = sb3.charAt(0);
            
        }
        return flameResult;
		
		}
	}
		
			
	
	
