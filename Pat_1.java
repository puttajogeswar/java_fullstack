//pattern-1
/**public class Pat_1{
public static void main(String[] args){
int i,n;
n=6;
for(i=0;i<n;i++){
for (int j=0;j<n;j++){
System.out.print(" * ");
}

System.out.println("\n");
}
}
}*/

//pattern-2

/**public class Pat_1{
public static void main(String[] args){
int i,n;
n=6;
for(i=1;i<n;i++){
for (int j=1;j<n;j++){
System.out.print(" "+i+" ");
}

System.out.println("\n");
}
}
}*/


//pattern-3
/**public class Pat_1{
public static void main(String[] args){
int i,n;
n=6;
for(i=1;i<n;i++){
for (int j=1;j<n;j++){
System.out.print(" "+j+" ");
}

System.out.println("\n");
}
}
}*/

//pattern-4
/**public class Pat_1{
public static void main(String[] args){
int i,n,j;
n=5;
int num=1;
for(i=1;i<n+1;i++){
for(j=1;j<n+1;j++){
System.out.print(num+" "+"\t");
num++;
}
System.out.println();
}
}
}*/

//pattern-5

/**public class Pat_1{
public static void main(String[] args){
int i,n,j;
n=5;
int num=1;
for(i=1;i<n+1;i++){
for(j=1;j<n+1;j++){
System.out.print(num+" "+"\t");
num++;
if(num>9){
num=1;
}
}
System.out.println();
}
}
}*/

//pattern-6

/**public class Pat_1{
public static void main(String[] args){
int i,n,j;
n=5;
int num=1;
for(i=1;i<n+1;i++){
for(j=1;j<n+1;j++){
System.out.print(num+" "+"\t");
num+=2;
}
System.out.println();
}
}
}*/

//pattern-7
/**public class Pat_1{
public static void main(String[] args){
int i,j;
for(i=0;i<5;i++){
for(j=0;j<5;j++){
if(j%2==0){
System.out.print("1 ");
}
else{
System.out.print("0 ");
}
}
System.out.println( );
}
}
}*/

//pattern-8

/**public class Pat_1{
public static void main(String[] args){
int i,n;
n=5;
for(i=1;i<(n+1);i++){
for(int j=i;j<n;j++){
System.out.print(" ");
}
for(int k=0;k<i;k++){
System.out.print(" *");
}
System.out.println(" ");
}
}
}*/


//pattern-9

/**public class Pat_1{
public static void main(String[] args){
int i,n,num;
n=5;
num=2;
for(i=1;i<(n+1);i++){
for(int j=i;j<n;j++){
System.out.print(" ");
}
for(int k=0;k<i;k++){
System.out.print(" "+num);
num=num+2;
}
num=2;
System.out.println(" ");
}
}
}*/

//pattern-10

/**public class Pat_1{
public static void main(String[] args){
String a="INDIA";
int i,j;
for(i=1;i<=5;i++){
for(j=0;j<i;j++){
System.out.print(" "+a.charAt(j));
}
System.out.println();
}
}
}*/

//pattern-11

/**public class Pat_1{
public static void main(String[] args){
int i,n;
n=5;
int num=1;
for(i=1;i<(n+1);i++){
for(int j=i;j<n;j++){
System.out.print(" ");
}
for(int k=0;k<num;k++){
System.out.print("*");
}
num+=2;
System.out.println(" ");
}
}
}*/

//pattern-12

/**public class Pat_1{
public static void main(String[] args){
int i,j,num;
int n=7;
num=1;
for(i=1;i<=n;i++){
for(j=1;j<=n-num;j++){
System.out.print(" ");
}
for(int k=0;k<num;k++){
System.out.print(" *");
}
if(i<4){
num+=2;
}
else{
num-=2;
}
System.out.println();
}
}
}*/

//pattern-13

//pattern-14

/**public class  Pat_1{
public static void main(String[] args){
int i,j;
int k;
int n=6;
for(i=1;i<n;i++){

if(i==1 || i==(n-1)){
for(j=1;j<=n;j++){
System.out.print("*");
}
System.out.println();
}

else{

System.out.print("*");
for(k=0;k<(n-2);k++){
System.out.print(" ");
}
System.out.println("*");

}
}
}
}*/

//pattern-15

/**public class Pat_1{
public static void main(String[] args){
int i,j;
int n=7;
for(i=0;i<n;i++){
for(j=0;j<n;j++){
if(i==((n/2)+1)){
for(int k=0;k<n;k++){
System.out.println("*");
}
}
}
else{
for(int e=0;e<((n/2)+1);e++){
System.out.print(" ");
}
System.out.println("*");
}
}
}
}wrong */




