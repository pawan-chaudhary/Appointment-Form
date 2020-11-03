public class ExceptionSample {
public static void main (String args [ ]) {
try {
int a[ ] = new int[0]; // the last element is a[9], without a[10].
if ( a[10] >0 ) throw new ArrayIndexOutOfBoundsException("Error"); // throw
}
catch ( ArrayIndexOutOfBoundsException e) {
System.out.println (e); // alert
}}}