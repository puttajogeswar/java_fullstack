//loops-1(Bright It Career 10 times print)

/**public class Loops{
public static void main(String[] args){
int i;
for(i=0;i<10;i++){
System.out.println("Bright It Career");
}
}
}*/

//loops-2(1 to 20 numbers print)

/**public class Loops{
public static void main(String[] args){
int i=1;
while(i<=20){
System.out.println(i);
i++;
}
}
}*/

//loops-3(Equal or not equal)

/**class Loops{
public static void main(String [] args){
int a=10;
int b=10;
if(a==b){
System.out.println("a and b is equal");
}
else{
System.out.println("a is not equal b");
}
}
}*/

//loop-4(odd or even)

import java.util.Scanner;
class Loops {
public static void main(String[] args) {
Scanner s1=new Scanner(System.in);
System.out.println("Enter the upper limit:");
int n=s1.nextInt();
System.out.println("\nEven numbers are:");
for(int i=1;i<=n;i++) {
if(i%2==0) {
System.out.print(i+" ");
}
}
System.out.println("\nOdd numbers are:");
for(int i=1;i<=n;i++) {
if(i%2==1) {
System.out.print(i+" ");
}
}
}
}

//loop-5(largest number among 3)

/*import java.util.Scanner;
public class Loops{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the first value ");
int a=sc.nextInt();
System.out.print("Enter the second value ");
int b=sc.nextInt();
System.out.print("Enter the third value ");
int c=sc.nextInt();
if(a==b && a==c){
System.out.print("a,b,c are the same ");
}
else if(a>b && a>c){
System.out.print("a is larger");
}
else if(b>a && b>c){
System.out.print("b is larger");
}
else if(c>a && c>b){
System.out.print("c is larger");
}
else if(a==b && a>c){
System.out.print("a,b, are the larger ");
}
else if(b==c && b>a){
System.out.print("b,c are the larger ");
}
else{
System.out.print("a,c are the larger ");
}
}
}**/


//loop-6((Even numbers b/w 10 to 100)

/**class Loops{
public static void main(String [] args){
int a=10;
System.out.println("Even Numbers are ");
while(a<=100){

if(a%2==0){
System.out.print(" "+a);
}
a++;
}
}
}*/

//loop-7(1 to 10 numbers using do while loop)

/**public class Loops{
public static void main(String[] args){
int i=1;
do{
System.out.println(i);
i++;
}while(i<=10);
}
}*/

//loop-8(Armstrong number)

/**import java.util.Scanner;
public class Loops{
public static void main(String[] args){
int i,num;
int res=0;
int sum,original;
Scanner s=new Scanner(System.in);
System.out.println("Enter a Number");
num=s.nextInt();
original=num;
while(num>0){
int temp;
temp=num%10;
res=res+(int)Math.pow(temp,3);
num=num/10;
}
if(res==original){
System.out.println("Arm strong number");
System.out.println(res);
}
else{
System.out.println("Not a arm strong number");
System.out.println(res);
}
}
}*/



//loop-9(prime or not)
/**import java.util.Scanner;
public class Loops{
public static void main(String[] args){
int i,num,count=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
num=s.nextInt();
if(num<=1){
System.out.println("Invalid");
return ;
}
for(i=2;i<Math.sqrt(num);i++){
if(num%i==0){
count=count+1;
}
}
if(count>=1){
System.out.println(" not Prime");
}
else{
System.out.println("Prime");
}
}
}*/

//loop-10(palindrome)

/**import java.util.Scanner;
public class Loops{
public static void main(String[] argsd){
Scanner s=new Scanner(System.in);
System.out.print("Enter a string ");
String st=s.next();
st=st.toLowerCase();
String rev="";
for(int i=st.length()-1;i>=0;i--){
rev=rev+st.charAt(i);
}
if(st.equals(rev)){
System.out.println("Given string is palindrome");
}
else{
System.out.println("Given string is not a palindrome");
}
}
}*/


//loop-11(Even or odd use switch)

/**import java.util.Scanner;
public class Loops{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter a Number");
int num=s.nextInt();
switch(num%2){
case 0:
System.out.println("Even");
break;
case 1:
System.out.println("odd");
break;
default:
System.out.println("Enter a Number");
}
}
}*/

//loop-12(Male or female use switch)

/**import java.util.Scanner;
public class Loops{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter a Character");
char num=s.next().charAt(0);
num=Character.toLowerCase(num);
switch(num){
case 'm':
System.out.println("male");
break;
case 'f':
System.out.println("female");
break;
default:
System.out.println("Enter a Number");
}
}
}*/

//loop-13(largest number among 3 using if else)


/*import java.util.Scanner;
public class Loops{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the first value ");
int a=sc.nextInt();
System.out.print("Enter the second value ");
int b=sc.nextInt();
System.out.print("Enter the third value ");
int c=sc.nextInt();
if(a==b && a==c){
System.out.print("a,b,c are the same ");
}
else if(a>b && a>c){
System.out.print("a is larger");
}
else if(b>a && b>c){
System.out.print("b is larger");
}
else if(c>a && c>b){
System.out.print("c is larger");
}
else if(a==b && a>c){
System.out.print("a,b, are the larger ");
}
else if(b==c && b>a){
System.out.print("b,c are the larger ");
}
else{
System.out.print("a,c are the larger ");
}
}
}**/
