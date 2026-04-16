import java.util.*;
class C{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        String e="",d="";
        for(char c:s.toCharArray())
            e+=(char)((c-'a'+k)%26+'a');
        
        for(char c:e.toCharArray())
            d+=(char)((c-'a'-k+26)%26+'a');
        
        System.out.println(e);
        System.out.println(d);
    }
}

/*
in : HelloWorld
     5
     
out: MjqqtBtwqi
     HelloWorld
*/