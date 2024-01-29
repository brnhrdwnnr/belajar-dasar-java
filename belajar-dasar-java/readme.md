Pengenalan Java

James Gosling 1995
write once run anywhere

Java Standard Edition
JRE Java Runtime Environment
JDK Java Development Kit biasanya include JRE

Proses development program java

JDK akan compile kode java (file.java) menjadi java binary (file.class)
file.class ini yg akan dijalankan dengan menggunakan JRE

OpenJDK
https://openjdk.java.net

Download OpenJDK
https://jdk.java.net

Setting Path
https://medium.com/programmer-zaman-now/setting-java-path-di-windows-4da2c65d8298

# Add to .bashrc or .profile or .zshrc

export JAVA_HOME="/Library/Java/JavaVirtualMachines/jdk1.8.0_241.jdk/Contents/Home"
export PATH="$JAVA_HOME/bin:$PATH

IDE Integrated Development Environment
smart editor untuk edit program


untuk membuat public static void main di java ketikan psvm maka akan auto complete

public class HelloWorld {    
    public static void main(String[] args) {
    
    }
}

TIpe data number
    integer number
        byte -128 to 127, size 1 byte
        short -32 768 to 32 767, size 2 bytes
        int -2 147 483 648 to 2147483647, size 4 bytes
        long - 9 223 372 036 854 775 808 to 9 223 372 036 854 775 807, size 8 bytes
    contoh:
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 1000000;
        long iniLong = 1000000;
        long iniLong2 = 1000000L;
    floating point number
        float 3.4e-038 to 3.4e+038, size 4 bytes
        double 1.7e-308 to 1.7e+308 size 8 bytes
    literals
        int decimalInt = 25;
        int hexInt = 0xA132B; (0x hex)
        int binInt = 0b01010101; (0b bin)
    underscore
        long balance = 1_000_000_000_000L;
        int sum = 60_000_000;

Konversi tipe data number
    widening casting (otomatis): byte -> short -> int -> long -> float -> double
    narrowing casting (manual): double -> float -> long -> int -> char -> short -> byte

Tipe data character
    char e = 'E';
    char k = 'K';
    char o = 'O';

Tipe data boolean
    boolean benar = true;   
    boolean salah = falase;

Tipe data string
    String misal = "string";
    Default value String adalah null

Tipe data variable
    variable adalah tempat menyimpan data

    var name;
    name = "Ben"; > akan error

kata kunci final
    final tidak bisa di reassign


Tipe data bukan primitif
    number, char boolean adalah tipe data primitif
    string termasuk tipe data bukan primitif
    tipe data bukan primitif bisa memiliki method/function


byte short int long float double char boolean=> primitif
Byte Short Integer Long Float Double Character Boolean => non primitif



Tipe data array
    array kumpulan data dengan tipe yang sama

Operasi matematika
    + jumlah
    - kurang
    * kali
    / bagi
    % sisa bagi

augmented assignments
a = a + 10 => a += 10
a = a - 10 => a -= 10
a = a * a *= 10
a = a / 10 => a /= 10
a = a % 10 => a %= 10

unary operator

++ a = a + 1
-- a = a - 1
- negatif
+ positif
! boolean kebalikan

Operasi perbandingan
>
<
>=
<=
==
!=

Operasi boolean
&&
||
!
 
Expression, statement & block

if statement
else statement
Switch statement
Switch lambda
yield
ternary operator
for loop
while loop
do while loop
break and continue
for each

Method
method parameter
method return  value
method variable argument
method overloading
recursive method
scope
komentar






 







