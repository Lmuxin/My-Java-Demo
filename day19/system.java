import java.io.*;
    import java.util.*;
        
     class SystemDemo
     {

         public static void main(String[] args) throws IOException
         {
           Properties prop=System.getProperties();
           prop.list(new PrintStream("system.txt"));//把系统信息打印到文件里
         }
     }

