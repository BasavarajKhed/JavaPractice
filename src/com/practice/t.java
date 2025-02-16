package com.practice;





class t { 
    public static void main(String args[]) 
    { 
//        String str1 = ""; 
//        char arr[] = { 'j', 'a', 'v', 'a', ' ', 'p',  
//        'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g' }; 
//        String str2 = new String(arr); //java programming
//        String str3 = new String(str2);  //java programming
//  
//        System.out.println(str1);  //""
//        System.out.println(str2);  //java programming
//       
//        System.out.println(str3); //java programming
//        
//        { 
//            byte[] arr = { 97, 98, 99, 100, 101 }; 
//            String str2 = new String(arr); 
//      
//            System.out.println(str2); 
//        }
    	
//        { 
//            String str = "Java Programming"; 
//            char ch = str.charAt(2); 
//            System.out.println(ch); 
//        } 
        
//        { 
//            String str = "Java Programming"; 
//            char arr[] = new char[10]; 
//            str.getChars(0, 4, arr, 0); 
//            System.out.println(arr); 
//            System.out.println(arr.length);
//        } 
        
//        The syntax of the method is: getChars(startindex, numOfCharacters, 
//        arrayName, startindexOfArrat). 
//        So from the string, starting from 0th index, 
//        first four characters are taken.
        
   /*     { 
            String str = "Java Programming"; 
//            char arr[] = new char[20];
            char a1[]= {'a','b'};
//            arr = str.toCharArray(); 
            System.out.println(a1); 
            
            int q[]= {1,2,3};
            System.out.println();
            for(char c:a1)
            {
            	System.out.println(c);
            }
            	
          
            
            
        } */
        
     /*   String str = "Java Programming"; 
        String str1 = "Java"; 
  
        System.out.println(str.indexOf("a")); //1
        System.out.println(str.indexOf("m")); //11
  
        System.out.println(str.lastIndexOf("a")); //9
        System.out.println(str.lastIndexOf("m"));  //12
       */
    	
    	
   /* 	String str = "Java Programming"; 
        String str1 = "Java"; 
        String str2 = str.substring(5); 
        System.out.println(str2); //Programming
        System.out.println(str.substring(5, 9)); //prog
     */
    	
    /*	String str = "Java Programming"; 
    	  //           9  9     9
        System.out.println(str.replace('a', '9')); 
      */
    	
    	/*String str = "    Java          Programming                  "; 
    	  
        System.out.println(str.trim()); 
        */
    	
    	
       /* String GfG1 = "Welcome to GeeksforGeeks"; 
        boolean GfG2; 
        GfG2 = GfG1.startsWith("hello"); 
        System.out.println(GfG2); */
    	
    	
    	
      /*  String GfG1 = "I am intern at GeeksforGeeks"; 
        String GfG2 = new String(GfG1); 
        System.out.println((GfG1 == "I am intern at GeeksforGeeks") + " " + GfG1.equals(GfG2));
        */
        
        
        String GfG1 = "Hello"; 
        String GfG2 = new String(GfG1); 
        String GfG3 = "HELLO"; 
        System.out.println(GfG1.equals(GfG2) + " " + GfG2.equals(GfG3));
        
        
        
        
        
        
        
        
        
        
        
    } 
} 
