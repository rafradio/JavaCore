# Java Core.
## Первый семинар 
#### Студент GeekBrains: Рафаиль Абдюшев
#### GU | Программирование | 6 | 3522 | 06.12.2023

<br>

## Компиляция кода.
## Docker.

* src - приложение
    > main - основной код<br>
    > test - тесты<br>

* javac -sourcepath ./java -d out java/com/rafael/lessonjava/Lessonjava.java
    > компиляция кода<br>

* java -classpath ./out com.rafael.lessonjava.Lessonjava 
    > запуск приложения<br>

* docker build -f resources/Dockerfile2 . -t lesson1_3:v2
    > создание имиджа в докере<br>

* docker run lesson1_3:v1 
    > запуск контейнера<br>
    




   






    


