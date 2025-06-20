//array-1
/**import java.util.Scanner;
public class Array{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a[]=new int[5];
int sum=0;
for(int i=0;i<5;i++){
System.out.println("Enter the "+(i+1)+"value");
a[i]=s.nextInt();
}
System.out.println("The output is");
for(int i=0;i<5;i++){
sum=sum+a[i];
}
System.out.println(sum);
}
}*/

//array-2

/**import java.util.Scanner;
public class Array{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a[]=new int[5];
float res=0;
for(int i=0;i<5;i++){
System.out.println("Enter the "+(i+1)+"value");
a[i]=s.nextInt();
}
for(int i=0;i<5;i++){
res=(res+a[i]);
}
res=res/5;
System.out.println("The output is"+res);
}
}*/

//array-3

/**import java.util.Scanner;
public class Array{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a[]=new int[5];
int index=0;
for(int i=0;i<5;i++){
System.out.println("Enter the "+(i+1)+"value");
a[i]=s.nextInt();
}
System.out.println("Enter the element");
int val=s.nextInt();
for(int i=0;i<a.length;i++){
if(a[i]==val){
index=i;
}
}
if(index==0){
System.out.println("Element not found");
}
else{
System.out.println("The element "+val+ " index is "+index);
}
}
}*/

//array-4

/**import java.util.Scanner;
public class Array{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a[]=new int[5];
for(int i=0;i<5;i++){
System.out.println("Enter the "+(i+1)+"value");
a[i]=s.nextInt();
}
System.out.println("Enter a number");
int no=s.nextInt();
search(a,no);
}
public static void search(int[] a,int no){
int count=0;
for(int i=0;i<=4;i++){
if(a[i]==no){
count+=1;
}
}
if(count>=1){
System.out.println(no+" found");
}
else{
System.out.println("Not found");
}
}
}*/

//array-5

/**import java.util.Scanner;
public class Array{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a[]=new int[5];
for(int i=0;i<5;i++){
System.out.println("Enter the "+(i+1)+"value");
a[i]=s.nextInt();
}
System.out.println("Enter the removed value");
int val=s.nextInt();
Array ar=new Array();
ar.remove(a,val);
}
public  void remove(int[] a,int val){
int index=-1;
for(int i=0;i<5;i++){
if(a[i]==val){
index=i;
break;
}
}
for(int i=index;i<a.length-1;i++){
a[i]=a[i+1];
}
for(int k=0;k<a.length-1;k++){
System.out.println(a[k]);
}
}
}*/

//array-6

/**import java.util.Scanner;
public class Array{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a[]=new int[5];
for(int i=0;i<5;i++){
System.out.println("Enter the "+(i+1)+"value");
a[i]=s.nextInt();
}
int b[]=new int[5];
for(int i=0;i<5;i++){
b[i]=a[i];
}
for(int j=0;j<5;j++){
System.out.println(b[j]);
}

}
}*/

//array-7


//array-8


/**import java.util.Scanner;
public class Array{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a[]=new int[5];
for(int i=0;i<5;i++){
System.out.println("Enter the "+(i+1)+" value");
a[i]=s.nextInt();
}
Array ar=new Array();
ar.max(a,0,a[0]);
}
public void max(int []a,int max_value,int min_value){
for(int i=0;i<a.length;i++){
if(a[i]>max_value){
max_value=a[i];
}
if(a[i]<min_value){
min_value=a[i];
}
}
System.out.println("Maximum number is : "+max_value);
System.out.println("Minimum number is : "+min_value);
}
}*/


//array-9

/**import java.util.Scanner;
public class Array{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a[]=new int[5];
for(int i=0;i<5;i++){
System.out.println("Enter the "+(i+1)+" value");
a[i]=s.nextInt();
}
int rev[]=new int[5];
int len=a.length-1;
for(int j=0;j<a.length;j++){
rev[j]=a[len];
len--;
}
System.out.print("The output is ");
for(int i=0;i<5;i++){
System.out.print(" "+rev[i]);
}
}
}*/

//array-10

//array-11

//array-12

//array-13

/**import java.util.Scanner;
public class Array{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a[]=new int[5];
for(int i=0;i<5;i++){
System.out.println("Enter the "+(i+1)+" value");
a[i]=s.nextInt();
}
Array ar=new Array();
ar.max(a,0,0);
}
public void max(int []a,int max_value,int second_largest){
for(int i=0;i<a.length;i++){
if(a[i]>max_value){
max_value=a[i];
}
}
for(int i=0;i<a.length;i++){
if(a[i]>second_largest && a[i]!=max_value){
second_largest=a[i];
}
}
System.out.println("Maximum number is : "+max_value);
System.out.println("Second largest number  is : "+second_largest);
}
}*/

//array-14

/**import java.util.Scanner;
public class Array{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a[]=new int[5];
for(int i=0;i<5;i++){
System.out.println("Enter the "+(i+1)+" value");
a[i]=s.nextInt();
}
Array ar=new Array();
ar.max(a,0,0);
}
public void max(int []a,int max_value,int second_largest){
for(int i=0;i<a.length;i++){
if(a[i]>max_value){
max_value=a[i];
}
}
for(int i=0;i<a.length;i++){
if(a[i]>second_largest && a[i]!=max_value){
second_largest=a[i];
}
}
System.out.println("Maximum number is : "+max_value);
System.out.println("Second largest number  is : "+second_largest);
}
}*/




//array-15

/**import java.util.Scanner;
public class Array{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a[]=new int[5];
for(int i=0;i<5;i++){
System.out.println("Enter the "+(i+1)+" value");
a[i]=s.nextInt();
}
Array ar=new Array();
ar.even_odd(a);
}
public void even_odd(int []a){
int even=0;
int odd=0;
for(int i=0;i<a.length;i++){
if(a[i]%2==0){
even++;
}
else{
odd++;
}
}
System.out.println("No. of even numbers : "+even);
System.out.println("No. of odd numbers : "+odd);
}
}*/

//array-16

/**import java.util.Scanner;
public class Array{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a[]=new int[5];
for(int i=0;i<5;i++){
System.out.println("Enter the "+(i+1)+" value");
a[i]=s.nextInt();
}
Array ar=new Array();
ar.max(a,0,a[0]);
}
public void max(int []a,int max_value,int min_value){
for(int i=0;i<a.length;i++){
if(a[i]>max_value){
max_value=a[i];
}
if(a[i]<min_value){
min_value=a[i];
}
}
System.out.println("Maximum number is : "+max_value);
System.out.println("Minimum number is : "+min_value);
System.out.println("Difference between maximum and minimum number is : "+(max_value-min_value));
}
}*/



