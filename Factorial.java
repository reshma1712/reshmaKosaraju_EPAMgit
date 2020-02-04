public class Factorial {
	public static void main(String[] args) {
	 	System.out.println(Count(10));
	}
	public static int  Count(int n) {
System.out.println(n);
int i,m,r;
double fact = 1;
int sum = 0;
for( i = 100; i>=1; i--){
System.out.println("hi");
fact = fact*i;
}
System.out.println(fact);
while(fact >0)
{
r = (int)fact%10;
sum = sum + r;
fact = fact/10;
}

return sum;
}
}