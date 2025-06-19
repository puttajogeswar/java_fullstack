//loops-1

/**public class Loops{
public static void main(String[] args){
int i;
for(i=0;i<10;i++){
System.out.println("Bright It Career");
}
}
}*/

//loops-2

/**public class Loops{
public static void main(String[] args){
int i=1;
while(i<=20){
System.out.println(i);
i++;
}
}
}*/

//loops-3

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

//loop-4

//loop-5

//loop-6

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

//loop-7

/**public class Loops{
public static void main(String[] args){
int i=1;
do{
System.out.println(i);
i++;
}while(i<=10);
}
}*/

//loop-8

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



//loop-9
import java.util.Scanner;
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
}

//loop-10

//loop-11

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

//loop-12

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

//loop-13


