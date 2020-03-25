import java.util.*;
import java.io.*;
import java.lang.*;
public class Library {
public static void main(String args []) throws Exception{
System.out.println("******************************");
System.out.println("Welcome to the library of MUJ");
System.out.println("******************************");
Scanner sc =new Scanner(System.in);
do{
System.out.println("Please select from the following menu");
System.out.println("1 - New user \n2 - Old User");
System.out.println("Enter Choice");
int ch =sc.nextInt();
switch(ch)
{
case 1:
signUp();
break;
case 2:
login();
break;
default:
return;
}
}while(true);
}
public static void signUp()throws IOException{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Registration Number");
String id = sc.nextLine();
System.out.println("Enter D.O.B in ddmmyy format");
String pass = sc.next();
System.out.println("Enter Name");
String name = sc.next();
System.out.println("Enter Semester");

String semester = sc.next();
System.out.println("You have Successfully Signed up");
String data = id+" "+pass+" "+name+" "+semester;
FileOutputStream fo = new FileOutputStream(id+".txt");
fo.write(data.getBytes());
}

public static void login()throws IOException
{
Scanner sc =new Scanner(System.in);
String data;
System.out.println("Enter Registration Number");
String id = sc.next();
FileInputStream fs =new FileInputStream(id+".txt");
BufferedReader br = new BufferedReader(new InputStreamReader(fs));
Console c =System.console();
System.out.println("Enter DOB in ddmmyyyy format :");
String pass = String.valueOf(c.readPassword());
while((data = br.readLine())!= null)
{
String s[] = data.split(" ");
if(s[0].equals(id)&&s[1].equals(pass))
{
System.out.println("You have successfully logged in");
System.out.println("Plz select from the following menu\n1.Take new book \n2.Return book");


int sel = sc.nextInt();
switch(sel)
{
case 1:
newBook(id);
System.out.println("You have successfully selected this book");
break;
case 2:
System.out.println("Enter user id");
returnBook(sc.next());

// System.out.println("you have successfully returned this book");

break;
default:
return;
}
}

}
}
public static void newBook(String id) {
System.out.println("Select from the following Branches \n1. SCIT\r\n" +

"2. ELECTRONICS\r\n" +
"3. MECHANICAL\r\n" +
"4. CHEMICAL\r\n" +
"5. CIVIL\r\n" +
"");

Scanner sc =new Scanner(System.in);
int bk = sc.nextInt();
switch(bk)
{
case 1:
scit(id);
break;
case 2:
elec(id);
break;
case 3:
mech(id);
break;
case 4:
chem(id);
break;
case 5:
civil(id);
break;
}

}
public static void scit(String id) {
System.out.println("Enter the book name that you want \n Maths\r\n" +

" DS\r\n" +
" COA\r\n" +
" STLD\r\n" +
" JAVA\r\n" +
"");

Scanner sc =new Scanner(System.in);

System.out.println("Select a book from these");
String book = sc.next();
try {
FileOutputStream fs = new FileOutputStream(id+".txt",true);
String data = " scit "+book;
fs.write(data.getBytes());
}
catch(Exception e) {}
}
public static void elec(String id) {
System.out.println("Enter the book name that you want \n Signal\r\n" +

" Network\r\n" +
" Comm\r\n" +
" Maths\r\n" +
" Circuits\r\n" +
"");

Scanner sc =new Scanner(System.in);
System.out.println("Select a book from these");
String book = sc.next();
try {
FileOutputStream fs = new FileOutputStream(id+".txt",true);
String data = " elec "+book;
fs.write(data.getBytes());
}
catch(Exception e) {}
}
public static void mech(String id) {
System.out.println("Enter the book name that you want \n SOM\r\n" +

" TOM\r\n" +
" Maths\r\n" +
" ECO\r\n" +
" Fluid\r\n" +
"");

Scanner sc =new Scanner(System.in);
System.out.println("Select a book from these");
String book = sc.next();
try {
FileOutputStream fs = new FileOutputStream(id+".txt",true);
String data = " mech "+book;
fs.write(data.getBytes());
}
catch(Exception e) {}
}