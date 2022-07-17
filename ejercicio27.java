/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

public class ejercicio27 {
     public static void main(String[] args) {
        String n1="1022", n2="0045", nc="",nc2="";
        int nci=0,nci2=0;
        for(int i=0; i<n1.length() ;i++){
            if(n1.charAt(i)!='0'){
            nc=nc+n1.charAt(i);           
        }            
        }
        for(int i=0; i<n2.length() ;i++){
            if(n2.charAt(i)!='0'){
            nc2=nc2+n2.charAt(i);           
        }            
        }
         nci= Integer.parseInt(nc);
        nci2= Integer.parseInt(nc2);
           if (nci>nci2 ){
               System.out.println("Mayor: "+nci);    
               System.out.println("Menor: "+nci2);               
           }else {
               System.out.println("Mayor: "+nci2);
               System.out.println("Menor: "+nci);
           }          
    }
}