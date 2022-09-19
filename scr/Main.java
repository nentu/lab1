package ru.ifmo.se;
/*
Лабораторная работа №1 
Вариант 311966
автор Зайцев Артём, студент университета ИТМО. Группа P3119
*/

/*
Это основной и единственный класс, в котором реализовано выполнение задания ЛБ
*/
public class Main{
	/*
	Первая собственная функция возвращает рандомное число в диапазоне между -13 и 10
	Тк функция Math.random() возвращает число [0, 1), то было принято решение умножать значение фанкции Math.random на 24, чтобы получать
	число в диапазоне [0, 24) и вычитать 13, тогда получаются числа в диапазоне [-13, 11). И, если получается число > 10 (10.234), то функция возвращает 10
	Возвращает рандомное float число в диапазоне [-13, 10]
	*/
	public static float getRandom(){
		var t = (float) (Math.random()*24-13.0);
		if (t>10) return (float) 10;
		else return t;
	}
	/*
	Вторая собственная функция, которая на вход получает матрицу и выводит её ввиде таблицы
	На вход принимает a - двумерный массив типа float который требуется вывести
	*/
	public static void printMatrix(double[][] a){
		for (int i=0; i<a.length; i++){
			for (int j=0; j<a[0].length;j++){
				System.out.printf("%.2f ", a[i][j]);
        System.out.print("\t");
			}
			System.out.println("");
		}
	}
	
	/*
	Основной метод main. В нем происходит выполнение заданий согласно варианту ЛБ.
	*/
	public static void main(String[] args){
		//c- массив типа long длинною в 5 элементов, состоящий из нечетных чисел от 7 до 15
		var c = new long[5];
		for(int i=0; i< c.length; i++){
			c[i] = 7 + i*2;
		}
		
		//Вывод массива c
		System.out.println("c:");
		for(int i=0; i< c.length; i++){
			System.out.print(c[i]+" ");
		}
		System.out.println("\n");
		
		// х - массив типа float, состоящий из 13 рандомных чисел от функции getRandom
		var x = new float[13];
		for (int i=0;i<x.length;i++){
			x[i] = getRandom();
		}
		//Вывод x
		System.out.println("x:");
		for (int i=0;i<x.length;i++){
			System.out.print(x[i]+" ");
		}
		System.out.println("\n");

		
		//k- двумерный массив 13*5 типа double
		var k = new double[5][13];

		//выполнение основной части ЛБ
		for (int i=0;i<k.length;i++){
			for (int j=0;j<k[0].length;j++){
				
				var X = x[j];
				
				if (c[i] == 9){
					k[i][j] = Math.tan( Math.pow( ( ( Math.pow(X, X*(X - 1.0) ) + 0.5 ) / 1.0 / 3.0 ) , Math.log(Math.abs(X)) ) );
				}
				else if (c[i] == 7 | c[i] == 15){
					k[i][j] = Math.atan((X - 1.5)/23.0);
				}
				else{
					k[i][j] = Math.sin( Math.log( Math.abs( Math.pow( Math.cos(X)/(4.0 - Math.asin( (X-1.5)/23.0 )) , 2) ) ) );
				}
			}
		}
		
		//Вывод матрицы k через функцию printMatrix
		System.out.println("k:");
		printMatrix(k);

	}
}