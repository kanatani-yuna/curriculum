for (let i = 1; i <= 100; i++) {

//3の倍数かつ5の倍数のとき、 FizzBuzz!! と出力します。(15の倍数、と考えるのはナシです。)
if ( i % 3 == 0 && i % 5 == 0)
    console.log("FizzBuzz!!");

//3の倍数のとき、 Fizz! と出力します。
else if ( i % 3 == 0 ) 
    console.log("Fizz!");
 
//5の倍数のとき、 Buzz! と出力します。
else if ( i % 5 == 0 )
    console.log("Buzz!");

//3の倍数でも、5の倍数でもない場合は、その数を出力します。
else
    console.log(i);   
}